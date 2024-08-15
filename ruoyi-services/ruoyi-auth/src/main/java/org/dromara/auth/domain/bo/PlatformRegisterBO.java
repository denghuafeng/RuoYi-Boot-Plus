package org.dromara.auth.domain.bo;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import org.dromara.boot.constant.UserConstants;
import org.hibernate.validator.constraints.Length;

import java.io.Serial;
import java.io.Serializable;

/**
 * 平台注册
 */
@Data
public class PlatformRegisterBO implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    /**
     * 名
     */
    //@NotBlank(message = "{platform.register.first.name.not.blank}")
    //private String firstName;
    /**
     * 姓
     */
    //@NotBlank(message = "{platform.register.last.name.not.blank}")
    //private String lastName;

    /**
     * 昵称
     */
    @NotBlank(message = "{user.nickname.not.blank}")
    private String nickName;

    /**
     * 邮箱
     */
    @NotBlank(message = "{user.email.not.blank}")
    @Email(message = "{user.email.not.valid}")
    private String email;

    /**
     * 密码
     */
    @NotBlank(message = "{user.password.not.blank}")
    @Length(min = UserConstants.PASSWORD_MIN_LENGTH, max = UserConstants.PASSWORD_MAX_LENGTH, message = "{user.password.length.valid}")
    private String password;

    /**
     * 验证码
     */
    private String code;

    /**
     * 唯一标识
     */
    private String uuid;


}
