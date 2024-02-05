package sec01.exam24;

public class AutoBoxingUnBoxingExample {

	public static void main(String[] args) {
		//자동 Boxing
		Integer obj = 100;
		System.out.println("value: " + obj.intValue());
		
		//대입시자동  UnBoxing
		int vlaue = obj;
		System.out.println("value: " + vlaue);
		
		//연산시자동 UnBoxing
		int result = obj +100;
		System.out.println("result: " + result);

	}

}
