package cn.jiangzuo.dao;

import java.util.ArrayList;

import cn.jiangzuo.domain.JiaoYi;

public interface JiaoYiDao {
	
	//����jiaoyi�������м�¼
	public ArrayList<JiaoYi> findAll();
	//�����¼��jiaoyi����
	public boolean insert(JiaoYi jiaoyi);
	

}
