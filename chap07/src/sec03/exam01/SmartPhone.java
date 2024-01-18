package sec03.exam01;

public class SmartPhone extends Phone {

	public SmartPhone(String owner) { //추상클래스를 상속받았기 때문에, 추상클래스와 같은 생성자 재정의 해야함.
		super(owner);
	}
	
	//메소드
	public void internetSearch() {
		System.out.println("인터넷 검색을 합니다.");
	}

}
