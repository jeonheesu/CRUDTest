package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GetcookieValue
 */
@WebServlet("/Set")
public class SetCookieValue extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
       response.setContentType("text/html; charset=utf-8");
       Cookie C = new Cookie("name", "tester");
         C.setMaxAge(60*60*24);
         response.addCookie(C);
         PrintWriter out = response.getWriter();
         out.print("쿠키 저장완료 ");
       
         Cookie C1 = new Cookie("adrees", "대구"); 
         C1.setMaxAge(60);
         response.addCookie(C1);
          out.print("쿠키 저장완료 ");
        
        
         
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

}
