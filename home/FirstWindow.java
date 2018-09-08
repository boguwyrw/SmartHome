package pl.sda.home;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class FirstWindow extends JFrame implements ActionListener {

    JButton roomAdultButton, roomTeenButton, bathButton, kitchenButton, exitButton;
    JLabel roomAdultLable, roomTeenLable;

    public FirstWindow() {
        setSize(400, 220);
        setTitle("eDom");
        setLayout(null);
        roomAdultButton = new JButton("Pokoj rodzica");
        roomAdultButton.setBounds(25, 25, 150, 25);
        add(roomAdultButton);
        roomAdultButton.addActionListener(this);

        roomTeenButton = new JButton("Pokoj nastolatka");
        roomTeenButton.setBounds(200, 25, 150, 25);
        add(roomTeenButton);
        roomTeenButton.addActionListener(this);

        bathButton = new JButton("Lazienka");
        bathButton.setBounds(25, 75, 150, 25);
        add(bathButton);
        bathButton.addActionListener(this);

        kitchenButton = new JButton("Kuchnia");
        kitchenButton.setBounds(200,75,150,25);
        add(kitchenButton);
        kitchenButton.addActionListener(this);

        exitButton = new JButton("Wyjscie");
        exitButton.setBounds(120,125,150,25);
        add(exitButton);
        exitButton.addActionListener(this);

        // ----------------------------- Label -----------------------------

        roomAdultLable = new JLabel();
        roomAdultLable.setBounds(25, 50, 150, 25);
        add(roomAdultLable);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        Object choice = ae.getSource();
        if(choice == roomAdultButton) {
            dispose();
            AccessWindow accessWindow = new AccessWindow();
            accessWindow.setVisible(true);
            //accessWindow.accessAdult();
            //roomAdultLable.setText("Witaj w pokoju rodzicow");
            /*
            dispose();
            AdultWindow adultWindow = new AdultWindow();
            adultWindow.setVisible(true);
            */
            //System.out.println("Witaj w pokoju rodzica");
        }
        else if (choice == roomTeenButton){
            //System.out.println("Witaj w pokoju nastolatka");
            dispose();
            TeenWindow teenWindow = new TeenWindow();
            teenWindow.setVisible(true);
        }
        else if (choice == bathButton){
            System.out.println("Witaj w lazience");
        }
        else if (choice == kitchenButton){
            //System.out.println("Witaj w kuchni");
            dispose();
            KitchenWindow kitchenWindow = new KitchenWindow();
            kitchenWindow.setVisible(true);
        }
        else if (choice == exitButton){
            dispose();
        }
    }
}
