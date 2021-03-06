package skane.skaneshop.login.dto.request;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
public class Member {

    private Long id;
    @NotEmpty
    private String loginId;
    @NotEmpty
    private String name;
    @NotEmpty
    private String password;
    @NotNull
    private int birthday;
    @NotEmpty
    private String nickname;
    @NotEmpty
    private String phoneNumber;

}
