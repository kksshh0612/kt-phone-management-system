package ktphonemanagementsystem.infra;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import javax.naming.NameParser;
import javax.naming.NameParser;
import javax.transaction.Transactional;
import ktphonemanagementsystem.config.kafka.KafkaProcessor;
import ktphonemanagementsystem.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

//<<< Clean Arch / Inbound Adaptor
@Service
@Transactional
public class PolicyHandler {

    @Autowired
    PhoneRepository phoneRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='LostReportRegistered'"
    )
    public void wheneverLostReportRegistered_PhoneLock(
        @Payload LostReportRegistered lostReportRegistered
    ) {
        LostReportRegistered event = lostReportRegistered;
        System.out.println(
            "\n\n##### listener PhoneLock : " + lostReportRegistered + "\n\n"
        );

        // Sample Logic //
        Phone.phoneLock(event);
    }
}
//>>> Clean Arch / Inbound Adaptor
