package Zadania1_2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame extends JFrame {

    static JButton btn;

    Frame(){

        this.add(new Panel());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);

        btn = new JButton("PLAY AGAIN");
        int btnWidth = 150;
        int btnHeight = 50;
        btn.setBounds((Panel.width - btnWidth)/2, Panel.height/2 + btnHeight + 100, btnWidth, btnHeight);

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new Frame();
            }
        });
    }
}
