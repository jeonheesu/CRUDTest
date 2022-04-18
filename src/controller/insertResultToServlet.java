package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.BoardDAO;

/**
 * Servlet implementation class BBSInsert
 */
@WebServlet("/insertResultToServlet")
public class insertResultToServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		
	//	String name = request.getParameter("name");
				
		String name = (String) request.getAttribute("name");
		
		PrintWriter out = response.getWriter();
		String data = "<html><body>";
		data += "dispatch 로 이동한 응답입니다. <br>";
		//data += "BBS Insert에서 넘어온 name 값 확인 : " + name;
//		data += "SendRedirect에서 settig 한 name 값 확인 : " + name;
		data += "dispatch에서 settig 한 name 값 확인 : " + name;
		data += "</body><html>";
		out.print(data);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}