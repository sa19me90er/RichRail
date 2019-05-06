package nl.hu.presentation;

import java.awt.EventQueue;

import javax.swing.JFrame;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;

import nl.hu.command.AddCommand;
import nl.hu.command.DeleteTrainCommand;
import nl.hu.command.DeleteWagonCommand;
import nl.hu.domain.Train;
<<<<<<< HEAD
import nl.hu.domain.WagonFacade;
=======
import nl.hu.domain.Wagon;
>>>>>>> branch 'master' of https://github.com/sa19me90er/RichRail.git
import nl.hu.logic.TrainService;
import nl.hu.logic.WagonService;

import com.jgoodies.forms.layout.FormSpecs;

import javax.swing.ImageIcon;
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
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JCheckBoxMenuItem;

public class GUIInterface {

	private JFrame frame;
	private JTextField txtTrainName;
<<<<<<< HEAD
	private JTextField txtWagonType;
	private JTextField txtWagonId;
	private JButton btnAddNewComponent;
	private JComboBox comboBox;
=======
	private JComboBox wagonComboBox;
>>>>>>> branch 'master' of https://github.com/sa19me90er/RichRail.git
	private JButton btnMakeComponent;
	private JButton btnHideTrain;
<<<<<<< HEAD
	private TrainService trainService=new TrainService();
	private WagonFacade wagonFacade = new WagonFacade();

=======
	private TrainService trainService=new TrainService(); 
	private JTextField newWagonId;
>>>>>>> branch 'master' of https://github.com/sa19me90er/RichRail.git


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIInterface window = new GUIInterface();
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
	public GUIInterface() {
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
		
		ImageIcon image = new ImageIcon("C:\\Users\\sameer khalili\\git\\richRail\\RichRail\\images\\strain.png");
	
		
		JPanel trainsPanel = new JPanel();
		trainsPanel.setBackground(new Color(0, 128, 128));
		trainsPanel.setBounds(0, 0, 671, 132);
		frame.getContentPane().add(trainsPanel);
		trainsPanel.setLayout(null);
		
		JLabel labelTest = new JLabel(image);
		labelTest.setFont(new Font("Tahoma", Font.BOLD, 15));
		labelTest.setForeground(Color.YELLOW);
		labelTest.setBounds(61, 31, 549, 34);
		trainsPanel.add(labelTest);
		
		txtTrainName = new JTextField();
		txtTrainName.setText("");
		txtTrainName.setBounds(125, 144, 86, 20);
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
		
<<<<<<< HEAD
		txtWagonType = new JTextField();
		txtWagonType.setText("Wagon type");
		txtWagonType.setBounds(366, 170, 86, 20);
		frame.getContentPane().add(txtWagonType);
		txtWagonType.setColumns(10);
		
		txtWagonId = new JTextField();
		txtWagonId.setText("ID");
		txtWagonId.setBounds(366, 145, 86, 20);
		frame.getContentPane().add(txtWagonId);
		txtWagonId.setColumns(10);
		
		btnAddNewComponent = new JButton("Add Component to trains");
		btnAddNewComponent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnAddNewComponent.setBounds(472, 218, 154, 23);
		frame.getContentPane().add(btnAddNewComponent);
		
=======
>>>>>>> branch 'master' of https://github.com/sa19me90er/RichRail.git
		JComboBox trainComboBox = new JComboBox();
		trainComboBox.setBounds(125, 219, 86, 20);
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
		
		wagonComboBox = new JComboBox();
		wagonComboBox.setBounds(376, 219, 86, 20);
		frame.getContentPane().add(wagonComboBox);
		WagonService wagonService= new WagonService();
		List<Wagon> wagons= wagonService.getAllWagons();
		for (Wagon wagon : wagons){
			wagonComboBox.addItem(wagon.getWagonID());
		}
		
		btnMakeComponent = new JButton("Make component");
		btnMakeComponent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				wagonFacade.makeWagon(txtWagonId.getText(),txtWagonType.getText());
				
				
			}
		});
		btnMakeComponent.setBounds(487, 143, 113, 23);
		frame.getContentPane().add(btnMakeComponent);
		
		btnHideTrain = new JButton("Hide Train");
		btnHideTrain.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				labelTest.setText("");
			}
		});
		btnHideTrain.setBounds(217, 252, 113, 23);
		frame.getContentPane().add(btnHideTrain);
		
		newWagonId = new JTextField();
		newWagonId.setBounds(376, 143, 86, 20);
		frame.getContentPane().add(newWagonId);
		newWagonId.setColumns(10);
		
		
		
	
		
		
		JMenu mnNewMenu = new JMenu("Chose a command:");
		JMenuItem deleteTrain = new JMenuItem("Delete the train");
		JMenuItem deleteWagon = new JMenuItem("Delete the wagon");
		JMenuItem addWagonTo = new JMenuItem("Add wagon to train");
		JMenuItem remWagon = new JMenuItem("remove wagon from train");

		

		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(487, 218, 161, 22);
		menuBar.add(mnNewMenu);
		mnNewMenu.add(deleteTrain);
		mnNewMenu.add(deleteWagon);
		mnNewMenu.add(addWagonTo);
		mnNewMenu.add(remWagon);
		
		frame.getContentPane().add(menuBar);
		
		
		
		// Command Pattern:
		
		//Delete Train:
		
		deleteTrain.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				 
				Train train = (Train) trainComboBox.getSelectedItem();
				DeleteTrainCommand deleteTrain= new DeleteTrainCommand(train.getTrainID());
				deleteTrain.execute();
			}
		});
		
		// Delete Wagon:
		
		deleteWagon.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				String wagonId = String.valueOf(wagonComboBox.getSelectedItem());
				DeleteWagonCommand deleteWagon= new DeleteWagonCommand(wagonId);
				deleteWagon.execute();
			}
		});
			
		
		//Add Wagon To Train		
		addWagonTo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				String wagonId = String.valueOf(wagonComboBox.getSelectedItem());
				Train train =  (Train) trainComboBox.getSelectedItem();
				String trainId= train.getTrainID();
				Wagon wagon =  wagonService.getWagonById(wagonId);
		//		System.out.println(wagonService.getWagonById(wagonId));
				wagonService.updateWagon(wagon.getWagonID(), wagon.getSeats(), wagon.getType(), trainId);
//				AddCommand addCommand= new AddCommand(wagonId,trainId);
//				addCommand.execute();
			}
		});
		
		//remove wagon from train
		
		remWagon.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				String wagonId = String.valueOf(wagonComboBox.getSelectedItem());
				Wagon wagon =  wagonService.getWagonById(wagonId);
				wagonService.updateWagon(wagon.getWagonID(), wagon.getSeats(), wagon.getType(), null);

			}
		});
		
		
		
	}
}
