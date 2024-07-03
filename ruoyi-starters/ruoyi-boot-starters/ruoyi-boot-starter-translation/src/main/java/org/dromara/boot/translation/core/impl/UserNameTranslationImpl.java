package org.dromara.boot.translation.core.impl;

import org.dromara.boot.translation.annotation.TranslationType;
import org.dromara.boot.translation.constant.TransConstant;
import org.dromara.boot.translation.core.TranslationInterface;
import org.dromara.common.core.service.UserService;
import lombok.AllArgsConstructor;

/**
 * 用户名翻译实现
 *
 * @author Lion Li
 */
@AllArgsConstructor
@TranslationType(type = TransConstant.USER_ID_TO_NAME)
public class UserNameTranslationImpl implements TranslationInterface<String> {

    private final UserService userService;

    @Override
    public String translation(Object key, String other) {
        if (key instanceof Long id) {
            return userService.selectUserNameById(id);
        }
        return null;
    }
}
