/*
 * Created by JFormDesigner on Sat Mar 09 16:57:46 GMT+09:00 2024
 */

package com.example.demo2.screen.help;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

/**
 * @author ee323
 */
public class HelpScreen extends JFrame {
    public HelpScreen() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - Hyeonil
        panel1 = new JPanel();
        button1 = new JButton();
        button2 = new JButton();
        button3 = new JButton();
        panel2 = new JPanel();
        scrollPane1 = new JScrollPane();
        textArea1 = new JTextArea();

        //======== this ========
        setTitle("HELP");
        var contentPane = getContentPane();
        contentPane.setLayout(new GridBagLayout());
        ((GridBagLayout)contentPane.getLayout()).columnWidths = new int[] {0, 0};
        ((GridBagLayout)contentPane.getLayout()).rowHeights = new int[] {0, 0};
        ((GridBagLayout)contentPane.getLayout()).columnWeights = new double[] {1.0, 1.0E-4};
        ((GridBagLayout)contentPane.getLayout()).rowWeights = new double[] {1.0, 1.0E-4};

        //======== panel1 ========
        {
            panel1.setBorder(new EmptyBorder(25, 15, 15, 15));

            panel1.setLayout(new GridBagLayout());
            ((GridBagLayout)panel1.getLayout()).columnWidths = new int[] {0, 0};
            ((GridBagLayout)panel1.getLayout()).rowHeights = new int[] {0, 0, 0, 0, 0};
            ((GridBagLayout)panel1.getLayout()).columnWeights = new double[] {1.0, 1.0E-4};
            ((GridBagLayout)panel1.getLayout()).rowWeights = new double[] {0.0, 0.0, 0.0, 1.0, 1.0E-4};

            //---- button1 ----
            button1.setText("\ud68c\uc6d0 \ub4f1\ub85d");
            panel1.add(button1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 5, 0), 0, 0));

            //---- button2 ----
            button2.setText("\uc554\ud638 \ucc3e\uae30");
            panel1.add(button2, new GridBagConstraints(0, 1, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 5, 0), 0, 0));

            //---- button3 ----
            button3.setText("\uc57d\uad00 \ubcf4\uae30");
            panel1.add(button3, new GridBagConstraints(0, 2, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 5, 0), 0, 0));

            //======== panel2 ========
            {
                panel2.setBorder(new EmptyBorder(15, 0, 0, 0));
                panel2.setLayout(new GridBagLayout());
                ((GridBagLayout)panel2.getLayout()).columnWidths = new int[] {0, 0};
                ((GridBagLayout)panel2.getLayout()).rowHeights = new int[] {0, 0};
                ((GridBagLayout)panel2.getLayout()).columnWeights = new double[] {1.0, 1.0E-4};
                ((GridBagLayout)panel2.getLayout()).rowWeights = new double[] {1.0, 1.0E-4};

                //======== scrollPane1 ========
                {

                    //---- textArea1 ----
                    textArea1.setText("회원 관리 프로그램\n" +
                            "\n" +
                            "Git, \n" +
                            "\n" +
                            "문의 이메일: tt2t2am1118@naver.com");
                    scrollPane1.setViewportView(textArea1);
                }
                panel2.add(scrollPane1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 0, 0), 0, 0));
            }
            panel1.add(panel2, new GridBagConstraints(0, 3, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 0, 0), 0, 0));
        }
        contentPane.add(panel1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 0, 0), 0, 0));
        setSize(300, 300);
        setLocationRelativeTo(null);
        setVisible(true);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on

        button1.addActionListener(e -> {
            new ChkLicenseScreen();
            dispose();
        });
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - Hyeonil
    private JPanel panel1;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JPanel panel2;
    private JScrollPane scrollPane1;
    private JTextArea textArea1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on


}
