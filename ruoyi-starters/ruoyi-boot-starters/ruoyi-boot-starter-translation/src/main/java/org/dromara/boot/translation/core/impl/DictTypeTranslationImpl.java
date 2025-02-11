package org.dromara.boot.translation.core.impl;

import org.dromara.boot.translation.annotation.TranslationType;
import org.dromara.boot.translation.constant.TransConstant;
import org.dromara.boot.translation.core.TranslationInterface;
import org.dromara.boot.service.DictService;
import org.dromara.boot.utils.StringUtils;
import lombok.AllArgsConstructor;

/**
 * 字典翻译实现
 *
 * @author Lion Li
 */
@AllArgsConstructor
@TranslationType(type = TransConstant.DICT_TYPE_TO_LABEL)
public class DictTypeTranslationImpl implements TranslationInterface<String> {

    private final DictService dictService;

    @Override
    public String translation(Object key, String other) {
        if (key instanceof String dictValue && StringUtils.isNotBlank(other)) {
            return dictService.getDictLabel(other, dictValue);
        }
        return null;
    }
}
