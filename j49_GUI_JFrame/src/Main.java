import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
//        JFrame a gui window to add components to
//        ImageIcon image = new ImageIcon("linux.png"); // creates an image icon for window

        JFrame frame = new JFrame(); // creates a frame but its not visible yet
        JLabel label = new JLabel();
        label.setText("DO YOU EVEN CODE");// adds label to the frame but not visible yet
//        label.setIcon(image);// place image icon on frame
        label.setHorizontalTextPosition(JLabel.CENTER);

        frame.setSize(420, 420);
        frame.setTitle("TITLE goes here");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// exit on close
        frame.setResizable(false);// prevent being resized
//        frame.setIconImage(image.geImage()); // change icon of frame
        frame.getContentPane().setBackground(new Color(123,50,250));
//
//
//


        frame.setVisible(true);
        frame.add(label); //think it like DOM
//        JLabel = GUI display area for a string of text, an image, or both



//        MyFrame myframe = new MyFrame();




    }
}
