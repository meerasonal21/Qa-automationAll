package MeeraClass;

public class ReturnTypeTest {

	public static void main(String[] args) {
		
		int x = sum();
		System.out.println(x);
		System.out.println(sum());
		System.out.println(hello());

	}
//last line must be return statment
	public static int sum () {
		int a= 4+5;
		return a;
	}
	public static String hello() {
		String s ="Hello Java";
		return s;
	}
}
