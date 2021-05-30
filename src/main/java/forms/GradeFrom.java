
  package forms;


  import lombok.AllArgsConstructor;
  import lombok.Data;
  import lombok.NoArgsConstructor;

  /**
   *
   * 收集学生成绩信息
   */
  @Data
  @AllArgsConstructor
  @NoArgsConstructor
  public class GradeFrom{
   private int studentId;//学生标识
   private int classId;//课程标识
   private String grade;//学生成绩
  }
