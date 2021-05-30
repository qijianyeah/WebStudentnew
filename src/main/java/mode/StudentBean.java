
   package mode;

   import lombok.AllArgsConstructor;
   import lombok.Data;
   import lombok.NoArgsConstructor;

   /**
   * 
   * @author Administrator
   * 结果Bean-完成学生信息的收集
   */
   @Data
   public class StudentBean {
	String name;//姓名
	String password;//密码
	int id;//标识
	String sex;//性别
	String email;//电子邮件
  }
