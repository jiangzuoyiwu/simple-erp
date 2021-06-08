package cn.jiangzuo.dao.impl;

import java.sql.ResultSet;
import java.util.ArrayList;
import cn.jiangzuo.common.Common;
import cn.jiangzuo.dao.UserDao;
import cn.jiangzuo.domain.User;

public class UserDaoImpl implements UserDao {
	private Common common;

	public UserDaoImpl() {common=new Common();}
	@Override
	public ArrayList<User> findAll() {
		ArrayList<User> lists=new ArrayList<User>();
		try {
			ResultSet result=common.findAll("select * from user");
			while(result.next()) {
				User user=new User();
				user.setUsername(result.getString(1));
				user.setPassword(result.getString(2));
				lists.add(user);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lists;
	}

	@Override
	public String findPasswordByName(String username) {
		String password=null;
		ArrayList<User> lists=this.findAll();
		for(int i=0;i<lists.size();i++) {
			if(lists.get(i).getUsername().equals(username)) {
				password=lists.get(i).getPassword();
			}
		}
		return password;
	}

}
