package com.company;
import java.awt.event.*;
import javax.swing.*;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class ClickListener implements ActionListener{


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
    private boolean signAtEnd = false;
    public ClickListener( JTextField display, JButton num0, JButton num1, JButton num2, JButton num3, JButton num4, JButton num5, JButton num6,
                         JButton num7, JButton num8, JButton num9, JButton back, JButton clear,
                         JButton plus, JButton multi, JButton divide, JButton minus, JButton decimal, JButton equal){

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
            display.setText("0");
            s = "";
        }
        else if(e.getSource() == num0 && s.length() >= 1){
            writeNum("0");
        }
        else if(e.getSource() == num1){
            writeNum("1");
        }
        else if(e.getSource() == num2){
            writeNum("2");
        }
        else if(e.getSource() == num3){
            writeNum("3");
        }
        else if(e.getSource() == num4){
            writeNum("4");
        }
        else if(e.getSource() == num5){
            writeNum("5");
        }
        else if(e.getSource() == num6){
            writeNum("6");
        }
        else if(e.getSource() == num7){
            writeNum("7");
        }
        else if(e.getSource() == num8){
            writeNum("8");
        }
        else if(e.getSource() == num9){
            writeNum("9");
        }
        else if(e.getSource() == plus){
            writeSign("+");
        }
        else if(e.getSource() == minus){
            writeSign("-");
        }
        else if(e.getSource() == multi){
            writeSign("*");
        }
        else if(e.getSource() == divide){
            writeSign("/");
        }
        else if(e.getSource() == decimal && s.length() != 0){

            writeNum(".");
        }
        else if(e.getSource() == equal){
            ScriptEngine engine = new ScriptEngineManager().getEngineByExtension("js");
            try{
                Object result = engine.eval(s);
                s = result + "";
                display.setText(s);
            }
            catch(ScriptException error){
                error.printStackTrace();
            }

        }
    }

    public void writeNum(String num){
        s += num;
        display.setText(s);
        signAtEnd = false;
    }

    public void writeSign(String sign){
        if(signAtEnd == false){
            s += sign;
            display.setText(s);
            signAtEnd = true;
        }
    }
}
