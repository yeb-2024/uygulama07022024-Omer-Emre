package org.example;

import javax.swing.*;
import java.awt.*;

public class ProfilSayfası {
    JFrame frame = new JFrame();
    JLabel label = new JLabel();

    public ProfilSayfası()
    {
        label.setText("Isım : Fatih Sultan Mehmet");
        label.setFont(new Font(null,Font.PLAIN,25));

        frame.add(label);
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Profil Sayfa");
        frame.setLayout(new GridLayout(3,1));
        frame.setVisible(true);
    }
}
