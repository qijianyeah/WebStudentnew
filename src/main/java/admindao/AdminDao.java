 
   package admindao;

   
   import java.util.ArrayList;
   import java.util.List;
   import forms.AdminPasswordForm;
   import mode.UseBean;

   /**
   * 管理员接口
   */

   public interface  AdminDao {
	   

	   List list = new ArrayList();
	    

	  /**
	   *查找所有管理员信息
	   * @param
	   * @return List
	   */
	  public List findAllAdmin();
     
	
	     /**
		  * 取得管理员信息
		  * @param adminName
		  * @return UseBean 
		  */
	  public UseBean findAdminPsaaword(String adminName);
		 
   
	     /**
		  *修改管理员密码
		  * @param adminpasswordForm
		  * @return null 
		  */
	   public void updataAdminPasswordFinsh(AdminPasswordForm adminpasswordForm);
        
      }
