package test04;

public class Child extends Parent {
	private String name;

	// 1번째 실행
	public Child() {
		//super(); // 호출 Parent() (숨어있는 부모의 기본생성자)
		this("홍길동"); // Child(“홍길동”)호출
		System.out.println("Child() call"); // print 4번
	}

	// 4번째 실행
	public Child(String name) {
		this.name = name; // 필드 세팅
		System.out.println("Child(String name) call"); // print 3번
	}

}
