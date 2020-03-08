package com.lagou.edu;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LagouBean implements InitializingBean {
	@Autowired
	private ItBean itBean;

	/**
	 * 构造函数
	 */
	public LagouBean() {
		System.out.println("LagouBean 构造器...");
	}

	/**
	 * InitializingBean 接⼝实现
	 */
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("LagouBean afterPropertiesSet...");
	}
}
