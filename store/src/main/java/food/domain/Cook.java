package food.domain;

import food.StoreApplication;
import food.domain.Accepted;
import food.domain.CookFinished;
import food.domain.CookStarted;
import food.domain.Rejected;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Cook_table")
@Data
//<<< DDD / Aggregate Root
public class Cook {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long orderId;

    private String foodId;

    private String option;

    private String status;

    @PostPersist
    public void onPostPersist() {
        Accepted accepted = new Accepted(this);
        accepted.publishAfterCommit();

        Rejected rejected = new Rejected(this);
        rejected.publishAfterCommit();

        CookStarted cookStarted = new CookStarted(this);
        cookStarted.publishAfterCommit();

        CookFinished cookFinished = new CookFinished(this);
        cookFinished.publishAfterCommit();
    }

    public static CookRepository repository() {
        CookRepository cookRepository = StoreApplication.applicationContext.getBean(
            CookRepository.class
        );
        return cookRepository;
    }

    //<<< Clean Arch / Port Method
    public void accept(AcceptCommand acceptCommand) {
        //implement business logic here:

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public void start() {
        //implement business logic here:

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public void end() {
        //implement business logic here:

    }

    //>>> Clean Arch / Port Method

    //<<< Clean Arch / Port Method
    public static void loadOrderInfo(OrderPlaced orderPlaced) {
        //implement business logic here:

        /** Example 1:  new item 
        Cook cook = new Cook();
        repository().save(cook);

        */

        /** Example 2:  finding and process
        
        repository().findById(orderPlaced.get???()).ifPresent(cook->{
            
            cook // do something
            repository().save(cook);


         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
