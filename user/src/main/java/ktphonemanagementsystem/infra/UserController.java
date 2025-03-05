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
// @RequestMapping(value="/users")
@Transactional
public class UserController {

    @Autowired
    UserRepository userRepository;

    @RequestMapping(
        value = "/users/login",
        method = RequestMethod.POST,
        produces = "application/json;charset=UTF-8"
    )
    public User login(
        HttpServletRequest request,
        HttpServletResponse response,
        @RequestBody LoginCommand loginCommand
    ) throws Exception {
        System.out.println("##### /user/login  called #####");
        User user = new User();
        user.login(loginCommand);
        userRepository.save(user);
        return user;
    }

    @RequestMapping(
        value = "/users/join",
        method = RequestMethod.POST,
        produces = "application/json;charset=UTF-8"
    )
    public User join(
        HttpServletRequest request,
        HttpServletResponse response,
        @RequestBody JoinCommand joinCommand
    ) throws Exception {
        System.out.println("##### /user/join  called #####");
        User user = new User();
        user.join(joinCommand);
        userRepository.save(user);
        return user;
    }
}
//>>> Clean Arch / Inbound Adaptor
