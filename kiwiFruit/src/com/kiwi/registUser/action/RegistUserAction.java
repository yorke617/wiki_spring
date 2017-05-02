package com.kiwi.registUser.action;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.kiwi.baseAction.BaseAction;
import com.kiwi.beans.User;
import com.kiwi.registUser.BS.RegistUserBS;
import com.lbs.brick.util.BeanHelper;
@Controller
@RequestMapping("/registUser")
public class RegistUserAction extends BaseAction {
	@Resource
	private RegistUserBS bs;
	
	@RequestMapping("/loadPage.do")
	public String loadPage(HttpServletRequest request, HttpServletResponse response){
		//System.out.println("--------------注册---------------");
		String ip = request.getLocalAddr();
		//System.out.println(ip);
		String a = request.getParameter("a");
		request.setAttribute("msg", "加载页面时的数据");
		System.out.println("加载页面");

		return "registUser/registUser";
	}
	@RequestMapping("/queryUser.do")
	@ResponseBody//此注解不能省略 否则ajax无法接受返回值  
	public User queryUser(HttpServletRequest request, 
			HttpServletResponse response) throws Exception{
		ModelAndView modelView = new ModelAndView();
		
		User user = new User();
		user.setIsvalid(1l);
		user.setLoginname("ddd");
		user.setPassword("111111");
		user.setUsertype(2l);
		//boolean isSave = bs.registUser(user);
		//System.out.println(isSave);
		//return isSave;
		String params = request.getParameter("params");
//		System.out.println(params);
		
		RegistPage page = (RegistPage)getPage(params, RegistPage.class);
//		System.out.println(page.getA());
//		System.out.println(page.getB());
//		System.out.println(page.getC());
//		setData("aaaaaaaaa", request);
		Map map = new HashMap();
		map.put("b", "bbbbb");
		//model.addAttribute("cc", "ccccc");
		//"registUser/registUser";
		modelView.addObject("dd", "ddddd");
		if ("ddd1".equals(user.getLoginname())) {
			throw new Exception("exception");
		}
		return user;
	}
	@RequestMapping("/registUser.do")
	@ResponseBody
	public Map registUser(HttpServletRequest request, 
			HttpServletResponse response,RegistPage page) throws Exception{
		Map result = new HashMap();

		System.out.println(page.getName()+"||"+page.getPassword());
		if ("admin".equals(page.getName())) {
			throw new Exception("fail");
		}
		User user = new User();
		user.setLoginname(page.getName());
		user.setPassword(page.getPassword());
		request.getSession().setAttribute("user", user);
		//response.getWriter().write("sdafsa");
		return result;
	}
	
}
