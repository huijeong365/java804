package verify.exam07;

public class httpServletExample {

	public static void main(String[] args) {
		method(new LoginServlet());
		method(new FileDownloadServlet());

	}
	
	public static void method(HttpServlet servlet) {
		servlet.service();

	}
	

}
