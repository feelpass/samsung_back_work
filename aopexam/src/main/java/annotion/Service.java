package annotion;

public class Service {
	@PrintAnnotion("&")
	public void method1() {
		System.out.println("Mehtod1 run!!!");
	}
	@PrintAnnotion
	public void method2() {
		System.out.println("Mehtod2 run!!!");
	}
	@PrintAnnotion(value = "$" , number = 10)
	public void method3() {
		System.out.println("Mehtod3 run!!!");
	}
	
	
	public void method4() {
		System.out.println("Mehtod4 run!!!");
	}
	
	
}
