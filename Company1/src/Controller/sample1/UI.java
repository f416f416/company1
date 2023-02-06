package Controller.sample1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Dao.implMember;
import Model.member;

import java.awt.Color;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;

public class UI extends JFrame {

	private JPanel contentPane;
	private JTextField name;
	private JTextField username;
	private JTextField password;
	private JTextField address;
	private JTextField mobile;
	private JTextField phone;
	private JTextField updatephone;
	private JTextField updatename;
	private JTextField updateId;
	private JTextField deleteId;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UI frame = new UI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public UI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 606, 437);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 255, 0));
		panel_2.setBounds(10, 10, 192, 378);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("名");
		lblNewLabel.setFont(new Font("微軟正黑體 Light", Font.BOLD, 16));
		lblNewLabel.setBounds(10, 10, 66, 29);
		panel_2.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("帳號");
		lblNewLabel_1.setFont(new Font("微軟正黑體 Light", Font.BOLD, 16));
		lblNewLabel_1.setBounds(10, 49, 66, 22);
		panel_2.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("密碼");
		lblNewLabel_2.setFont(new Font("微軟正黑體 Light", Font.BOLD, 16));
		lblNewLabel_2.setBounds(10, 94, 66, 22);
		panel_2.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("地址");
		lblNewLabel_3.setFont(new Font("微軟正黑體 Light", Font.BOLD, 16));
		lblNewLabel_3.setBounds(10, 141, 66, 22);
		panel_2.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("行動");
		lblNewLabel_4.setFont(new Font("微軟正黑體 Light", Font.BOLD, 16));
		lblNewLabel_4.setBounds(10, 191, 66, 22);
		panel_2.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("電話");
		lblNewLabel_5.setFont(new Font("微軟正黑體 Light", Font.BOLD, 16));
		lblNewLabel_5.setBounds(10, 245, 66, 22);
		panel_2.add(lblNewLabel_5);
		
		name = new JTextField();
		name.setBounds(86, 11, 96, 21);
		panel_2.add(name);
		name.setColumns(10);
		
		username = new JTextField();
		username.setColumns(10);
		username.setBounds(86, 50, 96, 21);
		panel_2.add(username);
		
		password = new JTextField();
		password.setColumns(10);
		password.setBounds(86, 95, 96, 21);
		panel_2.add(password);
		
		address = new JTextField();
		address.setColumns(10);
		address.setBounds(86, 142, 96, 21);
		panel_2.add(address);
		
		mobile = new JTextField();
		mobile.setColumns(10);
		mobile.setBounds(86, 192, 96, 21);
		panel_2.add(mobile);
		
		phone = new JTextField();
		phone.setColumns(10);
		phone.setBounds(86, 246, 96, 21);
		panel_2.add(phone);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(128, 255, 255));
		panel_1.setBounds(212, 10, 368, 378);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		
		
		
		
		
		
		JTextArea show = new JTextArea();
		show.setBounds(10, 165, 348, 168);
		panel_1.add(show);
		
		updatephone = new JTextField();
		updatephone.setBounds(156, 43, 66, 23);
		panel_1.add(updatephone);
		updatephone.setColumns(10);
		
		JLabel lblNewLabel_5_1 = new JLabel("電話");
		lblNewLabel_5_1.setFont(new Font("微軟正黑體 Light", Font.BOLD, 16));
		lblNewLabel_5_1.setBounds(107, 39, 39, 23);
		panel_1.add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_6 = new JLabel("名");
		lblNewLabel_6.setFont(new Font("微軟正黑體 Light", Font.BOLD, 16));
		lblNewLabel_6.setBounds(107, 76, 44, 29);
		panel_1.add(lblNewLabel_6);
		
		updatename = new JTextField();
		updatename.setColumns(10);
		updatename.setBounds(156, 76, 66, 23);
		panel_1.add(updatename);
		
		JButton add = new JButton("新增");
		add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*
				 * 1.UI接收 getText
				 * 2.new member()
				 * 3.add(m)
				 */
				String Name=name.getText();
				String Username=username.getText();
				String Password=password.getText();
				String Address=address.getText();
				String Mobile=mobile.getText();
				String Phone=phone.getText();
				
				member m=new member(Name,Username,Password,Address,Mobile,Phone);
				new implMember().add(m);
				
				
			}
		});
		add.setBounds(26, 314, 133, 23);
		panel_2.add(add);
		

		JLabel total = new JLabel("");
		total.setBounds(10, 343, 66, 25);
		panel_1.add(total);
		
		JButton queryAll1 = new JButton("查詢(全部)");
		queryAll1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*
				 * 1.show.setText-->queryAll1():String
				 */
				show.setText(new implMember().queryAll1());
				
				List<member> l=new implMember().queryAll2();
				total.setText("共:"+l.size()+"筆");
			}
		});
		queryAll1.setBounds(10, 10, 136, 23);
		panel_1.add(queryAll1);
		
		JLabel SS = new JLabel("id");
		SS.setBounds(232, 47, 46, 15);
		panel_1.add(SS);
		
		updateId = new JTextField();
		updateId.setColumns(10);
		updateId.setBounds(264, 47, 66, 23);
		panel_1.add(updateId);
		
		JButton btnNewButton_1_1 = new JButton("修改");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*
				 * 1.nameUpdate,addressUpdate ,updateId-->getText
				 * 2.updateId-->轉成int--->queryId(id)-->member m
				 * 3.m.setName(),m.setAddress()
				 * 4.update(m)
				 */
				
				String Name=updatename.getText();
				String Phone=updatephone.getText();
				
				int ID=Integer.parseInt(updateId.getText());				
				member m=new implMember().queryId(ID);
				m.setName(Name);
				m.setPhone(Phone);
				
				new implMember().update(m);
						
				
			}
		});
		btnNewButton_1_1.setBounds(10, 43, 87, 23);
		panel_1.add(btnNewButton_1_1);
		
		JLabel sss = new JLabel("id");
		sss.setFont(new Font("微軟正黑體 Light", Font.BOLD, 15));
		sss.setBackground(new Color(240, 240, 240));
		sss.setBounds(107, 119, 46, 18);
		panel_1.add(sss);
		
		deleteId = new JTextField();
		deleteId.setBounds(156, 118, 66, 21);
		panel_1.add(deleteId);
		deleteId.setColumns(10);
		
		JButton delete = new JButton("刪除");
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*
				 * 1.deleteId-->getText-->轉型-->int
				 * 2.執行 delete(id)
				 */
				int Id=Integer.parseInt(deleteId.getText());
				new implMember().delete(Id);
			}
		});
		delete.setBounds(10, 115, 87, 23);
		panel_1.add(delete);
		
	}
}
