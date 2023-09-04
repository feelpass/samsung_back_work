package sample;

public class Player {
	private String name;
	private Dice dice;
	
	public void play() {
		System.out.println(name +"은 주사위를 던져서 "+dice.getNumber() +"가 나왔습니다.");
	}
}
