package Studinfo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.Color;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JTextField;

import com.github.lgooddatepicker.components.DatePicker;

public class StudentInformationSystem {

	private JFrame frame;
	private JTable table;
	private JTextField UserIDField;
	private JTextField FnameField;
	private JTextField LnameFIeld;
	private JTextField AgeFIeld;
	private JTextField MnameFIeld;
	private JTextField FnameFIeld;
	private JTextField CpnoField;
	private JTextField AddressField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentInformationSystem window = new StudentInformationSystem();
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
	public StudentInformationSystem() {
		initialize();
		DatePicker BDate = new DatePicker();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.CYAN);
		frame.setBounds(100, 100, 800, 420);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(10, 307, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(10, 347, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setBounds(109, 307, 89, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("New button");
		btnNewButton_3.setBounds(109, 347, 89, 23);
		frame.getContentPane().add(btnNewButton_3);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(233, 29, 541, 341);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"UserID", "FirstName", "LastName", "Age", "BirthDate", "MotherName", "FatherName", "CellphoneNumber", "Address"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(43);
		table.getColumnModel().getColumn(1).setPreferredWidth(58);
		table.getColumnModel().getColumn(2).setPreferredWidth(57);
		table.getColumnModel().getColumn(3).setPreferredWidth(34);
		table.getColumnModel().getColumn(4).setPreferredWidth(55);
		table.getColumnModel().getColumn(5).setPreferredWidth(71);
		table.getColumnModel().getColumn(6).setPreferredWidth(69);
		table.getColumnModel().getColumn(8).setPreferredWidth(49);
		scrollPane.setViewportView(table);
		
		JLabel useridLabel = new JLabel("UserID");
		useridLabel.setBounds(10, 30, 46, 14);
		frame.getContentPane().add(useridLabel);
		
		JLabel FnameLabel = new JLabel("FirstName");
		FnameLabel.setBounds(10, 53, 53, 14);
		frame.getContentPane().add(FnameLabel);
		
		JLabel LnameLabel_1 = new JLabel("LastName");
		LnameLabel_1.setBounds(10, 78, 53, 14);
		frame.getContentPane().add(LnameLabel_1);
		
		JLabel AgeLabel_2 = new JLabel("Age");
		AgeLabel_2.setBounds(10, 103, 46, 14);
		frame.getContentPane().add(AgeLabel_2);
		
		JLabel BdateLabel_3 = new JLabel("BirthDate");
		BdateLabel_3.setBounds(10, 128, 46, 14);
		frame.getContentPane().add(BdateLabel_3);
		
		JLabel MnameLabel_4 = new JLabel("MotherName");
		MnameLabel_4.setBounds(10, 151, 65, 14);
		frame.getContentPane().add(MnameLabel_4);
		
		JLabel FnameLabel_5 = new JLabel("FatherName");
		FnameLabel_5.setBounds(10, 176, 65, 14);
		frame.getContentPane().add(FnameLabel_5);
		
		JLabel CpnoLabel_6 = new JLabel("CellphoneNumber");
		CpnoLabel_6.setBounds(10, 201, 89, 14);
		frame.getContentPane().add(CpnoLabel_6);
		
		JLabel AddressLabel_7 = new JLabel("Address");
		AddressLabel_7.setBounds(10, 226, 46, 14);
		frame.getContentPane().add(AddressLabel_7);
		
		UserIDField = new JTextField();
		UserIDField.setBounds(66, 27, 132, 20);
		frame.getContentPane().add(UserIDField);
		UserIDField.setColumns(10);
		
		FnameField = new JTextField();
		FnameField.setBounds(66, 50, 132, 20);
		frame.getContentPane().add(FnameField);
		FnameField.setColumns(10);
		
		LnameFIeld = new JTextField();
		LnameFIeld.setBounds(66, 75, 132, 20);
		frame.getContentPane().add(LnameFIeld);
		LnameFIeld.setColumns(10);
		
		AgeFIeld = new JTextField();
		AgeFIeld.setBounds(66, 100, 86, 20);
		frame.getContentPane().add(AgeFIeld);
		AgeFIeld.setColumns(10);
		
		MnameFIeld = new JTextField();
		MnameFIeld.setBounds(80, 148, 118, 20);
		frame.getContentPane().add(MnameFIeld);
		MnameFIeld.setColumns(10);
		
		FnameFIeld = new JTextField();
		FnameFIeld.setBounds(80, 173, 118, 20);
		frame.getContentPane().add(FnameFIeld);
		FnameFIeld.setColumns(10);
		
		CpnoField = new JTextField();
		CpnoField.setBounds(95, 198, 110, 20);
		frame.getContentPane().add(CpnoField);
		CpnoField.setColumns(10);
		
		AddressField = new JTextField();
		AddressField.setBounds(80, 223, 118, 20);
		frame.getContentPane().add(AddressField);
		AddressField.setColumns(10);
		
		DatePicker datePicker = new DatePicker();
		datePicker.setBounds(66, 126, 139, 20);
		frame.getContentPane().add(datePicker);
	}
}
