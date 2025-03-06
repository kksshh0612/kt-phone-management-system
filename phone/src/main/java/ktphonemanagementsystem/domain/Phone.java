package ktphonemanagementsystem.domain;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.persistence.*;
import ktphonemanagementsystem.PhoneApplication;
import lombok.Data;

@Entity
@Table(name = "Phone_table")
@Data
//<<< DDD / Aggregate Root
public class Phone {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String imei;

    private String lockStatus;

    private String userId;

    public static PhoneRepository repository() {
        PhoneRepository phoneRepository = PhoneApplication.applicationContext.getBean(
            PhoneRepository.class
        );
        return phoneRepository;
    }

    //<<< Clean Arch / Port Method
    public static void phoneLock(LostReportRegistered lostReportRegistered) {
        //implement business logic here:

        /** Example 1:  new item 
        Phone phone = new Phone();
        repository().save(phone);

        */

        /** Example 2:  finding and process
        

        repository().findById(lostReportRegistered.get???()).ifPresent(phone->{
            
            phone // do something
            repository().save(phone);


         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
