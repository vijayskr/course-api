package com.learn.springboot.coursecontroller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseApiController {
	
	@RequestMapping("hi")
	public String sayHi() {
		return "Hi";
	}
}
