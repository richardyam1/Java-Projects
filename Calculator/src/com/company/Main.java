package com.company;
import javax.swing.SwingUtilities;
public class Main {

    public static void main(String[] args) {
	// write your code here
        UserInterface ui = new UserInterface();
        SwingUtilities.invokeLater(ui);
    }
}
