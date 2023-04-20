package farmView;

import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JProgressBar;

import farmModel.Crop;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GrowingCropFrame {

	private JFrame frame;
	private JLabel lblNewLabel;
	private JProgressBar lPBar;
	private Component parent;
	private Crop crop;
	private JButton btnWatering;
	private ImageIcon banana1Icon;
	private ImageIcon banana2Icon;
	private ImageIcon banana3Icon;
	private ImageIcon wateringIcon;

	/**
	 * Launch the application.
	 */
	public static void showGrowingCropFrame(Component parent, Crop crop) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GrowingCropFrame window = new GrowingCropFrame(parent, crop);
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
	public GrowingCropFrame(Component parent, Crop crop) {
		this.parent = parent;
		this.crop = crop;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 471, 577);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(147, 139, 178, 156);
		banana1Icon = new ImageIcon("image.banana1.png");
		banana1Icon = new ImageIcon("image.banana2.png");
		banana1Icon = new ImageIcon("image.banana3.png");
		frame.getContentPane().add(lblNewLabel);
		
		btnWatering = new JButton("물주기");
		btnWatering.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnWatering.setBounds(240, 379, 200, 110);
		wateringIcon = new ImageIcon("image/watering.png");
		btnWatering.setIcon(wateringIcon);
		frame.getContentPane().add(btnWatering);
		
		
		lPBar = new JProgressBar(0, 100);
		lPBar.setBounds(116, 319, 229, 23);
		lPBar.setValue((int)crop.getLevelPoint());
		
		frame.getContentPane().add(lPBar);
	}
}
