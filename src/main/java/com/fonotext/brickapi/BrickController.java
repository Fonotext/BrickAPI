package com.fonotext.brickapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bricks")
public class BrickController {

	@GetMapping("/hello")
	public @ResponseBody String doSomething() {
		return "Hello World";
	}

}
