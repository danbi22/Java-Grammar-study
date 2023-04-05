package edu.java.swing05;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JRadioButton;
import java.awt.Font;

import javax.print.attribute.standard.PrinterInfo;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AppMain05 {

	private JFrame frame;
	private JRadioButton rbPrivate;
	private JRadioButton rbProtected;
	private JRadioButton rbPublic;
	private JRadioButton rbPackage;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JCheckBox cbAbstract;
	private JCheckBox cbFinal;
	private JCheckBox cbStatic;
	private JComboBox<String> comboBox;
	private JTextArea textArea;
	private JScrollPane scrollPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppMain05 window = new AppMain05();
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
	public AppMain05() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("D2Coding", Font.PLAIN, 12));
		frame.setBounds(100, 100, 604, 629);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		rbPrivate = new JRadioButton("private");
		rbPrivate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				handleRadioButtonClick(e);
			}
		});
		buttonGroup.add(rbPrivate);
		rbPrivate.setFont(new Font("D2Coding", Font.PLAIN, 24));
		rbPrivate.setBounds(8, 6, 121, 83);
		frame.getContentPane().add(rbPrivate);
		
		rbPackage = new JRadioButton("package");
		rbPackage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				handleRadioButtonClick(e);
			}
		});
		buttonGroup.add(rbPackage);
		rbPackage.setFont(new Font("D2Coding", Font.PLAIN, 24));
		rbPackage.setBounds(147, 6, 121, 83);
		frame.getContentPane().add(rbPackage);
		
		rbProtected = new JRadioButton("protected");
		rbProtected.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				handleRadioButtonClick(e);
			}
		});
		buttonGroup.add(rbProtected);
		rbProtected.setFont(new Font("D2Coding", Font.PLAIN, 24));
		rbProtected.setBounds(283, 6, 143, 83);
		frame.getContentPane().add(rbProtected);
		
		rbPublic = new JRadioButton("public");
		rbPublic.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				handleRadioButtonClick(e);
				
			}
		});
		buttonGroup.add(rbPublic);
		rbPublic.setFont(new Font("D2Coding", Font.PLAIN, 24));
		rbPublic.setBounds(451, 6, 121, 83);
		frame.getContentPane().add(rbPublic);
		
		cbAbstract = new JCheckBox("abstract");
		cbAbstract.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				handleCheckBoxClick(e);
			}
		});
		cbAbstract.setFont(new Font("D2Coding", Font.PLAIN, 24));
		cbAbstract.setBounds(8, 92, 121, 63);
		frame.getContentPane().add(cbAbstract);
		
		cbFinal = new JCheckBox("final");
		cbFinal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				handleCheckBoxClick(e);
			}
		});
		cbFinal.setFont(new Font("D2Coding", Font.PLAIN, 24));
		cbFinal.setBounds(157, 92, 90, 63);
		frame.getContentPane().add(cbFinal);
		
		cbStatic = new JCheckBox("static");
		cbStatic.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				handleCheckBoxClick(e);
			}
		});
		cbStatic.setFont(new Font("D2Coding", Font.PLAIN, 24));
		cbStatic.setBounds(265, 91, 121, 63);
		frame.getContentPane().add(cbStatic);
		// JComboBox<String> b = new JComboBox<>();
		comboBox = new JComboBox<>();
		String[]	items = {"naver.com", "gmail.com", "kakao.com"};
		DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>(items);
		comboBox.setModel(model);
		comboBox.setBounds(12, 180, 298, 38);
		frame.getContentPane().add(comboBox);
		
		JButton btnInfo = new JButton("확인");
		btnInfo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				PrinterInfo();
			}
		});
		btnInfo.setFont(new Font("굴림", Font.PLAIN, 14));
		btnInfo.setBounds(423, 177, 97, 44);
		frame.getContentPane().add(btnInfo);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(8, 260, 566, 272);
		frame.getContentPane().add(scrollPane);
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
	}

	private void PrinterInfo() {
		// 라디오 버튼, 체크박스, 콤보박스의 상태를 JTextArea에 출력
		
		StringBuffer buffer = new StringBuffer(); // textArea에 출력할 문자열을 저장하기 위해서
		
		// 어떤 라디오 버튼이 선택됐는 지를 체크
		if (rbPrivate.isSelected()) {
			buffer.append(rbPrivate.getText());
		} else if (rbPackage.isSelected()) {
			buffer.append(rbPackage.getText());
		} else if (rbProtected.isSelected()) {
			buffer.append(rbProtected.getText());
		} else {
			buffer.append(rbPublic.getText());
		}
		buffer.append(" 라디오 버튼 선택됨.\n");
		
		// 체크박스들의 선택 여부를 확인.
		if (cbAbstract.isSelected()) {
			buffer.append(cbAbstract.getText()).append(" ");
		}
		if (cbFinal.isSelected()) {
			buffer.append(cbFinal.getText()).append(" ");
		}
		if (cbStatic.isSelected()) {
			buffer.append(cbStatic.getText()).append(" ");
		}
		buffer.append(" 체크박스 선택됨.\n");
		
		// 콤보박스에서 선택된 아이템 찾기
		String item = (String) comboBox.getSelectedItem();
		buffer.append(item).append(" 콤보박스 선택됨.\n");
		
		// 버퍼의 내용을 textArea에 출력
		textArea.setText(buffer.toString());
	}

	private void handleCheckBoxClick(ActionEvent event) {
		// 클릭 이벤트가 발행한 이벤트 소스(체크박스)를 찾음
		JCheckBox chBox = (JCheckBox) event.getSource();
		
		// 체크박스의 텍스트를 찾음
		String text = chBox.getText();
		
		// 체크박스의 체크(선택) 여부 확인
		boolean selected = chBox.isSelected();
		
		// 정보 출력
		textArea.setText(text+":"+selected);
		
	}

	private void handleRadioButtonClick(ActionEvent event) {
		// 클릭 이벤트가 발생한 이벤트 소스(라디오 버튼)를 찾음.
		JRadioButton btn = (JRadioButton) event.getSource();
		
		// 라디오 버튼의 텍스트를 찾음
		String btnText = btn.getText();
		
		// 라디오 버튼의 선택(체크) 여부를 확인
		Boolean selected = btn.isSelected();
		
		// 결과를 JTextArea에 출력.
		textArea.setText(btnText+":"+selected);
	}
}
