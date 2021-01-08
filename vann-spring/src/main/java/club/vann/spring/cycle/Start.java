package club.vann.spring.cycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName Start
 * @Description TODO
 * @User fanyu
 * @Date 2021/1/8 14:11
 */
public class Start {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("cycle.xml");
		CustomBeanA customBeanA = context.getBean(CustomBeanA.class);
		CustomBeanB customBeanB = context.getBean(CustomBeanB.class);

		System.out.println("CustomA: " + customBeanA.getName());
		System.out.println("CustomB: " + customBeanB.getName());
	}
}
