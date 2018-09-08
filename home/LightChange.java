package pl.sda.home;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LightChange extends JFrame implements ActionListener {

    JButton increaseLight, decreaseLight, exitLightChange;

    public LightChange(){

        setSize(500, 170);
        setTitle("Zmiana oswietlenia");
        setLayout(null);

        increaseLight = new JButton("Rozjasnij swiatlo");
        increaseLight.setBounds(25, 25, 200, 25);
        add(increaseLight);
        increaseLight.addActionListener(this);

        decreaseLight = new JButton("Przyciemnij swiatlo");
        decreaseLight.setBounds(250, 25, 200, 25);
        add(decreaseLight);
        decreaseLight.addActionListener(this);

        exitLightChange = new JButton("Powrot");
        exitLightChange.setBounds(170,75,150,25);
        add(exitLightChange);
        exitLightChange.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        Object choice = ae.getSource();

        if(choice == increaseLight) {
            System.out.println("Zwiekszono natezenie swiatla");
        }
        else if (choice == decreaseLight){
            System.out.println("Zmniejszono natezenie swiatla");
        }
        else if (choice == exitLightChange){
            dispose();
            /*
            KitchenWindow kitchenWindow = new KitchenWindow();
            kitchenWindow.setVisible(true);
            */
        }
    }
}
