
   package adminmanager;

   import java.util.ArrayList;
   import java.util.List;
   import forms.AdminPasswordForm;
   import mode.UseBean;
   import admindao.AdminDao;
   import admindao.AdminDaoIml;

   public class AdminManager {
	  /**
	   * 管理员账号管理业务类-单例模式
	   * @author Administrator
	   * 
	   */

	  static private AdminManager instance=null;
		  
		  private AdminManager()
		  {}
			 
		  static public synchronized AdminManager getInstance()
		  {
			 if(instance==null)
			 {
				 instance=new AdminManager(); 
				 
			 }
		     return instance;
		  }
		  
		    /**
			  *查找所有管理员信息 ���������û� 
			  * @param
			  * @return List 
			 */
			public List findAllAdmin()
		    {   
		       AdminDao dao =new AdminDaoIml();
		       List allAdmin=dao.findAllAdmin();
		       return allAdmin;
		    }
		
			/**
			  *取得管理员信息 ���������û� 
			  * @param adminName 管理员姓名
			  * @return UseBean 
			 */
			public UseBean findAdminPsaaword(String adminName)
			{
				 AdminDao dao =new AdminDaoIml();
				 UseBean useBean=dao.findAdminPsaaword(adminName);
			     return useBean;
			}
  
			/**
			  *修改管理员密码
			  * @param adminpasswordForm
			  * @return null 
			 */
		   public void updataAdminPasswordFinsh(AdminPasswordForm adminpasswordForm)
           {
			   AdminDao dao =new AdminDaoIml();
			   dao.updataAdminPasswordFinsh(adminpasswordForm);
           }
   
   }
