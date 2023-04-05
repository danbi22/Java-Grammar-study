package edu.java.swing06;

import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class MyFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void showMyFrame(Component parent) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					MyFrame frame = new MyFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
		});
		
	
	}
	private MyFrame() {
		initialize();
	}
	
	/**
	 * Create the frame.
	 */
	public void initialize() {
		setTitle("MyFrame");
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // JFrame을 상속하고 있어서 바로 메서드 사용이 가능하다
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
	}

}
