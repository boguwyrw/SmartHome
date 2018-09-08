package pl.sda.home;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TempChange extends JFrame implements ActionListener {

    JButton increaseTemp, decreaseTemp, exitTempChange;

    public TempChange(){

        setSize(500, 170);
        setTitle("Zmiana temperatury");
        setLayout(null);

        increaseTemp = new JButton("Zwiekszenie temperatury");
        increaseTemp.setBounds(25, 25, 200, 25);
        add(increaseTemp);
        increaseTemp.addActionListener(this);

        decreaseTemp = new JButton("Zmniejszenie temperatury");
        decreaseTemp.setBounds(250, 25, 200, 25);
        add(decreaseTemp);
        decreaseTemp.addActionListener(this);

        exitTempChange = new JButton("Powrot");
        exitTempChange.setBounds(170,75,150,25);
        add(exitTempChange);
        exitTempChange.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        Object choice = ae.getSource();

        if(choice == increaseTemp) {
            System.out.println("Zwiekszono temperature");
        }
        else if (choice == decreaseTemp){
            System.out.println("Zmniejszono temperature");
        }
        else if (choice == exitTempChange){
            dispose();
            KitchenWindow kitchenWindow = new KitchenWindow();
            kitchenWindow.setVisible(true);
        }
    }
}
