package Zadanie3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Spider extends JPanel {
    static final int width = 500;
    static final int height = 500;
    boolean running = false;
    boolean buffor = true;
    int eyeX = width/2-20, eyeY = height/2-20;

    public Spider(){
        JButton btn = new JButton("START/STOP");
        int btnWidth = 100;
        int btnHeight = 20;
        btn.setBounds(width/2-btnWidth/2-10,height/2+100,btnWidth,btnHeight);

        Timer timer = new Timer(10, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (buffor)
                    eyeX = eyeX - 10;
                else
                    eyeX = eyeX + 10;

                if (eyeX == width/2+10)
                    buffor = true;

                if (eyeX == width/2-30)
                    buffor = false;

                repaint();
            }
        });

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(running){
                    timer.stop();
                    running = false;
                }
                else{
                    timer.start();
                    running = true;
                }
            }
        });

        this.add(btn);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        draw(g);

        if(running){
            drawEyes(g);
        }
    }

    void draw(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.BLACK);

        int circleSize = 100;
        g2d.fillOval((width - circleSize) / 2, (width - circleSize) / 2, circleSize, circleSize);

        int centerX = width / 2;
        int centerY = height / 2;
        int lineLength = 100;

        g2d.drawLine(centerX, centerY, centerX +lineLength, centerY - 15);
        g2d.drawLine(centerX +lineLength, centerY - 15,centerX +lineLength+10,centerY);
        g2d.drawLine(centerX, centerY, centerX -lineLength, centerY - 15);
        g2d.drawLine(centerX -lineLength, centerY - 15,centerX -lineLength-10,centerY);
        g2d.drawLine(centerX, centerY, centerX +lineLength, centerY + 15);
        g2d.drawLine(centerX -lineLength, centerY + 15,centerX -lineLength-10,centerY+25);
        g2d.drawLine(centerX, centerY, centerX -lineLength, centerY + 15);
        g2d.drawLine(centerX +lineLength, centerY + 15,centerX +lineLength+10,centerY+25);
        g2d.drawLine(centerX, centerY, centerX +lineLength, centerY - 30);
        g2d.drawLine(centerX +lineLength, centerY - 30,centerX +lineLength+15,centerY-15);
        g2d.drawLine(centerX, centerY, centerX -lineLength, centerY - 30);
        g2d.drawLine(centerX -lineLength, centerY - 30,centerX -lineLength-15,centerY-15);
        g2d.drawLine(centerX, centerY, centerX +lineLength, centerY + 30);
        g2d.drawLine(centerX +lineLength, centerY + 30,centerX +lineLength+10,centerY+45);
        g2d.drawLine(centerX, centerY, centerX -lineLength, centerY + 30);
        g2d.drawLine(centerX -lineLength, centerY + 30,centerX -lineLength-10,centerY+45);
        drawEyes(g);
    }

    void drawEyes(Graphics g){
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.WHITE);
        int eyeSize = 10;
        int eyeSpace = 15;
        g2d.fillOval(eyeX, eyeY, eyeSize, eyeSize);
        g2d.fillOval(eyeX+eyeSpace, eyeY, eyeSize, eyeSize);
    }

    public static void main(String[] args) {
        Spider spider = new Spider();
        JFrame app = new JFrame("Pajączek");
        app.add(spider, BorderLayout.CENTER);
        app.setSize(width, height);
        app.setLocationRelativeTo(null);
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setVisible(true);
    }
}