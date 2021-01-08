package club.vann.spring.postprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @ClassName CustomBeanPostProcessor
 * @Description TODO
 * @User fanyu
 * @Date 2021/1/8 15:08
 */
public class CustomBeanPostProcessor implements BeanPostProcessor {
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("***类：[CustomBeanPostProcessor] 方法：postProcessBeforeInitialization " + beanName);
		return null;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("***类：[CustomBeanPostProcessor] 方法：postProcessAfterInitialization " + beanName);
		return null;
	}
}
