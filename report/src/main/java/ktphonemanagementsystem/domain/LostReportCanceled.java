package ktphonemanagementsystem.domain;

import java.time.LocalDate;
import java.util.*;
import ktphonemanagementsystem.domain.*;
import ktphonemanagementsystem.infra.AbstractEvent;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class LostReportCanceled extends AbstractEvent {

    private Long phoneId;
    private Date cancelTime;

    public LostReportCanceled(Report aggregate) {
        super(aggregate);
    }

    public LostReportCanceled() {
        super();
    }
}
//>>> DDD / Domain Event
