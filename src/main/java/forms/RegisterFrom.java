
  package forms;

  import lombok.AllArgsConstructor;
  import lombok.Data;
  import lombok.NoArgsConstructor;

  /**
    * 表单Bean-完成用户注册信息的收集
    */
  @Data
  @AllArgsConstructor
  @NoArgsConstructor
  public class RegisterFrom {

  private String name;//用户名
  private String password;//密码
  private String radio;//性别
  private String email;//电子邮件

  }
