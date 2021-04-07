package kr.ac.inhatc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import kr.ac.inhatc.service.BoardService;
import kr.ac.inhatc.service.BrdService;
import kr.ac.inhatc.service.JspService;

@Controller
public class JspController {
	@Autowired
	BoardService boardService;
	
	JspService jspservice=new JspService();
	
	@RequestMapping("/")
	public String hello(Model model, String id) {
		model.addAttribute("data", "sample data");
		model.addAttribute("data2", "korea");
		model.addAttribute("id", id);
		return "hello";
	}
	//파라미터로 id를 입력 받고
	//이 id를 화면에서 출력?
	@RequestMapping("testdb")
	public String board(Model model, 
			@RequestParam(name = "test",required = false,defaultValue = "연습페이지")String id) {
		model.addAttribute("id",id);
		try {
			List<?> l = boardService.selectSubjectList("");
			System.out.println(l.toString());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "board";
	}
	@RequestMapping("board3")
	public ModelAndView board2() {
		ModelAndView mv =new ModelAndView();
		mv.addObject("title",jspservice.hello());
		mv.addObject("count",jspservice.getCount());
		mv.addObject("num",10);
		mv.setViewName("board");
		
		return mv;
		
	}
	@Autowired
	BrdService brdService;
	
	@RequestMapping("/brd2")
	public ModelAndView brd() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("board");
		mv.addObject("title", "ModelAndView");
		System.out.println(brdService.getCount());
		return mv;
	}
	
}


