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
	//������������ӷ�����Ϣ
	public boolean addFangAn(FangAn fangan) {
		
		return false;
		}
	@Override
	public boolean checkLogin(String username, String password) {
		//ͨ�������˺���Ϣ����Ϣ�Ķ�ȡ��֤
		if(userDao.findPasswordByName(username).equals(password)) {
			return true;
		}else {
		return false;
		}
	}

}
