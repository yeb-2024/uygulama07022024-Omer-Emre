package org.example;

import javax.swing.*;
import java.awt.*;

public class ProfilSayfası {
    JFrame frame = new JFrame();
    JLabel label = new JLabel();
    JLabel imagelabel = new JLabel();
    JLabel aciklamalabel = new JLabel();

    public ProfilSayfası()
    {
        label.setText("Isım : Fatih Sultan Mehmet");
        label.setFont(new Font(null,Font.PLAIN,25));

        ImageIcon imageIcon = new ImageIcon("images.jpeg");
        Image newımg = imageIcon.getImage().getScaledInstance(150,150,Image.SCALE_SMOOTH);
        ImageIcon newımage = new ImageIcon(newımg);

        aciklamalabel.setText("fatih sultan mehmet istanbulu \n" +
                              "fethederek çağ açıp çağ kapatmıştır ");
        aciklamalabel.setFont(new Font(null,Font.BOLD,25));

        frame.add(aciklamalabel);

        imagelabel.setIcon(newımage);
        frame.add(imagelabel);
        frame.add(label);
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Profil Sayfa");
        frame.setLayout(new GridLayout(3,1));
        frame.setVisible(true);
    }
}
