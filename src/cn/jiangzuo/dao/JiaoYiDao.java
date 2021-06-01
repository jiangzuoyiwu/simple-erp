package cn.jiangzuo.dao;

import java.util.ArrayList;

import cn.jiangzuo.domain.JiaoYi;

public interface JiaoYiDao {
	
	//查找jiaoyi表中所有记录
	public ArrayList<JiaoYi> findAll();
	//插入记录到jiaoyi表中
	public boolean insert(JiaoYi jiaoyi);
	

}
