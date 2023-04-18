package recorderView;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import recorderController.RecorderDaoImpl;
import recorderModel.Recorder;


public class RecorderMainFrame {
	
	private static final String[] COLUMN_NAME = {"Name", "InitialValue", "GrowthRate", "FinalValue", "Memo"};
	
	private JFrame frame;
	private JTable table;
	private JButton btnStatistic;
	private JScrollPane scrollPane;
	private JPanel panel_1;
	private JButton btnCreate;
	private JPanel panel;
	private RecorderDaoImpl dao = RecorderDaoImpl.getInstance();
	private DefaultTableModel model;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RecorderMainFrame window = new RecorderMainFrame();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public void resetTableModel() {
		// 빈 행의 테이블 생성
		model = new DefaultTableModel(null, COLUMN_NAME);
		// 데이터를 다시 불러옴. 불러온 데이터를 행에 추가
		loadContactData();
		// 
		table.setModel(model);
	}
	
	private void loadContactData(){
		List<Recorder> list = dao.read();
		for(Recorder r : list) {
			Object[] row = {r.getName(), r.getInitialValue(), r.getGrowthRate(), r.getFinalValue(), r.getMemo()};
			model.addRow(row);
		}
	}
	
	/**
	 * Create the application.
	 */
	public RecorderMainFrame() {
		initialize();
		loadContactData();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(500, 300, 660, 480);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		frame.setTitle("Recorder");
		
		panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.NORTH);
		panel.setLayout(new BorderLayout(0, 0));
		
		btnStatistic = new JButton("통계");
		btnStatistic.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnStatistic.setHorizontalAlignment(SwingConstants.LEFT);
		panel.add(btnStatistic, BorderLayout.WEST);
		
		panel_1 = new JPanel();
		frame.getContentPane().add(panel_1, BorderLayout.SOUTH);
		
		btnCreate = new JButton("+");
		btnCreate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RecorderCreateFrame.showContactCreateFrame(frame, RecorderMainFrame.this);
			}
		});
		panel_1.add(btnCreate);
		
		scrollPane = new JScrollPane();
		frame.getContentPane().add(scrollPane, BorderLayout.CENTER);
		
		table = new JTable();
		model = new DefaultTableModel(null, COLUMN_NAME);
			
		table.setModel(model);
		
		scrollPane.setViewportView(table);
	}

	

}