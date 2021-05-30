
  package mode;

  import lombok.AllArgsConstructor;
  import lombok.Data;
  import lombok.NoArgsConstructor;

  /**
   * 结果Bean-完成课程信息的收集
   */
  @Data
  public class ClassBean {
    private int id;//标识
    private String className;//课程名称
    private String teacher;//任课教师
    private String score;//课程学分
  }
