package kr.ac.inhatc.mvc.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class mvcController3 {
	@RequestMapping("name")
	public String name(String id) {
		return "당신의 학번은 : " + id;
	}
}
