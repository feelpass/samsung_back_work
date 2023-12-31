package sample.run;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import sample.Game;
import sample.config.GameConfig;

public class SpringExam04 {
	public static void main(String[] args) {
		System.out.println("ApplicationContext 생성전!!");

		ApplicationContext context = new AnnotationConfigApplicationContext(GameConfig.class);

		System.out.println("ApplicationContext 생성후!!");

//		Dice dice = context.getBean(Dice.class);
//		
//		System.out.println(dice.getNumber());
		
		Game game = context.getBean(Game.class);
		game.play();
		
		
		
	}
}
