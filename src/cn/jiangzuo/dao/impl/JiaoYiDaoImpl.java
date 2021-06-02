package cn.jiangzuo.dao.impl;

import java.sql.ResultSet;
import java.util.ArrayList;

import cn.jiangzuo.dao.JiaoYiDao;
import cn.jiangzuo.domain.JiaoYi;
import cn.jiangzuo.common.Common;

public class JiaoYiDaoImpl implements JiaoYiDao {
	private Common common;
	
	public JiaoYiDaoImpl() {
		common=new Common("jdbc:mysql://localhost:3306/jiandanerp?serverTimezone=UTC", "jiandan", "jiandan123456");
	}

	@Override
	public ArrayList<JiaoYi> findAll() {
		ArrayList<JiaoYi> lists=new ArrayList<JiaoYi>();
		try {
			ResultSet result=common.findAll("select * from jiaoyi");
			while(result.next()) {
				JiaoYi jiaoyi=new JiaoYi();
				jiaoyi.setRiqi(result.getDate("riqi"));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lists;
	}

	@Override
	public boolean insert(JiaoYi jiaoyi) {
		// TODO Auto-generated method stub
		return false;
	}

}
