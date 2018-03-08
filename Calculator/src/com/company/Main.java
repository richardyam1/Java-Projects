package com.company;
import javax.swing.SwingUtilities;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Calculator ui = new Calculator();
        SwingUtilities.invokeLater(ui);
    }
}
