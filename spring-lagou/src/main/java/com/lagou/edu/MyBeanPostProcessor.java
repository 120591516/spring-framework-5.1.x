package com.lagou.edu;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor {
	public MyBeanPostProcessor() {
		System.out.println("BeanPostProcessor 实现类构造函数...");
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName)
			throws BeansException {
		if ("lagouBean".equals(beanName)) {
			System.out.println("BeanPostProcessor 实现类postProcessBeforeInitialization ⽅法被调⽤中......");
		}
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName)
			throws BeansException {
		if ("lagouBean".equals(beanName)) {
			System.out.println("BeanPostProcessor 实现类postProcessAfterInitialization ⽅法被调⽤中......");
		}
		return bean;
	}
}
