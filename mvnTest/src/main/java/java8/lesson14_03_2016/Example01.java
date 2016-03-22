package java8.lesson14_03_2016;

import oracle.jrockit.jfr.JFR;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Acer s3 on 15.03.2016.
 */
public class Example01 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My app");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();

        panel.setPreferredSize(new Dimension(400, 400));

        JButton button = new JButton("Click me");

//        button.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//                doSomething();
//            }
//        });
        button.addActionListener(e -> doSomething());
        panel.add(button);
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }

    private static void doSomething() {
        System.out.println("CLICKED ");

    }
}
