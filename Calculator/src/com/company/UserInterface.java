package com.company;

import java.awt.*;
import javax.swing.JTextArea;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class UserInterface implements Runnable {
    private JFrame frame;

    public UserInterface(){

    }

    public void run(){

        JFrame frame = new JFrame("Calculator");
        frame.setBounds(30, 30, 300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container){
        JPanel numberTextField = new JPanel();
        GridLayout calculatorLayout = new GridLayout(5,3,30,20);
        JPanel numberRow1 = new JPanel();
        JPanel numberRow2 = new JPanel();
        JPanel numberRow3 = new JPanel();
        JPanel numberRow4 = new JPanel();
        numberTextField.setLayout(new BorderLayout());
        numberTextField.add(new JTextField(), BorderLayout.SOUTH);
        createButtonRow(numberRow1, 7, 9);
        createButtonRow(numberRow2, 4,6);
        createButtonRow(numberRow3, 1, 3);

        container.add(numberTextField, BorderLayout.PAGE_START);
        container.setLayout(calculatorLayout);

        JButton zero = new JButton("0");
        zero.setPreferredSize(new Dimension(87,26));
        numberRow4.add(zero);
        numberRow4.add(new JButton("."));

        numberRow1.add(new JButton("/"));
        numberRow2.add(new JButton("*"));
        numberRow3.add(new JButton("-"));
        numberRow4.add(new JButton("+"));

        container.add(numberRow1);
        container.add(numberRow2);
        container.add(numberRow3);
        container.add(numberRow4);

    }

    public JFrame getFrame(){
        return frame;
    }

    public void createButtonRow(JPanel row, int first, int last){
        for(int i = first; i <= last; i++){
            row.add(new JButton(i + ""));
        }
    }



}
