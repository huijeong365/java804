package sec02.exam04;

public class VehicleExample {

	public static void main(String[] args) {
		Vehicle vehicle = new Bus(); //자동형변환. 
		
		vehicle.run();
//		vehicle.checkFare(); //안됨.버스에만 선언된 메소드 이기 때문에.
		
		Bus bus = (Bus) vehicle;  //강제형변환. 버스에만 있는 메소드를 실행하기 위하여.
		bus.run();
		bus.checkFare();

	}

}
