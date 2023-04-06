package edu.java.swing07;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.security.PublicKey;
import java.awt.event.ActionEvent;

public class AppMain07 {
	// JTable에서 사용할 컬럼 이름
	private static final String[] COLUMN_NAMES = {"국어", "영어", "수학", "총점", "평균"};
	
	// 테이블의 행과 열에 대한 정보를 갖는 객체
	private DefaultTableModel model;
	
	private JFrame frame;
	private JTextField textKorean;
	private JTextField textEnglish;
	private JTextField textMath;
	private JTable table;
	private JScrollPane scrollPane;
	private JButton btnDelete;
	private JButton btnInput;
	int korean = 0;
	int english = 0;
	int math = 0;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppMain07 window = new AppMain07();
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
	public AppMain07() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 478, 645);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textKorean = new JTextField();
		textKorean.setBounds(120, 28, 314, 78);
		frame.getContentPane().add(textKorean);
		textKorean.setColumns(10);
		
		textEnglish = new JTextField();
		textEnglish.setColumns(10);
		textEnglish.setBounds(120, 119, 314, 78);
		frame.getContentPane().add(textEnglish);
		
		textMath = new JTextField();
		textMath.setColumns(10);
		textMath.setBounds(120, 207, 314, 78);
		frame.getContentPane().add(textMath);
		
		JLabel lblKorean = new JLabel("국어");
		lblKorean.setFont(new Font("D2Coding", Font.PLAIN, 24));
		lblKorean.setHorizontalAlignment(SwingConstants.CENTER);
		lblKorean.setBounds(12, 27, 88, 78);
		frame.getContentPane().add(lblKorean);
		
		btnInput = new JButton("입력");
		btnInput.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				insertScoreToTable();
				/*
				mathScore = Integer.parseInt(textMath.getText());
				koreanScore = Integer.parseInt(textKorean.getText());
				englishScore = Integer.parseInt(textEnglish.getText());
				textEnglish.setText("");
				textKorean.setText("");
				textMath.setText("");
				Object[] row = {koreanScore, englishScore, mathScore, score.getTotal(koreanScore, englishScore, mathScore), score.getMean(koreanScore, englishScore, mathScore)};
				model.addRow(row);
				 */
			}
		});
		btnInput.setFont(new Font("D2Coding", Font.PLAIN, 25));
		btnInput.setBounds(75, 303, 135, 78);
		frame.getContentPane().add(btnInput);
		
		btnDelete = new JButton("삭제");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				deleteRowFromTable();
			}
		});
		btnDelete.setFont(new Font("D2Coding", Font.PLAIN, 25));
		btnDelete.setBounds(256, 303, 135, 78);
		frame.getContentPane().add(btnDelete);
		
		JLabel lblEnglish = new JLabel("영어");
		lblEnglish.setFont(new Font("D2Coding", Font.PLAIN, 25));
		lblEnglish.setHorizontalAlignment(SwingConstants.CENTER);
		lblEnglish.setBounds(12, 119, 88, 78);
		frame.getContentPane().add(lblEnglish);
		
		JLabel lblMath = new JLabel("수학");
		lblMath.setHorizontalAlignment(SwingConstants.CENTER);
		lblMath.setFont(new Font("D2Coding", Font.PLAIN, 25));
		lblMath.setBounds(12, 207, 88, 78);
		frame.getContentPane().add(lblMath);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 391, 438, 210);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		Object [][] data = {}; // 테이블에 사용할 데이터
		model = new DefaultTableModel(data, COLUMN_NAMES);
		table.setModel(model);
		scrollPane.setViewportView(table);
	}

	private void deleteRowFromTable() {
		// 1. 테이블에서 삭제하기 위해 선택된 행의 인덱스를 찾음
		int index = table.getSelectedRow();
		if (index == -1) { // 테이블에서 아무 행도 선택되지 않은 경우.
			JOptionPane.showMessageDialog(
					frame, 
					"테이블에서 삭제할 행을 먼저 선택하세요", 
					"경고", 
					JOptionPane.WARNING_MESSAGE);
			return; // 메서드 종료
		}
		
		// 2. 해당 인덱스의 행을 테이블 모델에서 삭제
		int confirm = JOptionPane.showConfirmDialog(
				frame, 
				index + " 인덱스 행을 정말 삭제하시겠습니까?", 
				"삭제 확인", 
				JOptionPane.YES_NO_OPTION);
		if (confirm == JOptionPane.YES_OPTION) {
			model.removeRow(index);
		}
	}

	private void insertScoreToTable() {
		// 1. JTextField에서 3과목의 점수를 읽는다.
		try {
			korean = Integer.parseInt(textKorean.getText());
			english = Integer.parseInt(textEnglish.getText());
			math = Integer.parseInt(textMath.getText());
			if (overScore() == 1) {
				return;
			}
			
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(
					frame, 
					"정수를 입력하세요. " + e.getMessage(), 
					"입력 에러", 
					JOptionPane.ERROR_MESSAGE);
			return;
		}
		
		// 2. Score 타입 객체 생성
		Score score = new Score(korean, english, math);
		
		// 3. JTable에 행(row)을 추가
		Object[] row = {
				score.getKorean(),
				score.getEnglish(),
				score.getMath(),
				score.getTotal(),
				score.getMean()
		};
		model.addRow(row);
		
		// 모든 JTextField의 입력 내용을 지움
		clearAllTextFields();
	}
	
	private int overScore() {
		if (korean > 100 || english > 100 || math > 100) {
			JOptionPane.showMessageDialog(
					frame, 
					"점수는 100점이 넘어가면 안됩니다.", 
					"점수 확인", 
					JOptionPane.ERROR_MESSAGE);
			return 1;
		}
		return 0;
	}

	private void clearAllTextFields() {
		textKorean.setText("");
		textEnglish.setText("");
		textMath.setText("");
	}
}
