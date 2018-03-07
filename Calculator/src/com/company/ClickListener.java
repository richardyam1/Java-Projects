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
    private String s;
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
        this.s = "";
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource() == clear){
            cal.resetValue();
            display.setText("0");
            s = "";
        }
        else if(e.getSource() == num0 && s.length() >= 1){
            s += "0";
            display.setText(s);
        }
        else if(e.getSource() == num1){
            s += "1";
            display.setText(s);
        }
        else if(e.getSource() == num2){
            s += "2";
            display.setText(s);
        }
        else if(e.getSource() == num3){
            s += "3";
            display.setText(s);
        }
        else if(e.getSource() == num4){
            s += "4";
            display.setText(s);
        }
        else if(e.getSource() == num5){
            s += "5";
            display.setText(s);
        }
        else if(e.getSource() == num6){
            s += "6";
            display.setText(s);
        }
        else if(e.getSource() == num7){
            s += "7";
            display.setText(s);
        }
        else if(e.getSource() == num8){
            s += "8";
            display.setText(s);
        }
        else if(e.getSource() == num9){
            s += "9";
            display.setText(s);
        }
        else if(e.getSource() == plus){
            s += "+";
            display.setText(s);
        }
        else if(e.getSource() == equal){

        }
    }
}
