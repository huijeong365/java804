package verify.exam06;

public class ServiceExample {

	public static void main(String[] args) {
		
		Controller controller = new Controller();
		//controller.setService(new Service());  //안됨. 강제형변환
		//controller.service.login();

		controller.setService(new MemberService());  
		controller.service.login();
		
		controller.setService(new AService());  
		controller.service.login();
	}

}
