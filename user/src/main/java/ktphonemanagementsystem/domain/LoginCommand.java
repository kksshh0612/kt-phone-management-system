package ktphonemanagementsystem.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.Data;

@Data
public class LoginCommand {

    private String loginId;
    private String password;
}
