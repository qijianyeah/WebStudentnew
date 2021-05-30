package infoservlet;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import infodao.*;
import infomessage.UserMessage;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import forms.LoginForm;
/**
 * 完成对登录请求的控制
 * @author Administrator
 *
 */
@WebServlet(urlPatterns = "/LoginServelet")
public class LoginServelet  extends HttpServlet{
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		this.doGet(req, resp);
		System.out.println("loginServelet dopost 执行！！！");
	}
	/**
	  * Post
	  */
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)

			throws ServletException, IOException {
		System.out.println("loginServelet dopost 执行！！！");

		req.setCharacterEncoding("utf-8");

		LoginForm lgfm=new LoginForm();
		HttpSession session = req.getSession();
		String name=null;
		String password=null;
		int shenfen;
		name=req.getParameter("username");
		password=req.getParameter("password");
		shenfen=Integer.parseInt(req.getParameter("shenfen"));

		System.out.println(name + " " + password + " " + shenfen);

		lgfm.setUsername(name);
		lgfm.setPassword(password);
		lgfm.setShenfen(shenfen);
		
		UserMessage userMassage=UserMessage.getInstance();

		boolean flag=userMassage.login(lgfm);
		
		 
		if(flag){
			
			session.setAttribute("name", name);
			session.setAttribute("password", password);
			session.setAttribute("shenfen", shenfen);
			
			if(shenfen==1){
				req.getRequestDispatcher("/login.jsp").forward(req, resp);
			}
			if(shenfen==0){
				req.getRequestDispatcher("/studentlogin.jsp").forward(req, resp);
			}
			
		}else{
			req.getRequestDispatcher("/error.jsp").forward(req, resp);
		}
		
	}
	
}
