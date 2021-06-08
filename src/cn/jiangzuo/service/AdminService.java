package cn.jiangzuo.service;

import java.util.ArrayList;
import java.util.Date;

import cn.jiangzuo.domain.FangAn;

public interface AdminService {
	//管理员执行的操作
	//插入一条记录到数据库中
	public boolean addRecord(String kehu,String sefen_id,Date date
			,String yanse,float jiage,String pantone,String yuanliao,ArrayList<FangAn> lists);

	//验证账号密码是否正确，返回结果
	public boolean checkLogin(String username,String password);
}
