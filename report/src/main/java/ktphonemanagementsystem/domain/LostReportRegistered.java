package ktphonemanagementsystem.domain;

import java.time.LocalDate;
import java.util.*;
import ktphonemanagementsystem.domain.*;
import ktphonemanagementsystem.infra.AbstractEvent;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class LostReportRegistered extends AbstractEvent {

    private Long phoneId;
    private Date registerTime;
    private Long id;
    private Long userId;
    private String status;
    private Date cancelTime;

    public LostReportRegistered(Report aggregate) {
        super(aggregate);
    }

    public LostReportRegistered() {
        super();
    }
}
//>>> DDD / Domain Event
