package edu.java.swing04_1;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

public class subject {
	// 이미지 파일의 경로들을 저장하는 배열
	private static final String[]	IMAGES = {
			"images/1.jpg",
			"images/2.jpg",
			"images/3.jpg",
			"images/4.jpg",
			"images/5.jpg",
	};
	
	private int curIndex; // 현재 화면에 보여지는 이미지 파일의 인덱스
	private JFrame frame;
	private JButton btnLeft;
	private JButton btnRight;
	private JLabel lblView;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					subject window = new subject();
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
	public subject() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1200, 1000);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		lblView = new JLabel(new ImageIcon(IMAGES[curIndex]));
		lblView.setBounds(196, 155, 800, 600);
		frame.getContentPane().add(lblView);
		
		btnLeft = new JButton("<");
		btnLeft.setFont(new Font("굴림", Font.PLAIN, 30));
		btnLeft.addActionListener(e -> showPrevImage());
		btnLeft.setBounds(234, 820, 231, 81);
		frame.getContentPane().add(btnLeft);
		
		btnRight = new JButton(">");
		btnRight.setFont(new Font("굴림", Font.PLAIN, 30));
		btnRight.addActionListener((e) -> showNextImage());
		btnRight.setBounds(674, 820, 231, 81);
		frame.getContentPane().add(btnRight);
	}

	private void showPrevImage() {
		if (curIndex > 0) {
			curIndex--;
		} else {
			curIndex = 4;
		}
		lblView.setIcon(new ImageIcon(IMAGES[curIndex]));	
	}

	private void showNextImage() {
		if (curIndex < IMAGES.length-1) {
			curIndex++;	
		} else {
			curIndex = 0;
		}		
		lblView.setIcon(new ImageIcon(IMAGES[curIndex]));
	}

	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
