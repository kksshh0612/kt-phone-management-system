package ktphonemanagementsystem.infra;

import java.util.Optional;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;
import ktphonemanagementsystem.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//<<< Clean Arch / Inbound Adaptor

@RestController
// @RequestMapping(value="/customerCenters")
@Transactional
public class CustomerCenterController {

    @Autowired
    CustomerCenterRepository customerCenterRepository;
}
//>>> Clean Arch / Inbound Adaptor
