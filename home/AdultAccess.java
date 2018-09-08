package pl.sda.home;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class AdultAccess extends JFrame implements ActionListener {

    public static final String PASSWORD = "dorosly";

    private String pass;
    private boolean isPassOK = false;
    private int MAX_PASS = 5;
    private int passCount = 0;
    private int lessCount = MAX_PASS;

    JLabel roomAccessLable;

    public void accessAdult() {

        roomAccessLable = new JLabel();
        roomAccessLable.setBounds(25, 50, 150, 25);
        add(roomAccessLable);




        do {

            System.out.println("Proszę podaj hasło: ");
            Scanner scanner = new Scanner(System.in);
            pass = scanner.next();
            if (pass.equals(PASSWORD)) {
                System.out.println("Hasło prawidłowe");
                isPassOK = true;

            } else {
                System.out.println("Błędne hasło. Pozostało prób: " + (lessCount-1));
            }
            passCount++;
            lessCount--;
            if (lessCount == 0){
                System.out.println("Wysyłam powiadomienie do rodziców!");
            }
        }
        while (!isPassOK && passCount < MAX_PASS);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        Object choice = ae.getSource();


    }
}
