package com.sufeng.practise;

import javax.swing.*;
import java.awt.*;

//参考：https://www.jianshu.com/p/75bcee861ef1?utm_campaign
public class FormTest {
    private JPanel panel1;
    private JButton button1;
    private JLabel label;

    public FormTest() {
        button1.addActionListener((event) -> label.setText("Hello World"));
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("FormTest");
        frame.setContentPane(new FormTest().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(600,500);
        frame.setPreferredSize(new Dimension(600,500));
        frame.setVisible(true);
    }
}
