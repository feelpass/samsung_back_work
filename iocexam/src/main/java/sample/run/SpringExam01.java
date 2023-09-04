package sample.run;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringExam01 {
	public static void main(String[] args) {
		System.out.println("ApplicationContext 생성전!!");
		
		ApplicationContext context = new ClassPathXmlApplicationContext("exam.xml");
		
		System.out.println("ApplicationContext 생성후!!");
	}
}
