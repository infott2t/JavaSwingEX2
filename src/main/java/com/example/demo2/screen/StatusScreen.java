/*
 * Created by JFormDesigner on Fri Mar 08 01:41:04 KST 2024
 */

package com.example.demo2.screen;

import com.example.demo2.accessingdatajpa.SessionStatic;

import java.awt.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import javax.swing.*;


/**
 * @author ee323
 */
public class StatusScreen extends JFrame {

    String id;
    String role;
    String logTime;

    public StatusScreen() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - Hyeonil
        textArea1 = new JTextArea();
        panel1 = new JPanel();
        button1 = new JButton();
        button2 = new JButton();
        button3 = new JButton();

        //======== this ========
        var contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //---- textArea1 ----
        textArea1.setText("dfsdf\\nssfddfsd");
        contentPane.add(textArea1, BorderLayout.CENTER);

        //======== panel1 ========
        {

            panel1.setLayout(new GridLayout());

            //---- button1 ----
            button1.setText("text");
            panel1.add(button1);

            //---- button2 ----
            button2.setText("text");
            panel1.add(button2);           //---- button3 ----
            button3.setText("text");
            panel1.add(button3);
        }
        contentPane.add(panel1, BorderLayout.SOUTH);
        pack();
        setLocationRelativeTo(getOwner());
        setVisible(true);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - Hyeonil
    private JTextArea textArea1;
    private JPanel panel1;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on



}
