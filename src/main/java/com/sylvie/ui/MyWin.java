package com.sylvie.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWin {
    public static void main(String[] args) {
        //swing, SWT, JavaX
        //eXtension
        JFrame frame = new JFrame();
        frame.setSize(600,400);
        frame.setLocation(200,300);
        frame.setDefaultCloseOperation(frame.DISPOSE_ON_CLOSE);
        //add Component
        JButton button = new JButton("OK");
        //匿名類別,Anonymous Class
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println("Hello World!!");
            }
        });
//        MyActionListener listener = new MyActionListener();
//        button.addActionListener(listener);
        //Layout
        //frame.setLayout(new BoarderLayout())
        frame.setLayout(new FlowLayout());
        frame.add(button);
        frame.setVisible(true);

        System.out.println("End?");
    }
}
