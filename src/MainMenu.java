import java.awt.*;
import javax.swing.*;

public class MainMenu extends JFrame {
    public MainMenu() {
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
