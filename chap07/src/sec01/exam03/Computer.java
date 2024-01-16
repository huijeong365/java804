package sec01.exam03;

public class Computer extends Calculator {

	@Override //annotation 컴파일러의 표식
	double areaCircle(double r) {
		System.out.println("Computer 객체의 areaCircle() 실행");
		return Math.PI * r * r;
	}
	
	

}
