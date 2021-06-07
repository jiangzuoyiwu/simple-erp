package cn.jiangzuo.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

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
	//构建界面
	public Login() {
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	//

}
