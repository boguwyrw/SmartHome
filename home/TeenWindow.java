package pl.sda.home;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class TeenWindow extends JFrame implements ActionListener {

    JButton changeTemp, changeLight, exitTeenButton, infoTeen;
    JLabel TeenLableTemp, TeenLableLx;

    public TeenWindow(){
        setSize(400, 220);
        setTitle("Pokoj nastolatka");
        setLayout(null);

        infoTeen = new JButton("Info Ziom");
        infoTeen.setBounds(120,10,150,25);
        add(infoTeen);
        infoTeen.addActionListener(this);

        changeTemp = new JButton("Zmien temperature");
        changeTemp.setBounds(25, 80, 150, 25);
        add(changeTemp);
        changeTemp.addActionListener(this);

        changeLight = new JButton("Zmien swiatlo");
        changeLight.setBounds(200, 80, 150, 25);
        add(changeLight);
        changeLight.addActionListener(this);

        exitTeenButton = new JButton("Narka");
        exitTeenButton.setBounds(120,130,150,25);
        add(exitTeenButton);
        exitTeenButton.addActionListener(this);

        // ----------------------------- Label -----------------------------

        TeenLableTemp = new JLabel();
        TeenLableTemp.setBounds(100, 35, 300, 25);
        add(TeenLableTemp);

        TeenLableLx = new JLabel();
        TeenLableLx.setBounds(100, 55, 300, 25);
        add(TeenLableLx);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        Random rd = new Random();
        int temp = rd.nextInt(17)+17;
        int lx = rd.nextInt(5)+1;

        Object choice = ae.getSource();
        if (choice == infoTeen){
            TeenLableTemp.setText("Temperaturka: " + temp + " st. Cela Ziom");
            TeenLableLx.setText("Swiatelko swieci na " + lx + " Ziom");
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
            TeenWindow teenWindow = new TeenWindow();
            teenWindow.setVisible(true);
        }
        else if (choice == exitTeenButton){
            dispose();
            FirstWindow firstWindow = new FirstWindow();
            firstWindow.setVisible(true);
        }

    }

}
