package pl.sda.home;


import javax.swing.*;

public class Main {

    public static void main(String[] args) {
/*
        AccessWindow ac = new AccessWindow();
        ac.setVisible(true);
*/

        FirstWindow firstWindow = new FirstWindow();
        firstWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        firstWindow.setVisible(true);


    }
}
