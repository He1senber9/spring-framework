package club.vann.spring.cycle;

import club.vann.spring.start.CustomBean;

/**
 * @ClassName CustomBeanA
 * @Description TODO
 * @User fanyu
 * @Date 2021/1/8 14:11
 */
public class CustomBeanA {
	private String id;
	private String name;
	private CustomBeanB customBeanB;

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

	public CustomBeanB getCustomBeanB() {
		return customBeanB;
	}

	public void setCustomBeanB(CustomBeanB customBeanB) {
		this.customBeanB = customBeanB;
	}
}
