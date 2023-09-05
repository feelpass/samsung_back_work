package annotion;

import java.lang.reflect.Method;

public class ServiceRun {

	public static void main(String[] args) throws Exception{
		Method[] declareMethods = Service.class.getDeclaredMethods();
		
		Service service = new Service();
		
		for (Method method : declareMethods) {
			
			if(method.isAnnotationPresent(PrintAnnotion.class)) {
				
				System.out.println("[[[[[  "+ method.getName()+"]]]]]]");
				
				PrintAnnotion printAnnotion = method.getAnnotation(PrintAnnotion.class);
				
				for(int i = 0; i < printAnnotion.number(); i++) {
					System.out.print(printAnnotion.value());
				}
				System.out.println();
			}
			
			method.invoke(service);
		}
	}

}
