package sec02.exam04;

public class Anonymous {

	private int field;
	
	public void method(final int arg1, int arg2) {
		final int var1 = 0;
		int var2 = 0;
		
		field = 10;
		
		//arg1 = 20;	//컴파일 안됨
		//arg2 = 20;	//컴파일 안됨
		//var1 = 20;	//컴파일 안됨
		//var2 = 20;	//컴파일 안됨
		
		Calculatable calc = new Calculatable() {

			@Override
			public int sum() {
				int result = field + arg1 + arg2 + var1 + var2;
				return result;
			}
		};
		System.out.println(calc.sum());
	}
}
