package kr.ac.inhatc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import kr.ac.inhatc.service.BrdService;

@Controller
public class BrdController {
	@Autowired
	BrdService brdService1;
	
	@RequestMapping("/brd")
	public ModelAndView brd() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("board");
		mv.addObject("title", "ModelAndView");
		mv.addObject("count", brdService1.getCount());
		mv.addObject("num", 15);
		return mv;
	}
	

}
