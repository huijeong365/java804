package sec02.exam01;

class A{}
class B extends A{}
class C extends A{}

class D extends B{}
class E extends C{}

public class PromotionExample {

	public static void main(String[] args) {
		 B b = new B();
		 C c = new C();
		 D d = new D();
		 E e = new E();
		 
		 A a1 = b;
		 A a2 = c;
		 A a3 = d;
		 A a4 = e;
		 
		 B b1 = d;
		 C c1 = e;
		 
//		 B b3 = e;		e는 C를 상속받고 있기 때문에 컴파일 오류
//		 C c2 = d;		d는 B를 상속받고 있기 때문에 컴파일 오류

	}

}
