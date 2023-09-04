package sample.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

import sample.MyBean;

public class MyBeanConfig {
	
	//<bean id="myBean" class="sample.MyBean" />
	@Bean
	public MyBean myBean() {
		return new MyBean();
	}
	
	@Bean
	@Scope("prototype")
	public MyBean myBean2() {
		return new MyBean();
	}
}
