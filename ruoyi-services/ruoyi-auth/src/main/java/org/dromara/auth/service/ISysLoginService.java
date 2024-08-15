package org.dromara.auth.service;

import me.zhyd.oauth.model.AuthUser;
import org.dromara.boot.domain.model.LoginUser;
import org.dromara.boot.enums.LoginType;
import org.dromara.system.domain.vo.SysUserVo;

import java.util.function.Supplier;

/**
 * 登录模块
 */
public interface ISysLoginService {

    /**
     * 绑定第三方用户
     *
     * @param authUserData 授权响应实体
     * @return 统一响应实体
     */
    void socialRegister(AuthUser authUserData);

    /**
     * 退出登录
     */
    void logout();

    /**
     * 记录登录信息
     *
     * @param tenantId 租户ID
     * @param username 用户名
     * @param status   状态
     * @param message  消息内容
     */
    void recordLogininfor(String tenantId, String username, String status, String message);

    /**
     * 校验租户
     *
     * @param tenantId 租户ID
     */
    void checkTenant(String tenantId);


    /**
     * 构建登录用户
     */
    LoginUser buildLoginUser(SysUserVo user);

    /**
     * 记录登录信息
     *
     * @param userId 用户ID
     */
    void recordLoginInfo(Long userId, String ip);

    /**
     * 登录校验
     */
    void checkLogin(LoginType loginType, String tenantId, String username, Supplier<Boolean> supplier);

}
