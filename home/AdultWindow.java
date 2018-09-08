package pl.sda.home;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class AdultWindow extends JFrame implements ActionListener {

    JButton changeTemp, changeLight, exitAdultButton, infoAdultRoom;
    JLabel roomAdultTemp, roomAdultLx;

    public AdultWindow(){
        setSize(400, 220);
        setTitle("Pokoj rodzicow");
        setLayout(null);

        infoAdultRoom = new JButton("Informacje");
        infoAdultRoom.setBounds(120,10,150,25);
        add(infoAdultRoom);
        infoAdultRoom.addActionListener(this);

        changeTemp = new JButton("Zmien temperature");
        changeTemp.setBounds(25, 80, 150, 25);
        add(changeTemp);
        changeTemp.addActionListener(this);

        changeLight = new JButton("Zmien swiatlo");
        changeLight.setBounds(200, 80, 150, 25);
        add(changeLight);
        changeLight.addActionListener(this);

        exitAdultButton = new JButton("Powrot");
        exitAdultButton.setBounds(120,130,150,25);
        add(exitAdultButton);
        exitAdultButton.addActionListener(this);

        // ----------------------------- Label -----------------------------

        roomAdultTemp = new JLabel();
        roomAdultTemp.setBounds(100, 35, 300, 25);
        add(roomAdultTemp);

        roomAdultLx = new JLabel();
        roomAdultLx.setBounds(100, 55, 300, 25);
        add(roomAdultLx);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        Random rd = new Random();
        int temp = rd.nextInt(17)+17;
        int lx = rd.nextInt(201)+200;

        Object choice = ae.getSource();
        if(choice == infoAdultRoom){
            roomAdultTemp.setText("Temperatura: " + temp + " st. Celcjusza");
            roomAdultLx.setText("Natezenie swiatla: " + lx + " luksow");
        }
        else if(choice == changeTemp) {
            dispose();
            TempChange tempChange = new TempChange();
            tempChange.setVisible(true);
        }
        else if (choice == changeLight){
            dispose();
            LightChange lightChange = new LightChange();
            lightChange.setVisible(true);
        }
        else if (choice == exitAdultButton){
            dispose();
            FirstWindow firstWindow = new FirstWindow();
            firstWindow.setVisible(true);
        }

    }
}
