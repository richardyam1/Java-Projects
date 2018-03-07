package com.company;
import java.awt.event.*;
import javax.swing.*;

public class ClickListener implements ActionListener{

    private Calculate cal;
    private JTextField display;
    private JButton num0;
    private JButton num1;
    private JButton num2;
    private JButton num3;
    private JButton num4;
    private JButton num5;
    private JButton num6;
    private JButton num7;
    private JButton num8;
    private JButton num9;
    private JButton back;
    private JButton clear;
    private JButton plus;
    private JButton multi;
    private JButton divide;
    private JButton minus;
    private JButton decimal;
    private JButton equal;

    public ClickListener(Calculate cal, JTextField display, JButton num0, JButton num1, JButton num2, JButton num3, JButton num4, JButton num5, JButton num6,
                         JButton num7, JButton num8, JButton num9, JButton back, JButton clear,
                         JButton plus, JButton multi, JButton divide, JButton minus, JButton decimal, JButton equal){
        this.cal = cal;
        this.display = display;
        this.num0 = num0;
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
        this.num4 = num4;
        this.num5 = num5;
        this.num6 = num6;
        this.num7 = num7;
        this.num8 = num8;
        this.num9 = num9;
        this.back = back;
        this.clear = clear;
        this.plus = plus;
        this.multi = multi;
        this.divide = divide;
        this.minus = minus;
        this.decimal = decimal;
        this.equal = equal;

    }

    public void actionPerformed(ActionEvent e){

    }
}
