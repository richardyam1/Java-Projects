package com.company;

import java.awt.*;
import javax.swing.JTextArea;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class Calculator implements Runnable {
    private JFrame frame;
    private Calculate cal;

    public Calculator(Calculate cal){
        this.cal = cal;
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
        JTextField display = new JTextField();

        GridLayout calculatorLayout = new GridLayout(5,4,30,20);

        JPanel numberRow1 = new JPanel();
        JPanel numberRow2 = new JPanel();
        JPanel numberRow3 = new JPanel();
        JPanel numberRow4 = new JPanel();
        JButton num0 = new JButton("0");
        num0.setPreferredSize(new Dimension(87,26));
        JButton num1 = new JButton("1");
        JButton num2 = new JButton("2");
        JButton num3 = new JButton("3");
        JButton num4 = new JButton("4");
        JButton num5 = new JButton("5");
        JButton num6 = new JButton("6");
        JButton num7 = new JButton("7");
        JButton num8 = new JButton("8");
        JButton num9 = new JButton("9");
        JButton back = new JButton("\u2190");
        JButton clear = new JButton("C");
        JButton plus = new JButton("+");
        JButton multi = new JButton("*");
        JButton divide = new JButton("/");
        JButton minus = new JButton("-");
        JButton decimal = new JButton(".");
        JButton equal = new JButton("=");
        //equal.setPreferredSize(new Dimension(60,60));

        numberTextField.setLayout(new BorderLayout());
        display.setEditable(false);
        display.setText("0");
        numberTextField.add(display, BorderLayout.SOUTH);

        container.add(numberTextField, BorderLayout.PAGE_START);

        container.setLayout(calculatorLayout);

        numberRow1.add(num7);
        numberRow1.add(num8);
        numberRow1.add(num9);

        numberRow2.add(num4);
        numberRow2.add(num5);
        numberRow2.add(num6);

        numberRow3.add(num1);
        numberRow3.add(num2);
        numberRow3.add(num3);

        numberRow4.add(num0);
        numberRow4.add(decimal);
        numberRow4.add(equal);

        numberRow1.add(back);
        numberRow1.add(clear);
        numberRow2.add(plus);
        numberRow2.add(multi);
        numberRow3.add(divide);
        numberRow3.add(minus);


        container.add(numberRow1);
        container.add(numberRow2);
        container.add(numberRow3);
        container.add(numberRow4);

        ClickListener listener = new ClickListener(this.cal, display, num0, num1, num2, num3, num4, num5, num6, num7, num8, num9,
                back, clear, plus, multi, divide, minus, decimal, equal);

        num0.addActionListener(listener);
        num1.addActionListener(listener);
        num2.addActionListener(listener);
        num3.addActionListener(listener);
        num4.addActionListener(listener);
        num5.addActionListener(listener);
        num6.addActionListener(listener);
        num7.addActionListener(listener);
        num8.addActionListener(listener);
        num9.addActionListener(listener);
        back.addActionListener(listener);
        clear.addActionListener(listener);
        plus.addActionListener(listener);
        multi.addActionListener(listener);
        divide.addActionListener(listener);
        minus.addActionListener(listener);
        decimal.addActionListener(listener);
        equal.addActionListener(listener);

    }

    public JFrame getFrame(){
        return frame;
    }




}
