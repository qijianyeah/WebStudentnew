   
  package forms;

  import lombok.AllArgsConstructor;
  import lombok.Data;
  import lombok.NoArgsConstructor;

  /**
     * 表单Bean-完成用户登录信息的收集
     */
  @Data

   public class LoginForm {
   private String username ;//用户名
   private String password;//密码
   private int shenfen;//身份
   }
