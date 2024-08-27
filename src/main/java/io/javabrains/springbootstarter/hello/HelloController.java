package io.javabrains.springbootstarter.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	//this @RequestMapping maps only to the GET method by default.
	@RequestMapping("/hello")
	public String sayHi() {
		return "Hi";
	}
	

}
