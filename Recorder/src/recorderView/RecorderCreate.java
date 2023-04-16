package recorderView;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RecorderCreate {

	private JFrame frame;
	private JTextField TFName;
	private JTextField TFInit;
	private JTextField TFFinal;
	private JTextField TFMemo;
	private JButton btnNewButton;
	private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RecorderCreate window = new RecorderCreate();
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
	public RecorderCreate() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 349);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
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
			}
		});
		btnNewButton.setBounds(56, 259, 131, 43);
		frame.getContentPane().add(btnNewButton);
		
		btnNewButton_1 = new JButton("취소");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton_1.setBounds(233, 259, 131, 43);
		frame.getContentPane().add(btnNewButton_1);
	}
}
