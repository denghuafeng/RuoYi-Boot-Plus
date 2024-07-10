package org.dromara.boot.translation.core.impl;

import org.dromara.boot.translation.annotation.TranslationType;
import org.dromara.boot.translation.constant.TransConstant;
import org.dromara.boot.translation.core.TranslationInterface;
import org.dromara.boot.service.DeptService;
import lombok.AllArgsConstructor;

/**
 * 部门翻译实现
 *
 * @author Lion Li
 */
@AllArgsConstructor
@TranslationType(type = TransConstant.DEPT_ID_TO_NAME)
public class DeptNameTranslationImpl implements TranslationInterface<String> {

    private final DeptService deptService;

    @Override
    public String translation(Object key, String other) {
        if (key instanceof String ids) {
            return deptService.selectDeptNameByIds(ids);
        } else if (key instanceof Long id) {
            return deptService.selectDeptNameByIds(id.toString());
        }
        return null;
    }
}
