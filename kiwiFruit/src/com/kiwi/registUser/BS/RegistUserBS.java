package com.kiwi.registUser.BS;

import com.kiwi.beans.User;

public interface RegistUserBS {
	/**
	 * 保存用户注册信息
	 * @param user
	 * @return
	 */
	public boolean registUser(User user) throws Exception;
}
