package org.dromara.boot.constant;

/**
 * 全局的key常量 (业务无关的key)
 *
 * @author Lion Li
 */
public interface GlobalConstants {

    /**
     * 全局 redis key (业务无关的key)
     */
    String GLOBAL_REDIS_KEY = "global:";

    /**
     * 验证码 redis key
     */
    String CAPTCHA_CODE_KEY = GLOBAL_REDIS_KEY + "captcha_codes:";

    /**
     * 防重提交 redis key
     */
    String REPEAT_SUBMIT_KEY = GLOBAL_REDIS_KEY + "repeat_submit:";

    /**
     * 限流 redis key
     */
    String RATE_LIMIT_KEY = GLOBAL_REDIS_KEY + "rate_limit:";

    /**
     * 三方认证 redis key
     */
    String SOCIAL_AUTH_CODE_KEY = GLOBAL_REDIS_KEY + "social_auth_codes:";

    /**
     * 本项目基础包扫描
     */
    String[] BASE_PACKAGES = {"org.dromara.boot", "org.dromara.system", "org.dromara.auth", "org.dromara.generator", "org.dromara.job", "org.dromara.workflow", "org.dromara.demo", "org.dromara.oss", "org.dromara.monitor", "org.dromara.captcha"};
}
