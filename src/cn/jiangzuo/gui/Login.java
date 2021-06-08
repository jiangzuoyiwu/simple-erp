package cn.jiangzuo.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import cn.jiangzuo.service.impl.AdminServiceImpl;

@SuppressWarnings("serial")
public class Login extends JFrame implements ActionListener {

	/*
	 * ��¼���棬��ɵ�¼����ת��Index����
	 * ������������б�ǩ�������ֱ�Ϊ�˺š�����
	 * �ı����������ֱ�Ϊ�˺���������������
	 * ��ť�������ֱ�Ϊ��¼��ť�����ð�ť
	 * �����ť�¼��ֱ�Ϊ
	 * ��¼��ť����˺š����������ݿ��ڲ����Ƿ���ȷ����ȷ�����ת
	 * ���������ʾ��Ϣ��������ʾ�ڵ�����Ҳ������ʾ�ڽ��棩
	 * ���ð�ť��ɶ��˺�������������������ݵ����
	 * ��ϸ�������£�
	 * �����СΪ1000*700
	 * �˺ű�ǩ��СΪ30*50��λ��Ϊ200*30
	 * */
	private JLabel usernamelabel,passwordlabel;
	private JTextField username;
	private JPasswordField password;
	private JButton denglu,chongzhi;
	private JPanel rongqi;
	private AdminServiceImpl adminService;
	//��������
	public Login() {
		adminService=new AdminServiceImpl();
		this.setSize(1000, 700);
		username=new JTextField();
		username.setSize(200, 30);
		username.setLocation(400, 300);
		password=new JPasswordField();
		password.setSize(200, 30);
		password.setLocation(400,400);
		denglu=new JButton("��¼");
		denglu.setSize(80, 40);
		denglu.setLocation(400, 520);
		//ʹ������ʢ�ſؼ�
		rongqi=new JPanel();
		rongqi.setLayout(null);
		rongqi.setSize(1000, 700);
		
		rongqi.add(username);
		rongqi.add(password);
		rongqi.add(denglu);
		this.add(rongqi);
		this.setLayout(null);
		this.setVisible(true);
		denglu.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==denglu) {
			//��ȡ�ı����ڵ��˺����룬��ɶ��˺��������֤
			String user=this.username.getText();
			String passwd=this.password.getText();
			//ʹ��adminService�����ݣ������֤
			if(adminService.checkLogin(user,passwd)) {
				new Index();
				this.setVisible(false);
				this.dispose();
			}else {
				System.out.println("�˺����벻��");
			}
		}
	}
	//

}
