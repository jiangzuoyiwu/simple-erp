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
	 * 登录界面，完成登录后跳转到Index界面
	 * 界面包含内容有标签两个，分别为账号、密码
	 * 文本框两个，分别为账号输入框，密码输入框
	 * 按钮两个，分别为登录按钮、重置按钮
	 * 点击按钮事件分别为
	 * 登录按钮完成账号、密码在数据库内测试是否正确，正确完成跳转
	 * 错误完成提示信息（可以显示在弹窗，也可以显示在界面）
	 * 重置按钮完成对账号输入框和密码输入框内容的清空
	 * 详细布局如下：
	 * 界面大小为1000*700
	 * 账号标签大小为30*50，位置为200*30
	 * */
	private JLabel usernamelabel,passwordlabel;
	private JTextField username;
	private JPasswordField password;
	private JButton denglu,chongzhi;
	private JPanel rongqi;
	private AdminServiceImpl adminService;
	//构建界面
	public Login() {
		adminService=new AdminServiceImpl();
		this.setSize(1000, 700);
		username=new JTextField();
		username.setSize(200, 30);
		username.setLocation(400, 300);
		password=new JPasswordField();
		password.setSize(200, 30);
		password.setLocation(400,400);
		denglu=new JButton("登录");
		denglu.setSize(80, 40);
		denglu.setLocation(400, 520);
		//使用容器盛放控件
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
			//获取文本框内的账号密码，完成对账号密码的验证
			String user=this.username.getText();
			String passwd=this.password.getText();
			//使用adminService的内容，完成验证
			if(adminService.checkLogin(user,passwd)) {
				new Index();
				this.setVisible(false);
				this.dispose();
			}else {
				System.out.println("账号密码不对");
			}
		}
	}
	//

}
