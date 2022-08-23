package mainPackage.window;

import mainPackage.Files.GameFiles;

import javax.swing.*;

public class MainWindow extends JFrame {
    public MainWindow(){
        setTitle("Змейка");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(320,345);
        setLocation(400,400);
        add(new GameFiles());
        setVisible(true);
    }

    public static void main(String[] args) {
        MainWindow m = new MainWindow();

    }

}
