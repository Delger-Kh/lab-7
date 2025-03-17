import java.awt.*;
import javax.swing.*;

public class LoginScreen extends JFrame {
    JTextField userText;

    public LoginScreen() {
        setTitle("Login Screen");
        setSize(300, 150);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel userLabel = new JLabel("Username:");
        userText = new JTextField(15);
        JButton loginButton = new JButton("Login");

        loginButton.addActionListener(e -> {
            System.out.println("Login clicked! Username: " + userText.getText());
            new MainMenu();
            dispose(); // Close login screen
        });

        add(userLabel);
        add(userText);
        add(loginButton);
        setVisible(true);
    }
}
