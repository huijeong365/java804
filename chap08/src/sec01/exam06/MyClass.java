package sec01.exam06;

public class MyClass {
	//필드
	RemoteControl rc = new Television(); // 필드의 변수를 이용하여 실행
	
	//생성자 
	MyClass(){
		
	}
	
	MyClass(RemoteControl rc){ // 생성자의 매개변수로 실행
		this.rc = rc;
		rc.turnOn();
		rc.setVolume(5);
	}
	
	//메소드 
	void methodA() { // 메소드의 지역변수를 이용하여 실행
		RemoteControl rc = new Audio();
		rc.turnOn();
		rc.setVolume(5);
	}
	
	//메소드의 매개변수 형식
	void methodB(RemoteControl rc) { // 메소드의 매개변수로 실행
		rc.turnOn();
		rc.setVolume(5);
	}

}
