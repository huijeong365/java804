package sec01.exam07.pack2;
import sec01.exam07.pack1.A;

public class D extends A{ //A를 상속하였기 때문에  A가 protected 여도 불러올수있다.
	public D() {
		super();
		this.field = "value";
		this.method();
	}

}
