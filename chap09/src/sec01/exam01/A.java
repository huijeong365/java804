package sec01.exam01;

public class A {

	A() {
		System.out.println("A 객체가 생성됨");
	}
	
	public class B {			//인스턴스 멤버 클래스
		B() {
			System.out.println("B 객체가 생성됨");
		}
		int field1; 
		//static int field2;
		void method1() {}
		//static void method2() {}
	}
	
	static class C {			//정적 클래스
		C() {
			System.out.println("C 객체가 생성됨");
		}
		int field1;
		static int field2;
		void method1() {}
		static void method2() {}
	}
	
	void method() {
		class D{					//로컬 클래스		
			D() {
				System.out.println("D 객체가 생성됨");
			}
			int field1;
			//static int field2;
			void method1() {}
			//static void method2(){}
		}
		D d = new D();			//class D 가 지역 클래스이기 때문에, 클래스 안에서만 실행이 됨. 밖에서는 실행이 안된다.
		d.field1 = 3;
		d.method1();
	}
}
