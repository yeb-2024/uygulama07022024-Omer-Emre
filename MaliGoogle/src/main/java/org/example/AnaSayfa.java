package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnaSayfa  implements ActionListener {

    JFrame frame = new JFrame();
    JButton buton = new JButton("Profil Göster");


    public AnaSayfa()
    {
        buton.addActionListener(this);
        buton.setBounds(200,200,100,50);

        frame.add(buton);
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("AnaSayfa");
        frame.setLayout(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == buton) {
            frame.dispose();
            ProfilSayfası profilSayfası = new ProfilSayfası();
        }
    }
}
