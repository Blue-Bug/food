package food.domain;

import food.domain.*;
import food.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class DeliveryStarted extends AbstractEvent {

    private Long id;
    private String customerId;
    private String address;
    private String orderId;
    private String status;
}
