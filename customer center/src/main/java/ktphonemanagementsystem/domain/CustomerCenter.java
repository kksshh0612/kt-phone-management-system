package ktphonemanagementsystem.domain;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.persistence.*;
import ktphonemanagementsystem.CustomerCenterApplication;
import lombok.Data;

@Entity
@Table(name = "CustomerCenter_table")
@Data
//<<< DDD / Aggregate Root
public class CustomerCenter {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long customerId;

    private Long counslerId;

    private String status;

    private Long phoneId;

    public static CustomerCenterRepository repository() {
        CustomerCenterRepository customerCenterRepository = CustomerCenterApplication.applicationContext.getBean(
            CustomerCenterRepository.class
        );
        return customerCenterRepository;
    }
}
//>>> DDD / Aggregate Root
