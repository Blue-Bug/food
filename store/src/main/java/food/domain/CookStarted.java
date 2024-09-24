package food.domain;

import food.domain.*;
import food.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class CookStarted extends AbstractEvent {

    private Long id;
    private Long orderId;

    public CookStarted(Cook aggregate) {
        super(aggregate);
    }

    public CookStarted() {
        super();
    }
}
//>>> DDD / Domain Event
