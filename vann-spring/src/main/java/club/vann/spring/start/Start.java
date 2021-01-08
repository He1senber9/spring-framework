package club.vann.spring.start;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName Start
 * @Description TODO
 * @User fanyu
 * @Date 2021/1/8 12:42
 */
public class Start {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("start.xml");
		CustomBean bean = context.getBean(CustomBean.class);
		System.out.println("Bean: " + bean.name);
	}
}
