package FarmView;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FarmMainFrame {

	private JFrame frame;
	private JButton btnLogin;
	private JTextField idTextField;
	private JTextField pwTextField;
	private JButton btnLogup;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FarmMainFrame window = new FarmMainFrame();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public FarmMainFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 667, 455);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("올팜");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 39));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(161, 36, 343, 74);
		frame.getContentPane().add(lblNewLabel);
		
		btnLogin = new JButton("로그인");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnLogin.setBounds(194, 310, 135, 53);
		frame.getContentPane().add(btnLogin);
		
		btnLogup = new JButton("회원가입");
		btnLogup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnLogup.setBounds(369, 310, 135, 53);
		frame.getContentPane().add(btnLogup);
		
		idTextField = new JTextField();
		idTextField.setBounds(210, 147, 275, 45);
		frame.getContentPane().add(idTextField);
		idTextField.setColumns(10);
		
		pwTextField = new JTextField();
		pwTextField.setColumns(10);
		pwTextField.setBounds(210, 217, 275, 45);
		frame.getContentPane().add(pwTextField);
		
		JLabel lblId = new JLabel("ID");
		lblId.setFont(new Font("굴림", Font.BOLD, 39));
		lblId.setBounds(119, 147, 59, 45);
		frame.getContentPane().add(lblId);
		
		JLabel lblPw = new JLabel("PW");
		lblPw.setFont(new Font("굴림", Font.BOLD, 39));
		lblPw.setBounds(119, 217, 79, 45);
		frame.getContentPane().add(lblPw);
	}

}
