package club.vann.spring.bean;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;

/**
 * @ClassName CustomBeanB
 * @Description TODO
 * @User fanyu
 * @Date 2021/1/8 14:56
 */
public class CustomBeanB implements BeanNameAware, InitializingBean {
	private String id;
	private String name;

	public CustomBeanB() {
		System.out.println("***类：CustomBeanB 方法：构造方法 ");
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("***类：CustomBeanB 方法：setName ");
		this.name = name;
	}

	public void initMethod() {
		System.out.println("***类：CustomBeanB 方法：initMethod ");
	}

	@Override
	public void setBeanName(String name) {
		System.out.println("***类：CustomBeanB 方法：setBeanName ");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("***类：CustomBeanB 方法：afterPropertiesSet ");
	}
}
