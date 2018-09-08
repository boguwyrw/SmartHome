package pl.sda.home;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Scanner;

public class AccessWindow extends JFrame implements ActionListener {

    JPasswordField jpf;
    String password = "dorosly";
    String tempPass;
    JButton approve, exitButton;
    JLabel infoPass;

    public AccessWindow() {
        setTitle("Panel dostepu");
        setSize(400, 200);
        setLayout(null);

        approve = new JButton("OK");
        approve.setBounds(200, 50, 150, 25);
        add(approve);
        approve.addActionListener(this);

        exitButton = new JButton("Wyjscie");
        exitButton.setBounds(120, 100, 150, 25);
        add(exitButton);
        exitButton.addActionListener(this);

        jpf = new JPasswordField();
        jpf.setBounds(25, 50, 150, 25);
        add(jpf);
        jpf.addActionListener(this);

        // ----------------------------- Label -----------------------------

        infoPass = new JLabel("PODAJ HASLO");
        infoPass.setBounds(150, 15, 300, 25);
        add(infoPass);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        Object choice = ae.getSource();
        if (choice == approve) {
            tempPass = String.valueOf(jpf.getPassword());
            if (tempPass.equals(password)) {
            dispose();
            AdultWindow adultWindow = new AdultWindow();
            adultWindow.setVisible(true);
            }
        } else if (choice == exitButton) {
            dispose();
            FirstWindow firstWindow = new FirstWindow();
            firstWindow.setVisible(true);
        }

    }


}
