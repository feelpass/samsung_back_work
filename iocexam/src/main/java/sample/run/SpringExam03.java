package sample.run;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import sample.MyBean;
import sample.config.MyBeanConfig;

public class SpringExam03 {
	public static void main(String[] args) {
		System.out.println("ApplicationContext 생성전!!");

		ApplicationContext context = new AnnotationConfigApplicationContext(MyBeanConfig.class);

		System.out.println("ApplicationContext 생성후!!");

		MyBean bean1 = (MyBean) context.getBean("myBean");

		bean1.setName("cup");

		System.out.println(bean1.getName());

		MyBean bean2 = (MyBean) context.getBean("myBean");

		System.out.println(bean2.getName());

		if (bean1 == bean2) {
			System.out.println("같은 인스턴스입니다.");
		} else {
			System.out.println(" 다른 인스턴스 입니다.");
		}

		MyBean bean3 = context.getBean("myBean2", MyBean.class);
		bean3.setName("book");
		System.out.println(bean3.getName());

		MyBean bean4 = context.getBean("myBean2", MyBean.class);
		System.out.println(bean4.getName());

		if (bean3 == bean4) {
			System.out.println("같은 인스턴스입니다.");
		} else {
			System.out.println(" 다른 인스턴스 입니다.");
		}
	}
}
