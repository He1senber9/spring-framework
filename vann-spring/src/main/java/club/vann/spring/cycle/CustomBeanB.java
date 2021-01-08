package club.vann.spring.cycle;

import club.vann.spring.start.CustomBean;

/**
 * @ClassName CustomBeanB
 * @Description TODO
 * @User fanyu
 * @Date 2021/1/8 14:12
 */
public class CustomBeanB {
	private String id;
	private String name;
	private CustomBeanA customBeanA;

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
		this.name = name;
	}

	public CustomBeanA getCustomBeanA() {
		return customBeanA;
	}

	public void setCustomBeanA(CustomBeanA customBeanA) {
		this.customBeanA = customBeanA;
	}
}
