package nl.hu.RichRail;

import java.awt.EventQueue;

import javax.swing.JFrame;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;

import nl.hu.domain.Train;
import nl.hu.logic.TrainService;

import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.Font;

public class RichRailFrame {

	private JFrame frame;
	private JTextField txtTrainName;
	private JTextField txtWagonType;
	private JTextField txtNumberOfSeats;
	private JButton btnAddNewComponent;
	private JComboBox comboBox;
	private JButton btnMakeComponent;
	private JButton btnDeleteComponent;
	private JButton btnHideTrain;
	private TrainService trainService=new TrainService(); 


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RichRailFrame window = new RichRailFrame();
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
	public RichRailFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.control);
		frame.setBounds(100, 100, 687, 335);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel trainsPanel = new JPanel();
		trainsPanel.setBackground(new Color(0, 128, 128));
		trainsPanel.setBounds(0, 0, 671, 132);
		frame.getContentPane().add(trainsPanel);
		trainsPanel.setLayout(null);
		
		JLabel labelTest = new JLabel("");
		labelTest.setFont(new Font("Tahoma", Font.BOLD, 15));
		labelTest.setForeground(Color.YELLOW);
		labelTest.setBounds(61, 31, 138, 14);
		trainsPanel.add(labelTest);
		
		txtTrainName = new JTextField();
		txtTrainName.setText("");
		txtTrainName.setBounds(10, 143, 197, 20);
		frame.getContentPane().add(txtTrainName);
		txtTrainName.setColumns(10);
		
		JButton btnMakeTrain = new JButton("Make train");
		btnMakeTrain.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				//Make Train in DB!!
				
				trainService.makeTrain(txtTrainName.getText());
			}
		});
		btnMakeTrain.setBounds(217, 143, 116, 23);
		frame.getContentPane().add(btnMakeTrain);
		
		txtWagonType = new JTextField();
		txtWagonType.setText("Wagon type");
		txtWagonType.setBounds(366, 143, 86, 20);
		frame.getContentPane().add(txtWagonType);
		txtWagonType.setColumns(10);
		
		txtNumberOfSeats = new JTextField();
		txtNumberOfSeats.setText("Number of seats");
		txtNumberOfSeats.setBounds(366, 174, 86, 20);
		frame.getContentPane().add(txtNumberOfSeats);
		txtNumberOfSeats.setColumns(10);
		
		btnAddNewComponent = new JButton("Add Component to trains");
		btnAddNewComponent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnAddNewComponent.setBounds(472, 218, 154, 23);
		frame.getContentPane().add(btnAddNewComponent);
		
		JComboBox trainComboBox = new JComboBox();
		trainComboBox.setBounds(10, 185, 197, 20);
		frame.getContentPane().add(trainComboBox);
		
		// haal trains van database
		
		List<Train> trains= trainService.getAllTrains();
		for (Train train: trains){
			trainComboBox.addItem(train);
		}


		
		JButton btnShowTrain = new JButton("ShowTrain");
		btnShowTrain.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				labelTest.setText("Train added");
			}
		});
		btnShowTrain.setBounds(217, 218, 116, 23);
		frame.getContentPane().add(btnShowTrain);
		
		comboBox = new JComboBox();
		comboBox.setBounds(366, 219, 86, 20);
		frame.getContentPane().add(comboBox);
		
		btnMakeComponent = new JButton("Make component");
		btnMakeComponent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnMakeComponent.setBounds(472, 153, 154, 23);
		frame.getContentPane().add(btnMakeComponent);
		
		btnDeleteComponent = new JButton("Delete component");
		btnDeleteComponent.setBounds(472, 252, 154, 23);
		frame.getContentPane().add(btnDeleteComponent);
		
		btnHideTrain = new JButton("Hide Train");
		btnHideTrain.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				labelTest.setText("");
			}
		});
		btnHideTrain.setBounds(217, 252, 113, 23);
		frame.getContentPane().add(btnHideTrain);
		
		JButton btnDeleteTrainButton = new JButton("Delete Train");
		btnDeleteTrainButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Train train = (Train) trainComboBox.getSelectedItem();
				trainService.deleteTrain(train.getTrainID());
			}
		});
		btnDeleteTrainButton.setBounds(217, 184, 116, 23);
		frame.getContentPane().add(btnDeleteTrainButton);
		
	}
}
