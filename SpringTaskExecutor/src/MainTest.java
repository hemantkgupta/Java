import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext context = 
				  new ClassPathXmlApplicationContext("spring-scheduler.xml");
		TaskExecutorExample taskExecutorExample = (TaskExecutorExample) context.getBean("taskExecutorExample");
		taskExecutorExample.printMessages();
	}

}
