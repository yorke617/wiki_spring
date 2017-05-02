package com.kiwi.registUser.BS.BSImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kiwi.baseBS.BaseService;
import com.kiwi.beans.User;
import com.kiwi.registUser.BS.RegistUserBS;
@Service
public class RegistUserBSImpl extends BaseService implements RegistUserBS  {
	/**
	 * ע���Ա�û�
	 */
	public boolean registUser(User user) throws Exception {
		//�ж�����Ƿ�Ϊ��
		if(user == null)
			throw new Exception("ע����û���Ϣ����Ϊ�գ����飡");
		String queryUser = "select count(1) from sys003 where loginname = '" + user.getLoginname() + "'";
		if(jdbc == null)
			return false;
//		List userList = jdbc.queryForList(queryUser,new String[]{user.getLoginname()});
//		System.out.println(userList);
		int userCount = jdbc.queryForInt(queryUser);
		if (userCount > 0) {
			System.out.println("���û����Ѵ��ڣ�");
			return false;
		}
		String addUser = "insert into sys003(userid,loginname,password,usertype,isvalid) values( " +
				"sq_userid.nextval,'" + user.getLoginname() + "','" + user.getPassword() + "'," 
			+ user.getUsertype() + "," + user.getIsvalid() + ")";
		jdbc.execute(addUser);
		return true;
	}

}
