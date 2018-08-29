package cn.yourancc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

	@RequestMapping("/user.action")
	public ModelAndView queryUserList() {
		ModelAndView mav = new ModelAndView();
		
		mav.setViewName("index.jsp");
		return mav;
	}
}
