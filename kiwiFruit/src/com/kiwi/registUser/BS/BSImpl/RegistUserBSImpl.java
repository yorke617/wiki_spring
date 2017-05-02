package com.kiwi.registUser.BS.BSImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kiwi.baseBS.BaseService;
import com.kiwi.beans.User;
import com.kiwi.registUser.BS.RegistUserBS;
@Service
public class RegistUserBSImpl extends BaseService implements RegistUserBS  {
	/**
	 * 注册会员用户
	 */
	public boolean registUser(User user) throws Exception {
		//判断入参是否为空
		if(user == null)
			throw new Exception("注册的用户信息不能为空，请检查！");
		String queryUser = "select count(1) from sys003 where loginname = '" + user.getLoginname() + "'";
		if(jdbc == null)
			return false;
//		List userList = jdbc.queryForList(queryUser,new String[]{user.getLoginname()});
//		System.out.println(userList);
		int userCount = jdbc.queryForInt(queryUser);
		if (userCount > 0) {
			System.out.println("该用户名已存在！");
			return false;
		}
		String addUser = "insert into sys003(userid,loginname,password,usertype,isvalid) values( " +
				"sq_userid.nextval,'" + user.getLoginname() + "','" + user.getPassword() + "'," 
			+ user.getUsertype() + "," + user.getIsvalid() + ")";
		jdbc.execute(addUser);
		return true;
	}

}
