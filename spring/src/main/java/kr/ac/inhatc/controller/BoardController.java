package kr.ac.inhatc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import kr.ac.inhatc.service.JspService;

@Controller
public class BoardController {
	JspService jspservice =new JspService();
	@RequestMapping("board2")
	public ModelAndView board2() {
		ModelAndView mv =new ModelAndView();
		mv.addObject("title",jspservice.hello());
		mv.setViewName("board");
		System.out.println(jspservice.getCount());
		return mv;
		
	}
}
