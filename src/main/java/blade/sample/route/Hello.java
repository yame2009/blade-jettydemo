package blade.sample.route;

import blade.annotation.Path;
import blade.annotation.Route;
import blade.wrapper.Request;

@Path
public class Hello {

	
	@Route("/hello/:name")
	public String hello(Request request) {
		System.out.println("hello");
		System.out.println("name = " + request.pathParam(":name"));
		return "hello";
	}
	
}