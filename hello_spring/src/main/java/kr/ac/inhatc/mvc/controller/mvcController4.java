package kr.ac.inhatc.mvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class mvcController4 {
	@RequestMapping("hello")
	public String hello(int num) {
		String mul ="";
		for(int i = 1; i < 10; i++) {
			mul += num+"*"+ i + "=" + (num*i)+" ";
		}
		return mul;
	}
}
