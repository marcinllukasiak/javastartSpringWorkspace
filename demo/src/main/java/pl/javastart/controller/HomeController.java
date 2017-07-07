package pl.javastart.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
 
@Controller
public class HomeController {
 
//    @RequestMapping("/")
//    public String home() {
//        return "home";
//    }
	
//	@GetMapping("/")
//	public String home(HttpServletRequest request) {
//	    String username = request.getParameter("username");
//	    if(username != null) {
//	        System.out.println("Hello " + username);
//	    }
//	    Cookie[] cookies = request.getCookies();
//	    for(Cookie cookie: cookies) {
//	        System.out.println(cookie.getName() + " " + cookie.getValue());
//	    }
//	    return "home";
//	}
	
//	@GetMapping("/")
//	public String home(@RequestParam(name="username", 
//	                    defaultValue="Nieznajomy",
//	                    required = true) String username) {
//	    System.out.println("Hello " + username);
//	    return "home";
//	}
	
	
	//?username=Jurek&age=20 
	@GetMapping("/")
	public String home(
	        @RequestParam(defaultValue="Nieznajomy") String username,
	        @RequestParam(defaultValue="0") int age,
	        @RequestHeader("user-agent") String userAgent) {
	    System.out.println("Hello " + username);
	    if(age > 0) {
	        System.out.println("Your age is: " + age);
	    }
	    System.out.println("Web browser: " + userAgent);
	    return "home";
	}
	
	
}
