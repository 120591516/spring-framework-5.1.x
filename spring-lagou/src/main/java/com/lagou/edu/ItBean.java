package com.lagou.edu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author 应癫
 */
@Component
public class ItBean {
	@Autowired
	private LagouBean lagouBean;

	/**
	 * 构造函数
	 */
	public ItBean(){
		System.out.println("com.lagou.edu.ItBean 构造器...");
	}
}
