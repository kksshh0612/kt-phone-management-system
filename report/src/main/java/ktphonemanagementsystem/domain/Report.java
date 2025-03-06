package ktphonemanagementsystem.domain;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.persistence.*;
import ktphonemanagementsystem.ReportApplication;
import ktphonemanagementsystem.domain.LostReportCanceled;
import ktphonemanagementsystem.domain.LostReportRegistered;
import lombok.Data;

@Entity
@Table(name = "Report_table")
@Data
//<<< DDD / Aggregate Root
public class Report {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long userId;

    private Long phoneId;

    private String status;

    private Date registerTime;

    private Date cancelTime;

    @PostPersist
    public void onPostPersist() {
        LostReportRegistered lostReportRegistered = new LostReportRegistered(
            this
        );
        lostReportRegistered.publishAfterCommit();
    }

    @PostUpdate
    public void onPostUpdate() {
        LostReportCanceled lostReportCanceled = new LostReportCanceled(this);
        lostReportCanceled.publishAfterCommit();
    }

    public static ReportRepository repository() {
        ReportRepository reportRepository = ReportApplication.applicationContext.getBean(
            ReportRepository.class
        );
        return reportRepository;
    }
}
//>>> DDD / Aggregate Root
