package cn.yourancc.controller;

import java.util.LinkedList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.yourancc.entity.User;

@Controller
public class UserController {

	@RequestMapping("/user.action")
	public ModelAndView queryUserList() {
		LinkedList<User> list = new LinkedList<User>();
		
		list.add(new User(1l,"张三","123"));
		list.add(new User(2l,"张4","1dsa3"));
		list.add(new User(3l,"张5","1233"));
		list.add(new User(4l,"张6","1213"));
		list.add(new User(5l,"张7","12q3"));
		list.add(new User(6l,"张8","1s23"));
		ModelAndView mav = new ModelAndView();
		mav.addObject("list",list);
		mav.setViewName("WEB-INF/jsp/userlist.jsp");
		return mav;
	}
}
