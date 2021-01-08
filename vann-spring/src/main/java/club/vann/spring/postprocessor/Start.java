package club.vann.spring.postprocessor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName Start
 * @Description TODO
 * @User fanyu
 * @Date 2021/1/8 14:39
 */
public class Start {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("postprocessor.xml");
		CustomBean customBean = context.getBean(CustomBean.class);
		System.out.println(customBean.getName());
	}
}
