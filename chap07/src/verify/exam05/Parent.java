package verify.exam05;

public class Parent {
	public String nation;
	
	public Parent() { // 3번 호출
		this("대한민국");
		System.out.println("Parent() call");
	}
	
	public Parent(String nation) { // 4번호출
		this.nation = nation;
		System.out.println("Parent(String nation) call");
	}

}
