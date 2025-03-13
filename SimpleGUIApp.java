import java.awt.*;
import javax.swing.*;

public class SimpleGUIApp {
    public static void main(String[] args) {
        new LoginScreen();
    }
}

// Login Screen
class LoginScreen extends JFrame {
    JTextField userText;

    LoginScreen() {
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

// Main Menu
class MainMenu extends JFrame {
    MainMenu() {
        setTitle("Main Menu");
        setSize(300, 250);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel welcomeLabel = new JLabel("Welcome to the App!");
        JButton viewProductsButton = new JButton("View Products");
        JButton settingsButton = new JButton("Settings");
        JButton helpButton = new JButton("Help");
        JButton exitButton = new JButton("Exit");

        viewProductsButton.addActionListener(e -> System.out.println("View Products clicked!"));
        settingsButton.addActionListener(e -> System.out.println("Settings clicked!"));
        helpButton.addActionListener(e -> System.out.println("Help clicked!"));
        exitButton.addActionListener(e -> {
            System.out.println("Exit clicked! Closing app.");
            System.exit(0);
        });

        add(welcomeLabel);
        add(viewProductsButton);
        add(settingsButton);
        add(helpButton);
        add(exitButton);
        setVisible(true);
    }
}
