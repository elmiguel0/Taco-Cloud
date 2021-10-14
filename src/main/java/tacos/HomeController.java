package tacos;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//@Controller						//The controller
public class HomeController {
	
	//@GetMapping("/")			//Handles the request for '/'
	public String home() {
		return "home";			// returns a view
	}

}
