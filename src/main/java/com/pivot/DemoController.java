package com.pivot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@RequestMapping("/demo")
	public String demo() {
		return "Welcome to my pcf demo from my git hub";
	}
}
