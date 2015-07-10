package blade.sample.route;

import blade.annotation.Path;
import blade.annotation.Route;
import blade.servlet.Request;
import blade.servlet.Response;

@Path
public class Hello {

	
	@Route("/")
	public void index(Response response) {
		response.text("hello!");
	}
	
	@Route("/hello/:name")
	public String hello(Request request) {
		System.out.println("hello");
		System.out.println("name = " + request.pathParam(":name"));
		return "hello";
	}
	
}