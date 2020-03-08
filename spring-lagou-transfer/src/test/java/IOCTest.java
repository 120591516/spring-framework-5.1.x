import com.lagou.edu.dao.AccountDao;
import com.lagou.edu.service.TransferService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IOCTest {
    @Test
    public void testIoC(){
        /**
         * SE下推荐通过读取classpath下的xml文件来启动容器
         *
         */
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        //不推荐使用以下方式
//        ApplicationContext applicationContext1 = new FileSystemXmlApplicationContext("文件绝对路径");
        Object companyBean = applicationContext.getBean("companyBean");
        System.out.println(companyBean);
        AccountDao accountDao = (AccountDao) applicationContext.getBean("accountDao");
        System.out.println("accountDao:"+accountDao);
        AccountDao accountDao1 = (AccountDao) applicationContext.getBean("accountDao");
        System.out.println("accountDao1:"+accountDao1);
        applicationContext.close();
    }

    @Test
    public void testSpringBean(){
        /**
         * SE下推荐通过读取classpath下的xml文件来启动容器
         *
         */
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        Object lazyResult = applicationContext.getBean("lazyResult");
        System.out.println(lazyResult);
        applicationContext.close();
    }
    /**
     * 测试xml aop
     */
    @Test
    public void testXmlAop() throws Exception {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        TransferService transferService = applicationContext.getBean(TransferService.class);
        transferService.transfer("6029621011000","6029621011001",100);
    }


    /**
     * 测试xml-anno aop
     */
    @Test
    public void testXmlAnnoAop() throws Exception {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        TransferService transferService = applicationContext.getBean(TransferService.class);
        transferService.transfer("6029621011000","6029621011001",100);
    }
}
