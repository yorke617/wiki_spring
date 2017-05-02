package com.kiwi.filter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.kiwi.beans.User;

/**
 * @author Administrator
 *
 */
public class SecurityFilter extends HandlerInterceptorAdapter {
	
	@Override
    public boolean preHandle(HttpServletRequest request,
            HttpServletResponse response, Object handler) throws Exception {
        System.out.println(handler);
        
		System.out.println("==>>Begin to Filter session====");
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");
        System.out.println("===??Current User=="+user);
        String curPath=request.getRequestURL().toString();
        System.out.println("===>> curpath:"+curPath);
        if (curPath.indexOf("registUser/loadPage.do")>=0||
        		curPath.indexOf("registUser/registUser.do")>=0){
            return true;
        }
        if(null==user || "".equals(user)){
        	request.setAttribute("msg", "session失效");
        	
//            throw new Exception("session失效");
        	return false;
            /**
             * handle session and security if you want.
             */
            //request.getRequestDispatcher("/index.jsp").forward(request, response);
        }        
        return super.preHandle(request, response, handler);
    }
	
	@Override
	public void postHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		//modelAndView.addObject("aaa");
		System.out.println("加载页面时的数据是："+request.getAttribute("msg"));
		System.out.println("执行完了");
		super.postHandle(request, response, handler, modelAndView);
	}
	@Override
	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		System.out.println("完成所有任务");
		if (ex != null) {
			System.out.println(ex.getMessage());
		}
		handler = ex.getMessage();
		super.afterCompletion(request, response, handler, ex);
	}
	
	
	
	
}
