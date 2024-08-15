package org.dromara.auth.service;

import org.dromara.auth.domain.bo.PlatformRegisterBO;
import org.dromara.boot.domain.model.LoginUser;
import org.dromara.boot.domain.model.RegisterBody;
import org.dromara.boot.enums.LoginType;
import org.dromara.system.domain.vo.SysUserVo;

import java.util.function.Supplier;

/**
 * 注册
 */
public interface ISysRegisterService {
    /**
     * 注册
     */
    void register(RegisterBody registerBody);

    /**
     * 注册
     */
    void register(PlatformRegisterBO registerBody);

    /**
     * 校验验证码
     *
     * @param username 用户名
     * @param code     验证码
     * @param uuid     唯一标识
     */
    void validateCaptcha(String tenantId, String username, String code, String uuid);


}
