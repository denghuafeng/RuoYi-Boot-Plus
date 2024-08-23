package org.dromara.boot.context;

import org.dromara.boot.constant.GlobalConstants;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;
import org.springframework.lang.NonNull;

/**
 * 项目基础包扫描
 * @author 邓华锋
 */
public class RuoYiApplicationContextInitializer implements ApplicationContextInitializer<ConfigurableApplicationContext> {

    @Override
    public void initialize(@NonNull ConfigurableApplicationContext applicationContext) {
        ClassPathBeanDefinitionScanner scanner = new ClassPathBeanDefinitionScanner((BeanDefinitionRegistry) applicationContext);
        scanner.scan(GlobalConstants.BASE_PACKAGES);
    }
}
