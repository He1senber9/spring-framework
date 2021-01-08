package club.vann.spring.bean;

import club.vann.spring.postprocessor.CustomBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName Start
 * @Description TODO
 * @User fanyu
 * @Date 2021/1/8 14:54
 */
public class Start {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		CustomBeanA customBeanA = context.getBean(CustomBeanA.class);
		CustomBeanB customBeanB = context.getBean(CustomBeanB.class);

		System.out.println("CustomBeanA: " + customBeanA.getName());
		System.out.println("CustomBeanB: " + customBeanB.getName());
	}
}
