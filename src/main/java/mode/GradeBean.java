
  package mode;

  import lombok.AllArgsConstructor;
  import lombok.Data;
  import lombok.NoArgsConstructor;

  /**
   * 
   * @author Administrator
   * 结果Bean-完成学生成绩的收集
   */
  @Data
  @AllArgsConstructor
  @NoArgsConstructor
  public class GradeBean {
	int id;//成绩标识
	String stu_name;//学生姓名
	String class_name;//课程名
	String class_teacher;//教师名
	String class_score;//课程学分
	String stu_grade;//学生成绩
  }
