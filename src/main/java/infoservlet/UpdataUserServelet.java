
  package infoservlet;

  import infodao.*;
  import infomessage.UserMessage;
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
  import javax.servlet.annotation.WebServlet;
  import javax.servlet.http.Cookie;
  import javax.servlet.http.HttpServlet;
  import javax.servlet.http.HttpServletRequest;
  import javax.servlet.http.HttpServletResponse;
  import javax.servlet.http.HttpSession;
  import mode.StudentBean;

  /**
   * 
   * @author Administrator
   * 完成对更新请求的控制
   */
  @WebServlet(urlPatterns = "/updataUser")
   public class UpdataUserServelet extends HttpServlet{
	String id;
   protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doPost(req,resp);
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		//req.setCharacterEncoding("utf-8");
		id=req.getParameter("id");
		UserMessage userMassage=UserMessage.getInstance();
		StudentBean bean=userMassage.findUserById(id);
		req.setAttribute("user",bean);
		 
        req.getRequestDispatcher("/WEB-INF/infojsp/Updata.jsp").forward(req, resp);
	 
		}
	
   }

