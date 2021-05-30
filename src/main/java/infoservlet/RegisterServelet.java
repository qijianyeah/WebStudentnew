
  package infoservlet;
  
  import infodao.*;
  import infomessage.UserMessage;

  import javax.servlet.annotation.WebServlet;
  import javax.servlet.http.HttpServlet;
  import java.io.IOException;
  import java.io.PrintWriter;
  import java.sql.Connection;
  import java.sql.DriverManager;
  import java.sql.ResultSet;
  import java.sql.SQLException;
  import java.sql.Statement;
  import java.util.ArrayList;
  import java.util.List;
  import javax.servlet.ServletException;
  import javax.servlet.http.Cookie;
  import javax.servlet.http.HttpServlet;
  import javax.servlet.http.HttpServletRequest;
  import javax.servlet.http.HttpServletResponse;
  import javax.servlet.http.HttpSession;
  import forms.RegisterFrom;
 
  /**
   *完成对注册请求的控制
   */
  @WebServlet(urlPatterns = "/RegisterServelet",loadOnStartup = 1)
   public class RegisterServelet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
        System.out.println("registerServlet ... ");
		   //req.setCharacterEncoding("utf-8");
		   RegisterFrom rgf =new RegisterFrom();
		   rgf.setName(req.getParameter("name"));
		   rgf.setPassword(req.getParameter("password"));
		   rgf.setRadio(req.getParameter("radio"));
		   rgf.setEmail(req.getParameter("email"));
		    
		   UserMessage userMassage=UserMessage.getInstance();
		   //UserManager userMassage1=UserManager.getInstance();
		   boolean flag=userMassage.Register(rgf);
		   if (flag==true){
		    req.getRequestDispatcher("/index.jsp").forward(req, resp);
		   }
			else 
			req.getRequestDispatcher("/errorcf.jsp").forward(req, resp);
			 
	}
	

	  protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
				doPost(req,resp);
	}
	
   }
