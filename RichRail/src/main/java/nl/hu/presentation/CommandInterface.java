package nl.hu.presentation;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.SystemColor;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import nl.hu.command.Logger;
import nl.hu.command.RailCompany;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
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
		logerLabel.setForeground(Color.WHITE);
		logerLabel.setBackground(Color.BLACK);
		logerLabel.setBounds(10, 39, 593, 289);
		frame.getContentPane().add(logerLabel);
		
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(53, 254, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		
	JButton btnExecute = new JButton("execute");
	btnExecute.addActionListener(new ActionListener() {

		
		public void actionPerformed(ActionEvent e) {
			RailCompany railComapany = new RailCompany();
			railComapany.parse(txtCommand_1.getText());
			txtCommand_1.setText("");

			Logger logger = RailCompany.getInstance().getLogger();
			ArrayList<String> logs = logger.getLog();
			logerLabel.setText("<html>");
			
			for (String log: logs){
				System.out.println(log);
				lblNewLabel.setText(log);
				logerLabel.add(lblNewLabel);
				logerLabel.setText( logerLabel.getText() +  "<p>" + log + "</p>" );
			}
			logerLabel.setText(logerLabel.getText() +"</html>");			
			
		}
	});
	btnExecute.setBounds(330, 366, 97, 25);
	frame.getContentPane().add(btnExecute);
	
	txtCommand_1 = new JTextField();
	txtCommand_1.setBounds(70, 367, 221, 22);
	frame.getContentPane().add(txtCommand_1);
	txtCommand_1.setColumns(10);
	
	JPanel panel = new JPanel();
	panel.setBackground(Color.BLACK);
	panel.setBounds(0, 0, 626, 343);
	frame.getContentPane().add(panel);

	}
		}
