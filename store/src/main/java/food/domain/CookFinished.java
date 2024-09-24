package food.domain;

import food.domain.*;
import food.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class CookFinished extends AbstractEvent {

    private Long id;
    private Long orderId;

    public CookFinished(Cook aggregate) {
        super(aggregate);
    }

    public CookFinished() {
        super();
    }
}
//>>> DDD / Domain Event
