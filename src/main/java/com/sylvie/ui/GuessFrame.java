package com.sylvie.ui;

import javax.imageio.stream.ImageInputStream;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuessFrame extends JFrame {
    //Fields
    JButton button = new JButton("Hi");
    JLabel label = new JLabel("Zzzz...");
    //Constructors*
    public GuessFrame() {
        super();
        setSize(600, 400);
        setLocation(200, 300);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
    //            System.out.println("Hello!");
                label.setText("Hello!");
            }
        });
        setLayout(new FlowLayout());
        add(button);
        add(label);
        setVisible(true);


    }

    //Method
    public static void main(String[] args) {
        GuessFrame guessFrame = new GuessFrame();
//        guessFrame.setSize(600,400);
//        guessFrame.setLocation(300,200);
//        guessFrame.setVisible(true);


        }








}
