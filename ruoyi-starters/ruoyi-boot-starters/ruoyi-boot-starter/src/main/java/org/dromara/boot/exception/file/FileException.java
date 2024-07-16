package org.dromara.boot.exception.file;

import org.dromara.boot.exception.base.BaseException;

import java.io.Serial;

/**
 * 文件信息异常类
 *
 * @author ruoyi
 */
public class FileException extends BaseException {

    @Serial
    private static final long serialVersionUID = 1L;

    public FileException(String code, Object[] args) {
        super("file", code, args, null);
    }

}
