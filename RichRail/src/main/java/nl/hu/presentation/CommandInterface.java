package nl.hu.presentation;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.SystemColor;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import nl.hu.interpreter.Logger;
import nl.hu.interpreter.NewTrainCommand;
import nl.hu.interpreter.RailCompany;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JInternalFrame;
import javax.swing.JTextArea;
import javax.swing.JLabel;

public class CommandInterface {

	private JFrame frame;
	private JTextField textField;
	private JTextField txtCommand;
	private JTextField txtCommand_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CommandInterface window = new CommandInterface();
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
	public CommandInterface() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.control);
		frame.setBounds(100, 100, 687, 449);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
	
		JLabel logerLabel = new JLabel("");
		logerLabel.setBackground(Color.WHITE);
		logerLabel.setBounds(10, 39, 260, 173);
		frame.getContentPane().add(logerLabel);
		
	JButton btnExecute = new JButton("execute");
	btnExecute.addActionListener(new ActionListener() {

		
		public void actionPerformed(ActionEvent e) {
			RailCompany railComapany = new RailCompany();
			railComapany.parse(txtCommand_1.getText());
			txtCommand_1.removeAll();
			Logger logger = railComapany.getLogger();
			ArrayList<String> logStringlist = logger.getLog();
			for (String logString: logStringlist){
				txtCommand_1.setText(logString);
			}
			
		}
	});
	btnExecute.setBounds(330, 366, 97, 25);
	frame.getContentPane().add(btnExecute);
	
	txtCommand_1 = new JTextField();
	txtCommand_1.setText("Command");
	txtCommand_1.setBounds(70, 367, 221, 22);
	frame.getContentPane().add(txtCommand_1);
	txtCommand_1.setColumns(10);
	


	}
		}
