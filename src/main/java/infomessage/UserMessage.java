
  package infomessage;

  import infodao.UserDao;
  import infodao.UserDao4MySqlImpl;
  import java.util.List;
  import mode.StudentBean;
  import forms.LoginForm;
  import forms.RegisterFrom;

  /**
   * 业务类-单例模式
   * @author Administrator
   *
   */
  public class UserMessage {

  static private UserMessage instance=null;

  private UserMessage()
  {}

  static public UserMessage getInstance()
  {
	 if(instance==null)
	 {
		 instance=new UserMessage();

	 }
     return instance;
  }

   /**
	  * 用户登录
	  * @param loginf
	*/

	public boolean login(LoginForm loginf){
		UserDao intsl=new UserDao4MySqlImpl();
		boolean flag=intsl.con(loginf.getUsername(), loginf.getPassword(),loginf.getShenfen());
		return flag;
	}

	/**
	 * �用户注册
	 * @param regf
	 */
	public boolean Register(RegisterFrom regf)
	{
		UserDao intsl=new UserDao4MySqlImpl();
		boolean flag=intsl.registerByName(regf);
		return flag;
	}

	 /**
	  *查找所有用户
	  */
	public List findAllUse()
    {
	  UserDao intsl=new UserDao4MySqlImpl();
      List AllUser=intsl.getAllUser();
      return AllUser;
    }

	/**
	 *删除指定用户
	 * @param id
	 */
	public int delUserById(String id)
	{
		UserDao intsl=new UserDao4MySqlImpl();
		int flag=intsl.delUserById(id);
		return flag;
	}

	public StudentBean findUserById(String id)
	{
		UserDao intsl=new UserDao4MySqlImpl();
		StudentBean bean=intsl.findUserById(id);
		return bean;
	}

	/**
	 *根据对用户的数据进行编辑
	 * @param regf,String id
	 * @return boolean
	 */
	public boolean modifyUser(StudentBean regf,String id)
	{
		UserDao intsl=new UserDao4MySqlImpl();
		boolean flag=intsl.modifyUser(regf,id);
		return flag;
	}
   }
