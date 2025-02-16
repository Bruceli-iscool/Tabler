package dev.desktop;
import javax.swing.*;
import java.awt.*;
import java.util.Random;
import java.util.random.*;
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
        JLabel progress = new JLabel("-", SwingConstants.CENTER);
        JLabel info = new JLabel("Tabler v0.0", SwingConstants.LEFT);
        JLabel info2 = new JLabel("NO WARRANTY OF ANY KIND IS PROVIDED!", SwingConstants.LEFT);
        logo.setFont(new Font("Calibri", Font.BOLD, 48));
        progress.setFont(new Font("Calibri", Font.BOLD, 36));
        info.setFont(new Font("Calibri", Font.PLAIN, 14));
        info2.setFont(new Font("Calibri", Font.PLAIN, 14));
        logo.setBounds(45, 10, 300, 80);
        progress.setBounds(45, 300, 300, 80);
        info.setBounds(45, 150, 300, 160);
        info2.setBounds(45, 190, 300, 160);
        loadingScreen.add(logo);
        loadingScreen.add(progress);
        loadingScreen.add(info);
        loadingScreen.add(info2);
        loadingScreen.setVisible(true);
        Thread.sleep(500);
        progress.setText(progress.getText() + "-");
        int i = 0;
        while (i < 9) {
            Random n = new Random();
            int c = n.nextInt(4);
            if (c <= 1) {
                Thread.sleep(100);
            } else {
                Thread.sleep(300);
            }
            progress.setText(progress.getText() + "-");
            i++;
        }
        Thread.sleep(500);
        loadingScreen.setVisible(false);
        homeScreen();
    }
    /*
    * Code for the home screen
    */
    private static void homeScreen() {
        JFrame home = new JFrame("Tabler Launcher v0.0");
        home.setSize(1500, 900);
        home.setLocation(600, 200);
        home.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        home.setLayout(null);
        home.setVisible(true);
        // todo
    }
}
