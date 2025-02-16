package dev.desktop;
import javax.swing.*;
import java.awt.*;

public class App {
    public static void main(String[] args) throws InterruptedException{
        loadingScreen();
    }
    /*
    * function for displaying a loading screen
    *
    */
    private static void loadingScreen() throws InterruptedException{
        JFrame loadingScreen = new JFrame("Tabler v0.0");
        loadingScreen.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        loadingScreen.setSize(400, 500);
        loadingScreen.setLocation(1100, 500);
        loadingScreen.setLayout(null);
        JLabel logo = new JLabel("Tabler", SwingConstants.CENTER);
        logo.setFont(new Font("Calibri", Font.BOLD, 48));
        logo.setBounds(45, 10, 300, 80);
        loadingScreen.add(logo);
        loadingScreen.setVisible(true);
    }

}
