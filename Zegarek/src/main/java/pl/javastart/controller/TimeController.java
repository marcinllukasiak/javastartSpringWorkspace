package pl.javastart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import pl.javastart.component.TimeComponent;

@Controller
public class TimeController {

	private TimeComponent timeComponent;

	@Autowired
	public TimeController(TimeComponent timeComponent) {
		this.timeComponent = timeComponent;
	}

	@GetMapping("/")
	public String printTime() {
		try {

			System.out.println(timeComponent.getTime());

		} catch (Exception e) {
			System.out.println("ERRORRRRRR ----  " + e);
		}
		return "home.jsp";

	}

}
