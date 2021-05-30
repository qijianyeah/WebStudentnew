
   package forms;

   import lombok.Data;

   import java.text.SimpleDateFormat;
   import java.util.Date;
  
   /**
    * 表单Bean-收集添加通知的数据
    */
   @Data
   public class NoticeForm {
    private int id;
	private String title;//通告标题
    private String text;//通告的正文内容
    private String date;//发布通告的时间
   }
