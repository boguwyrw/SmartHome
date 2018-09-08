package pl.sda.home;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class KitchenWindow extends JFrame implements ActionListener {

    JButton changeTemp, changeLight, exitKitchenButton, infoKitchen;
    JLabel KitchenLableTemp, KitchenLableLx;

    public KitchenWindow(){
        setSize(400, 220);
        setTitle("Kuchnia");
        setLayout(null);

        infoKitchen = new JButton("Informacje");
        infoKitchen.setBounds(120,10,150,25);
        add(infoKitchen);
        infoKitchen.addActionListener(this);

        changeTemp = new JButton("Zmien temperature");
        changeTemp.setBounds(25, 80, 150, 25);
        add(changeTemp);
        changeTemp.addActionListener(this);

        changeLight = new JButton("Zmien swiatlo");
        changeLight.setBounds(200, 80, 150, 25);
        add(changeLight);
        changeLight.addActionListener(this);

        exitKitchenButton = new JButton("Powrot");
        exitKitchenButton.setBounds(120,130,150,25);
        add(exitKitchenButton);
        exitKitchenButton.addActionListener(this);

        // ----------------------------- Label -----------------------------

        KitchenLableTemp = new JLabel();
        KitchenLableTemp.setBounds(100, 35, 300, 25);
        add(KitchenLableTemp);

        KitchenLableLx = new JLabel();
        KitchenLableLx.setBounds(100, 55, 300, 25);
        add(KitchenLableLx);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        Random rd = new Random();
        int temp = rd.nextInt(17)+17;
        int lx = rd.nextInt(201)+200;

        Object choice = ae.getSource();
        if (choice == infoKitchen){
            KitchenLableTemp.setText("Temperatura: " + temp + " st. Celcjusza");
            KitchenLableLx.setText("Natezenie swiatla: " + lx + " luksow");
        }
        else if(choice == changeTemp) {
            dispose();
            TempChange tempChange = new TempChange();
            tempChange.setVisible(true);
        }
        else if (choice == changeLight){
            //System.out.println("Zmiana swiatla");
            dispose();
            LightChange lightChange = new LightChange();
            lightChange.setVisible(true);
            KitchenWindow kitchenWindow = new KitchenWindow();
            kitchenWindow.setVisible(true);
        }
        else if (choice == exitKitchenButton){
            dispose();
            FirstWindow firstWindow = new FirstWindow();
            firstWindow.setVisible(true);
        }

    }

}
