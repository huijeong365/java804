package sec02.exam02;

public class IncreaseDecreaseOperatorExample {

	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z;
		
		System.out.println("---------------------");
		x++; // x=10(11)
		++x; // x=12
		System.out.println("x=" + x); // x=12
		
		System.out.println("---------------------");
		y--; // y=10(9)
		--y; // y=8(8)
		System.out.println("y=" + y); // y=8
		
		System.out.println("---------------------");
		z= x++; // z=12, x=12(13)
		System.out.println("z=" + z); // z=12
		System.out.println("x=" + x); // x=13
		
		System.out.println("---------------------");
		z= ++x; // z=14, x=14(14)
		System.out.println("z=" + z); // z=14
		System.out.println("x=" + x); // x=14
		
		System.out.println("---------------------");
		z= ++x + y++; // z=23, x=15(15) y=8(9)
		System.out.println("z=" + z); // z=23
		System.out.println("x=" + x); // x=15
		System.out.println("y=" + y); // y=9
		
	}

}