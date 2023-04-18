package recorderView;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Component;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import recorderController.RecorderDaoImpl;
import recorderModel.Recorder;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RecorderCreateFrame {

	private JFrame frame;
	private JTextField TFName;
	private JTextField TFInit;
	private JTextField TFFinal;
	private JTextField TFMemo;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	
	private Component parent = null;
	private RecorderMainFrame app = null;
	
	private final RecorderDaoImpl dao = RecorderDaoImpl.getInstance(); 
	
	/**
	 * Launch the application.
	 */
	public static void showContactCreateFrame(Component parent, RecorderMainFrame app) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RecorderCreateFrame window = new RecorderCreateFrame(parent, app);
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
	public RecorderCreateFrame(Component parent, RecorderMainFrame app) {
		this.parent = parent;
		this.app = app;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		int x = 100;
		int y = 100;
		if (parent != null) {
			x = 660 + parent.getX();
			y = parent.getY();
		}
		frame.setBounds(x, y, 450, 349);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setTitle("기록 추가");
		
		JLabel lblInitializeValue = new JLabel("InitializeValue");
		lblInitializeValue.setBounds(11, 66, 131, 41);
		frame.getContentPane().add(lblInitializeValue);
		
		JLabel lblFinalvalue = new JLabel("FinalValue");
		lblFinalvalue.setBounds(11, 117, 131, 41);
		frame.getContentPane().add(lblFinalvalue);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(11, 15, 131, 41);
		frame.getContentPane().add(lblName);
		
		TFName = new JTextField();
		TFName.setBounds(107, 15, 317, 41);
		frame.getContentPane().add(TFName);
		TFName.setColumns(10);
		
		TFInit = new JTextField();
		TFInit.setColumns(10);
		TFInit.setBounds(107, 66, 317, 41);
		frame.getContentPane().add(TFInit);
		
		TFFinal = new JTextField();
		TFFinal.setColumns(10);
		TFFinal.setBounds(107, 117, 317, 41);
		frame.getContentPane().add(TFFinal);
		
		TFMemo = new JTextField();
		TFMemo.setBounds(11, 170, 413, 83);
		frame.getContentPane().add(TFMemo);
		TFMemo.setColumns(10);
		
		btnNewButton = new JButton("확인");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int result = createNewRecord();
				if (result == -1) {
					return;
				}
				JOptionPane.showMessageDialog(frame, result+"개의 행이 추가 되었습니다.");
				app.resetTableModel();
				frame.dispose();
			}
		});
		btnNewButton.setBounds(56, 259, 131, 43);
		frame.getContentPane().add(btnNewButton);
		
		btnNewButton_1 = new JButton("취소");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		btnNewButton_1.setBounds(233, 259, 131, 43);
		frame.getContentPane().add(btnNewButton_1);
	}

	private int createNewRecord() {
		int result = 0;
		double initialValue = 0;
		double finalValue = 0;;
		String name = TFName.getText();
		try {
			initialValue = Double.parseDouble(TFInit.getText());
			finalValue = Double.parseDouble(TFFinal.getText());
		} catch(NumberFormatException e) {
			JOptionPane.showConfirmDialog(
					frame, 
					"InitializeValue와 FinalValue에는 정수를 입력하세요", 
					"에러", 
					JOptionPane.ERROR_MESSAGE);
			return-1;
		}
		String memo = TFMemo.getText();
		
		Recorder recorder = new Recorder(name, initialValue, finalValue, memo);
		
		result = dao.create(recorder);
		
		return result;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}