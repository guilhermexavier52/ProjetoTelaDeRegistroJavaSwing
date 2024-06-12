package registro;

import javax.swing.*;

import java.awt.*;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

public class RegistrationScreen extends JFrame {

	private JTextField usernameField;

	private JPasswordField passwordField;

	private JButton registerButton;

	public RegistrationScreen() {
		getContentPane().setBackground(new Color(160, 201, 250));

		setTitle("Register");

		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		setSize(300, 200);

		setLocationRelativeTo(null);

		JLabel usernameLabel = new JLabel("Username:");
		usernameLabel.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 11));
		usernameLabel.setBounds(108, 11, 88, 25);

		JLabel passwordLabel = new JLabel("Password:");
		passwordLabel.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 11));
		passwordLabel.setBounds(108, 61, 78, 24);

		usernameField = new JTextField();
		usernameField.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		usernameField.setBounds(38, 35, 206, 25);

		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		passwordField.setBounds(38, 85, 206, 25);

		registerButton = new JButton("Register");
		registerButton.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 11));
		registerButton.setBackground(new Color(13, 115, 240));
		registerButton.setBounds(90, 121, 88, 32);
		getContentPane().setLayout(null);

		getContentPane().add(usernameLabel);

		getContentPane().add(usernameField);

		getContentPane().add(passwordLabel);

		getContentPane().add(passwordField);

		getContentPane().add(registerButton);

		registerButton.addActionListener(new ActionListener() {

			@Override

			public void actionPerformed(ActionEvent e) {

				String username = usernameField.getText();

				char[] password = passwordField.getPassword();

				createUserAccount(username, password);

				dispose();

			}

		});

		setVisible(true);

	}

	private void createUserAccount(String username, char[] password) {

	}

	public static void main(String[] args) {

		SwingUtilities.invokeLater(() -> {

			new RegistrationScreen();

		});

	}

}