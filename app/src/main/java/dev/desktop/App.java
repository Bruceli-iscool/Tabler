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
        loadingScreen.setVisible(true);
        loadingScreen.setSize(400, 500);
        JLabel logo = new JLabel("Tabler");
        logo.setFont(new Font("Calibre", Font.BOLD, 56));
        loadingScreen.add(logo);
        loadingScreen.setLocation(1100, 500);
    }

}
