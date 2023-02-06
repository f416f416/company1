package Controller.sample2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class loginError extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					loginError frame = new loginError();
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
	public loginError() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 128));
		panel.setForeground(new Color(255, 255, 128));
		panel.setBounds(10, 10, 414, 241);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("登入失敗");
		lblNewLabel.setFont(new Font("微软雅黑", Font.BOLD, 16));
		lblNewLabel.setBounds(162, 10, 89, 63);
		panel.add(lblNewLabel);
		
		JButton relogin = new JButton("重新登入");
		relogin.setFont(new Font("微软雅黑", Font.BOLD, 16));
		relogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				loginUI l=new loginUI();
				l.show();
				dispose();
			}
		});
		relogin.setBounds(117, 97, 167, 23);
		panel.add(relogin);
		
		JButton addMember = new JButton("註冊");
		addMember.setFont(new Font("微软雅黑", Font.BOLD, 16));
		addMember.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addMemberUI a=new addMemberUI();
				a.show();
				dispose();
			}
		});
		addMember.setBounds(117, 166, 167, 23);
		panel.add(addMember);
	}
}
