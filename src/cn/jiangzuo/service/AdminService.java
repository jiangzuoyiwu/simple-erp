package cn.jiangzuo.service;

import java.util.ArrayList;
import java.util.Date;

import cn.jiangzuo.domain.FangAn;

public interface AdminService {
	//����Աִ�еĲ���
	//����һ����¼�����ݿ���
	public boolean addRecord(String kehu,String sefen_id,Date date
			,String yanse,float jiage,String pantone,String yuanliao,ArrayList<FangAn> lists);

	//��֤�˺������Ƿ���ȷ�����ؽ��
	public boolean checkLogin(String username,String password);
}
