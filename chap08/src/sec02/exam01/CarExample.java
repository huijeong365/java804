package sec02.exam01;

public class CarExample { //필드의 변수를 이용한 실행방법

	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.run();
		
		myCar.frontLeftTire = new KumhoTire();
		myCar.frontRightTire = new KumhoTire();
		
		System.out.println("--------------------");
		myCar.run();

	}

}
