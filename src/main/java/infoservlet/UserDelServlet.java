
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
  import java.sql.Statement;
  import java.util.ArrayList;
  import java.util.List;
  import javax.servlet.ServletException;
  import javax.servlet.http.Cookie;
  import javax.servlet.http.HttpServlet;
  import javax.servlet.http.HttpServletRequest;
  import javax.servlet.http.HttpServletResponse;
  import javax.servlet.http.HttpSession;


  /**
   * 
   * @author Administrator
   * 完成对删除请求的控制
   */
  
    @WebServlet(urlPatterns = "/UserDel")
  public class UserDelServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		//req.setCharacterEncoding("utf-8");
		String id = req.getParameter("userId");
		 
		UserMessage userMassage=UserMessage.getInstance();
		int rs = userMassage.delUserById(id);
		if(rs != 0){
			 req.getRequestDispatcher("/studentInfo").forward(req, resp);
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}
	
  }
