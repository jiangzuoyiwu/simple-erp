package cn.jiangzuo.dao;

import java.util.ArrayList;

import cn.jiangzuo.domain.User;

public interface UserDao {
	
	public ArrayList<User> findAll();
	public String findPasswordByName(String username);

}
