package cn.smbms.dao.user;

import cn.smbms.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.sql.Connection;
import java.util.List;

public interface UserDao {
	/**
	 * 增加用户信息
	 * @param user
	 * @return
	 * @throws Exception
	 */
//	public int add( User user)throws Exception;

	/**
	 * 通过userCode获取User
	 * @param userCode
	 * @return
	 * @throws Exception
	 */
	public User getLoginUser( @Param("userCode") String userCode)throws Exception;

//	/**
//	 * 通过条件查询-userList
//	 * @param userName
//	 * @param userRole
//	 * @return
//	 * @throws Exception
//	 */
//	public List<User> getUserList( String userName, int userRole, int currentPageNo, int pageSize)throws Exception;
//	/**
//	 * 通过条件查询-用户表记录数
//	 * @param userName
//	 * @param userRole
//	 * @return
//	 * @throws Exception
//	 */
//	public int getUserCount( String userName, int userRole)throws Exception;
//
//	/**
//	 * 通过userId删除user
//	 * @param delId
//	 * @return
//	 * @throws Exception
//	 */
//	public int deleteUserById(Integer delId)throws Exception;
//
//
//	/**
//	 * 通过userId获取user
//	 * @param id
//	 * @return
//	 * @throws Exception
//	 */
//	public User getUserById( String id)throws Exception;
//
//	/**
//	 * 修改用户信息
//	 * @param user
//	 * @return
//	 * @throws Exception
//	 */
//	public int modify(User user)throws Exception;
//
//
//	/**
//	 * 修改当前用户密码
//	 * @param id
//	 * @param pwd
//	 * @return
//	 * @throws Exception
//	 */
//	public int updatePwd(int id, String pwd)throws Exception;
	
	
}
