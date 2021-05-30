  package infodao;

  import java.util.List;
  import mode.StudentBean;
  import forms.RegisterFrom;

   /**
    * @author Administrator
    * 用户dao接口
    */
   public interface UserDao {
 
	/**
	 * 用户登录
	 * @param name，password，shenfen
	 * @return boolean 
	 */
	public boolean con(String name, String password, int shenfen);
		 
	/**
	 * 用户注册
	 * @param regf
	 * @return boolean 
	 */
	public boolean registerByName(RegisterFrom regf);
	 

	/**
	 * 查找所有用户
	 * @return list
	 */
	
	public List getAllUser() ;
	
	
	/**
	 * 删除指定用户
	 * @param id id
	 * @return int rs
	 */
	public int delUserById(String id);
	 
	/**
	 *根据id查找指定用户
	 * @param id
	 * @return StudentBean
	 */
	public StudentBean findUserById(String id);
	 
	/**
	 *根据对用户的数据进行编辑
	 * @param regf, id
	 * @return boolean
	 */
	public boolean modifyUser(StudentBean regf, String id);
	 
	}
