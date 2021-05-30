  
     package forms;

	 import lombok.Data;

	 /**
      * 
      * @author Administrator
      * 收集管理员修改的密码信息
      */
     @Data
     public class AdminPasswordForm {
     private int id;
     private String name;
     private String oldPw;
     private String newPw1;
     private String newPw2;

     }
