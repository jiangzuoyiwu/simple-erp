package cn.jiangzuo.service.impl;

import java.util.ArrayList;
import java.util.Date;

import cn.jiangzuo.dao.impl.UserDaoImpl;
import cn.jiangzuo.domain.FangAn;
import cn.jiangzuo.service.AdminService;

public class AdminServiceImpl implements AdminService {
	private UserDaoImpl userDao;
	
	public AdminServiceImpl() {userDao=new UserDaoImpl();}

	@Override
	public boolean addRecord(String kehu, String sefen_id, Date date, String yanse, float jiage, String pantone,
			String yuanliao, ArrayList<FangAn> lists) {
		// TODO Auto-generated method stub
		return false;
	}
	//辅助操作，添加方案信息
	public boolean addFangAn(FangAn fangan) {
		
		return false;
		}
	@Override
	public boolean checkLogin(String username, String password) {
		//通过对于账号信息表信息的读取验证
		if(userDao.findPasswordByName(username).equals(password)) {
			return true;
		}else {
		return false;
		}
	}

}
