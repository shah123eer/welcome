import javax.swing.*;

public class WelcomeFrame extends JFrame {
    public WelcomeFrame() {
        setTitle("Welcome");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);


        JPanel panel = new JPanel();
        panel.setLayout(null);


        JLabel welcomeLabel = new JLabel("Welcome!");
        welcomeLabel.setBounds(150, 20, 100, 30);
        panel.add(welcomeLabel);


        JLabel userLabel = new JLabel("Username:");
        userLabel.setBounds(50, 60, 80, 25);
        panel.add(userLabel);
        JTextField userTextField = new JTextField(20);
        userTextField.setBounds(150, 60, 200, 25);
        panel.add(userTextField);


        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(50, 90, 80, 25);
        panel.add(passwordLabel);
        JPasswordField passwordField = new JPasswordField(20);
        passwordField.setBounds(150, 90, 200, 25);
        panel.add(passwordField);


        JButton signInButton = new JButton("Sign In");
        signInButton.setBounds(150, 130, 100, 30);
        signInButton.addActionListener(e -> {
            String username = userTextField.getText();
            String password = new String(passwordField.getPassword());
            // You can add your sign-in logic here
            JOptionPane.showMessageDialog(null, "Username: " + username + "\nPassword: " + password);
        });
        panel.add(signInButton);


        add(panel);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(WelcomeFrame::new);
    }
}