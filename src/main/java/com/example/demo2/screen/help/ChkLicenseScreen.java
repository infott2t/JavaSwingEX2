/*
 * Created by JFormDesigner on Sat Mar 09 17:54:25 KST 2024
 */

package com.example.demo2.screen.help;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

/**
 * @author ee323
 */
public class ChkLicenseScreen extends JFrame {
    public ChkLicenseScreen() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - Hyeonil
        panel1 = new JPanel();
        scrollPane1 = new JScrollPane();
        textArea1 = new JTextArea();
        panel2 = new JPanel();
        panel3 = new JPanel();
        checkBox1 = new JCheckBox();
        panel4 = new JPanel();
        button1 = new JButton();

        //======== this ========
        setTitle("\ud68c\uc6d0\ub4f1\ub85d - \uc57d\uad00\ub3d9\uc758");
        var contentPane = getContentPane();
        contentPane.setLayout(new GridBagLayout());
        ((GridBagLayout)contentPane.getLayout()).columnWidths = new int[] {0, 0};
        ((GridBagLayout)contentPane.getLayout()).rowHeights = new int[] {0, 0, 0};
        ((GridBagLayout)contentPane.getLayout()).columnWeights = new double[] {1.0, 1.0E-4};
        ((GridBagLayout)contentPane.getLayout()).rowWeights = new double[] {1.0, 0.0, 1.0E-4};

        //======== panel1 ========
        {
            panel1.setBorder(new EmptyBorder(20, 10, 0, 10));

            panel1.setLayout(new GridBagLayout());
            ((GridBagLayout)panel1.getLayout()).columnWidths = new int[] {0, 0};
            ((GridBagLayout)panel1.getLayout()).rowHeights = new int[] {0, 0};
            ((GridBagLayout)panel1.getLayout()).columnWeights = new double[] {1.0, 1.0E-4};
            ((GridBagLayout)panel1.getLayout()).rowWeights = new double[] {1.0, 1.0E-4};

            //======== scrollPane1 ========
            {

                //---- textArea1 ----
                textArea1.setText("\uc57d\uad00 \ub0b4\uc6a9......\n\n\n\n\n\n\n\n\n\n\n\n\n\n\uc57d\uad00 \ub0b4\uc6a9.");
                textArea1.setRows(10);
                scrollPane1.setViewportView(textArea1);
                textArea1.setCaretPosition(0);
            }
            panel1.add(scrollPane1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 0, 0), 0, 0));
        }
        contentPane.add(panel1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 0), 0, 0));

        //======== panel2 ========
        {
            panel2.setBorder(new EmptyBorder(0, 10, 10, 10));
            panel2.setLayout(new GridBagLayout());
            ((GridBagLayout)panel2.getLayout()).columnWidths = new int[] {0, 0};
            ((GridBagLayout)panel2.getLayout()).rowHeights = new int[] {0, 0, 0};
            ((GridBagLayout)panel2.getLayout()).columnWeights = new double[] {1.0, 1.0E-4};
            ((GridBagLayout)panel2.getLayout()).rowWeights = new double[] {0.0, 0.0, 1.0E-4};

            //======== panel3 ========
            {
                panel3.setLayout(new GridBagLayout());
                ((GridBagLayout)panel3.getLayout()).columnWidths = new int[] {0, 0, 0};
                ((GridBagLayout)panel3.getLayout()).rowHeights = new int[] {0, 0};
                ((GridBagLayout)panel3.getLayout()).columnWeights = new double[] {0.0, 0.0, 1.0E-4};
                ((GridBagLayout)panel3.getLayout()).rowWeights = new double[] {0.0, 1.0E-4};

                //---- checkBox1 ----
                checkBox1.setText("\uc704\uc758 \uc57d\uad00\uc5d0 \ub3d9\uc758\ud569\ub2c8\ub2e4.");
                panel3.add(checkBox1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 0, 5), 0, 0));
            }
            panel2.add(panel3, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 5, 0), 0, 0));

            //======== panel4 ========
            {
                panel4.setLayout(new BorderLayout());

                //---- button1 ----
                button1.setText("\ub2e4\uc74c");
                panel4.add(button1, BorderLayout.EAST);
            }
            panel2.add(panel4, new GridBagConstraints(0, 1, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 0, 0), 0, 0));
        }
        contentPane.add(panel2, new GridBagConstraints(0, 1, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 0, 0), 0, 0));
        setSize(495, 300);
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
        setVisible(true);

        button1.addActionListener(e -> {
            if(checkBox1.isSelected()){
                //SessionStatic.LicenseChk = true;
                new RoleChooseScreen();
                dispose();
            }else{
                JOptionPane.showMessageDialog(null, "\uc704\uc758 \uc57d\uad00\uc5d0 \ub3d9\uc758\ud574\uc57c \ud569\ub2c8\ub2e4.");


            }
        });
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - Hyeonil
    private JPanel panel1;
    private JScrollPane scrollPane1;
    private JTextArea textArea1;
    private JPanel panel2;
    private JPanel panel3;
    private JCheckBox checkBox1;
    private JPanel panel4;
    private JButton button1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on

}
