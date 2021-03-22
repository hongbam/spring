package kr.ac.inhatc.mvc.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class mvcController2 {
	@RequestMapping("inhatc")
	public String inhatc() {
		return "https://www.inhatc.ac.kr/sites/kr/index.do";
	}
}
