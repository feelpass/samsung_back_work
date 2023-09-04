package sample;

public class Dice {
	private int face;
	
	public Dice(int face) {
		System.out.println("Dice(int) 생성자 실행");
		this.face = face;
	}
	
	public int getNumber() {
		return (int)(Math.random()*face) + 1;
	}
}
