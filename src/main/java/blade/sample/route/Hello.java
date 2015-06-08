package blade.sample.route;

import blade.annotation.Path;
import blade.annotation.Route;

@Path
public class Hello {

	
	@Route("/hello")
	public String hello() {
		System.out.println("hello");
		return "hello";
	}
	
}