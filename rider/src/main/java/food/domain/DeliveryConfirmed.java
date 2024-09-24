package food.domain;

import food.domain.*;
import food.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class DeliveryConfirmed extends AbstractEvent {

    private Long id;
    private String customerId;
    private String address;
    private String orderId;
    private String status;

    public DeliveryConfirmed(Delivery aggregate) {
        super(aggregate);
    }

    public DeliveryConfirmed() {
        super();
    }
}
//>>> DDD / Domain Event
