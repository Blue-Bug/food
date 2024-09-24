package food.domain;

import food.domain.*;
import food.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class Rejected extends AbstractEvent {

    private Long id;
    private Long orderId;

    public Rejected(Cook aggregate) {
        super(aggregate);
    }

    public Rejected() {
        super();
    }
}
//>>> DDD / Domain Event
