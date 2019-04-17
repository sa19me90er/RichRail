package nl.hu.presentation;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.SystemColor;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JInternalFrame;
import javax.swing.JTextArea;

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
	
	JPanel trainsPanel = new JPanel();
	trainsPanel.setBackground(new Color(0, 128, 128));
	trainsPanel.setBounds(0, 0, 671, 132);
	frame.getContentPane().add(trainsPanel);
	trainsPanel.setLayout(null);
	
	JButton btnExecute = new JButton("execute");
	btnExecute.setBounds(330, 366, 97, 25);
	frame.getContentPane().add(btnExecute);
	
	txtCommand_1 = new JTextField();
	txtCommand_1.setText("Command");
	txtCommand_1.setBounds(112, 367, 68, 22);
	frame.getContentPane().add(txtCommand_1);
	txtCommand_1.setColumns(10);
	

	}
		}
