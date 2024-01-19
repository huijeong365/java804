package sec01.exam04;

public interface RemoteControl {
	//상수
	int MAX_VOLUME = 10;		//static final 이  생략되어 있다.
	int MIN_VOLUME = 0;
	
	//추상 메소드 		
	void turnOn();				//public abstract 가 생략되어 있다.
	void turnOff();
	void setVolume(int volume);
}
