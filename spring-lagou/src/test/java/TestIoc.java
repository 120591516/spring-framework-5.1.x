import com.lagou.edu.LagouBean;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestIoc {
	/**
	 * Ioc 容器源码分析基础案例
	 */
	@Test
	public void testIoC() {
		//ApplicationContext是容器的高级接口，BeanFactory
		ApplicationContext applicationContext = new
				ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		LagouBean lagouBean = applicationContext.getBean(LagouBean.class);
		System.out.println(lagouBean);
	}
}
