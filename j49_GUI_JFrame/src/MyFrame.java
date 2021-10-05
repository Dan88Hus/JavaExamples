import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    MyFrame(){
       ImageIcon image = new ImageIcon("linux.png"); // creates an image icon for window



        this.setSize(600, 600);
        this.setTitle("TITLE goes here");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// exit on close
        this.setResizable(false);// prevent being resized
        this.setIconImage(image.getImage()); // change icon of frame
//        this.getContentPane().setBackground(new Color(123,50,250));
        this.getContentPane().setBackground(Color.WHITE);



        this.setVisible(true);




    }



}
