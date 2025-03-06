package ktphonemanagementsystem.domain;

import java.util.*;
import ktphonemanagementsystem.domain.*;
import ktphonemanagementsystem.infra.AbstractEvent;
import lombok.*;

@Data
@ToString
public class LostReportRegistered extends AbstractEvent {

    private Long phoneId;
    private Date registerTime;
    private Long id;
    private Long userId;
    private String status;
    private Date cancelTime;
}
