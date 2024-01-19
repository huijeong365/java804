package verify.exam05;

public class Child extends Parent {

	private String name;
	
	public Child() { // 1번호출
		this("홍길동");
		System.out.println("Child() call");
	}
	
	public Child(String name) { // 2번 호출
		this.name = name;
		System.out.println("Child(String name) call");
	}
}
