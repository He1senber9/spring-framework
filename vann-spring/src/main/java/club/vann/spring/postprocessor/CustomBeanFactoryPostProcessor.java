package club.vann.spring.postprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

/**
 * @ClassName CustomBeanFactoryPostProcessor
 * @Description TODO
 * @User fanyu
 * @Date 2021/1/8 14:45
 */
public class CustomBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("***类：[CustomBeanFactoryPostProcessor] 方法：postProcessBeanFactory Begin");
//		CustomBean customBean = beanFactory.getBean(CustomBean.class);
//		System.out.println(customBean.getName());
		System.out.println("***类：[CustomBeanFactoryPostProcessor] 方法：postProcessBeanFactory End");
	}
}
