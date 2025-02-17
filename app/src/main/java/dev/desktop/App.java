package dev.desktop;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.Random;
public class App {
    private static File path;
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
        JLabel title = new JLabel("Tabler Home", SwingConstants.LEFT);
        title.setFont(new Font("Calibri", Font.BOLD, 48));
        title.setBounds(40, 20, 1000, 100);
        JButton newFile = new JButton("New File");
        newFile.setFont(new Font("Calibri", Font.BOLD, 30));
        newFile.setBounds(40, 170, 300, 100);
        home.add(title);
        home.add(newFile);
        home.setVisible(true);
        newFile.addActionListener(e -> {
            try {
                createNewFile();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
    }
    /*
    * create a new file and begin editing it
     */
    private static void createNewFile() throws IOException {
        JFileChooser n = new JFileChooser();
        n.setAcceptAllFileFilterUsed(false);
        FileNameExtensionFilter extFilter = new FileNameExtensionFilter("Tabler tbxl file", "tbxl", "tbl");
        n.addChoosableFileFilter(extFilter);
        n.showSaveDialog(null);
        File path1 = n.getSelectedFile();
        path = new File(path1.getPath() + ".tbxl");
        if (path.createNewFile()) {
            edit(true);
        } else {
            System.err.println("Error Creating file!");
            // todo better error handling
        }
    }
    /*
    * the editor window
    * */
    private static void edit(boolean isNewFile) {
        if (!isNewFile) {
            // todo read logic
        }
    }
}
