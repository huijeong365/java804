package test04;

public class Parent {

	public String nation;

	// 2번째 실행
	public Parent() {
		this("대한민국"); // Parent(“대한민국”) 호출
		System.out.println("Parent() call");// print 2번
	}

	// 3번째 실행
	public Parent(String nation) {
		this.nation = nation; // 필드 세팅
		System.out.println("Parent(String nation) call");// print 1번
	}
}
