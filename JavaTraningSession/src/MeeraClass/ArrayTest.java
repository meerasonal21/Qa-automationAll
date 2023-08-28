package MeeraClass;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String tools[] = {"selenium","Junit","TestNG","Git","Jenkins"};
		System.out.println(tools.length);
		
		/*System.out.println(tools[0]);
		System.out.println(tools[1]);
		System.out.println(tools[2]);
		System.out.println(tools[3]);
		System.out.println(tools[4]);*/
		
		for(int i=0; i<tools.length; i++) {
			System.out.println(tools[i]);
		}
		
		System.out.println("-----------------------------------");
		int numbers[] = {1,5,18, 200, 5000};
		System.out.println(numbers.length);
		
		for(int i=0; i<numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
System.out.println("----------------------------------");
		
		Object abc[] = {"Hello", 10, 11.2, 'c'};
		System.out.println(abc.length);
		
		for(int i=0; i<abc.length; i++) {
			System.out.println(abc[i]);
		}
		
		
		
		
	}

}
