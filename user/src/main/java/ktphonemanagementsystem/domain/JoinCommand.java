package ktphonemanagementsystem.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.Data;

@Data
public class JoinCommand {

    private String loginId;
    private String password;
    private String name;
}
