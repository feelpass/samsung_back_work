package sample.run;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import sample.Dice;
import sample.Game;

public class SpringExam02 {
	public static void main(String[] args) {
		System.out.println("ApplicationContext 생성전!!");

		ApplicationContext context = new ClassPathXmlApplicationContext("game.xml");

		System.out.println("ApplicationContext 생성후!!");

//		Dice dice = context.getBean(Dice.class);
//		
//		System.out.println(dice.getNumber());
		
		Game game = context.getBean(Game.class);
		game.play();
		
		
		
	}
}
