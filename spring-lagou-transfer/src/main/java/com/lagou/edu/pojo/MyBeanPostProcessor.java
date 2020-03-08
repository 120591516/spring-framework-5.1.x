package com.lagou.edu.pojo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @author 王文腾
 * 拦截实例化之后的对象（实例化并且属性注入了）
 */
@Component
public class MyBeanPostProcessor  implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if("lazyResult".equals(beanName)){
            System.out.println("MyBeanPostProcessor postProcessBeforeInitialization 方法拦截 lazyResult");
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if("lazyResult".equals(beanName)){
            System.out.println("MyBeanPostProcessor postProcessAfterInitialization 方法拦截 lazyResult");
        }
        return bean;
    }
}
