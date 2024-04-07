/*
 * Created by JFormDesigner on Sun Mar 17 03:57:18 KST 2024
 */

package com.example.demo2.screen.admin;

import com.example.demo2.screen.EntitiesScreen;
import com.example.demo2.screen.LoginScreen;
import com.example.demo2.screen.StaticTable;
import com.example.demo2.util.MultiLineCellRenderer;
import com.formdev.flatlaf.FlatDarculaLaf;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

/**
 * @author ee323
 */
public class AdminScreen3 extends JFrame {
    public AdminScreen3() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - Hyeonil
        menuBar1 = new JMenuBar();
        menu1 = new JMenu();
        menuItem1 = new JMenuItem();
        menuItem4 = new JMenuItem();
        menuItem5 = new JMenuItem();
        menu3 = new JMenu();
        menuItem3 = new JMenuItem();
        menu4 = new JMenu();
        menuItem6 = new JMenuItem();
        panel3 = new JPanel();
        scrollPane1 = new JScrollPane();
        String[] columnNames = {"time", "comment", "check"};
        Object[][] data = {
                {"10:00", "내용1","new"},
                {"11:00", "내용2"},
                {"12:00", "로그인 되었습니다. \n안녕하세요. 좋은 하루되세요."},
        };
        DefaultTableModel model = new DefaultTableModel(data, columnNames);
        table1 = new JTable(model);
        table1.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        table1.getColumnModel().getColumn(1).setCellRenderer(new MultiLineCellRenderer());
        model.addRow(new Object[]{"13:00", "로dsfdsfsdfsdfsdfsdfsdfsdfsdfsdfsdfffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff그아웃 되었습니다. \n안녕히가세요.\n sdfjfjkdsflsds\n sdlfkjlsdjflsdjfdf."});
        model.addRow(new Object[]{"14:00", "로그인 되었습니다. \n안녕하세요. 좋은 하루되세요."});
        model.addRow(new Object[]{"15:00", "로그아웃 되었습니다. \n안녕히가세요."});
        model.addRow(new Object[]{"16:00", "로그인 되었습니다. \n안녕하세요. 좋은 하루되세요."});
        model.addRow(new Object[]{"17:00", "로그아웃 되었습니다. \n안녕히가세요."});
        model.addRow(new Object[]{"18:00", "로그인 되었습니다. \n안녕하세요. 좋은 하루되세요."});
        model.addRow(new Object[]{"14:00", "로그인 되었습니다. \n안녕하세요. 좋은 하루되세요."});
        model.addRow(new Object[]{"15:00", "로그아웃 되었습니다. \n안녕히가세요."});
        model.addRow(new Object[]{"16:00", "로그인 되었습니다. \n안녕하세요. 좋은 하루되세요."});
        model.addRow(new Object[]{"17:00", "로그아웃 되었습니다. \n안녕히가세요."});
        model.addRow(new Object[]{"18:00", "로그인 되었습니다. \n안녕하세요. 좋은 하루되세요."});
        model.addRow(new Object[]{"14:00", "로그인 되었습니다. \n안녕하세요. 좋은 하루되세요."});
        model.addRow(new Object[]{"15:00", "로그아웃 되었습니다. \n안녕히가세요."});
        model.addRow(new Object[]{"16:00", "로그인 되었습니다. \n안녕하세요. 좋은 하루되세요."});
        model.addRow(new Object[]{"17:00", "로그아웃 되었습니다. \n안녕히가세요."});
        model.addRow(new Object[]{"18:00", "로그인 되었습니다. \n안녕하세요. 좋은 하루되세요."});
        model.addRow(new Object[]{"14:00", "로그인 되었습니다. \n안녕하세요. 좋은 하루되세요."});
        model.addRow(new Object[]{"15:00", "로그아웃 되었습니다. \n안녕히가세요."});
        model.addRow(new Object[]{"16:00", "로그인 되었습니다. \n안녕하세요. 좋은 하루되세요."});
        model.addRow(new Object[]{"17:00", "로그아웃 되었습니다. \n안녕히가세요."});
        model.addRow(new Object[]{"18:00", "로그인 되었습니다. \n안녕하세요. 좋은 하루되세요."});
        panel1 = new JPanel();
        panel2 = new JPanel();
        label1 = new JLabel();

        //======== this ========
        setTitle("Admin");
        var contentPane = getContentPane();
        contentPane.setLayout(new GridBagLayout());
        ((GridBagLayout)contentPane.getLayout()).columnWidths = new int[] {0, 0};
        ((GridBagLayout)contentPane.getLayout()).rowHeights = new int[] {0, 0, 0};
        ((GridBagLayout)contentPane.getLayout()).columnWeights = new double[] {1.0, 1.0E-4};
        ((GridBagLayout)contentPane.getLayout()).rowWeights = new double[] {1.0, 0.0, 1.0E-4};

        //======== menuBar1 ========
        {

            //======== menu1 ========
            {
                menu1.setText("Work");

                //---- menuItem1 ----
                menuItem1.setText("Role \uc2b9\uc778\ud558\uae30");
                menu1.add(menuItem1);

                //---- menuItem4 ----
                menuItem4.setText("\uc0c1\ub2f4\uc5c5\ubb34");
                menu1.add(menuItem4);
                menu1.addSeparator();

                //---- menuItem5 ----
                menuItem5.setText("\ub85c\uadf8\uc544\uc6c3");
                menu1.add(menuItem5);
            }
            menuBar1.add(menu1);

            //======== menu3 ========
            {
                menu3.setText("Entity");

                //---- menuItem3 ----
                menuItem3.setText("\ud14c\uc774\ube14 \ubcf4\uae30");
                menu3.add(menuItem3);
            }
            menuBar1.add(menu3);

            //======== menu4 ========
            {
                menu4.setText("MyPage");

                //---- menuItem6 ----
                menuItem6.setText("\ub098\uc758 \uc815\ubcf4\ubcf4\uae30");
                menu4.add(menuItem6);
            }
            menuBar1.add(menu4);
        }
        setJMenuBar(menuBar1);

        //======== panel3 ========
        {
            panel3.setBorder(new EmptyBorder(10, 10, 0, 10));

            panel3.setLayout(new GridBagLayout());
            ((GridBagLayout)panel3.getLayout()).columnWidths = new int[] {0, 0};
            ((GridBagLayout)panel3.getLayout()).rowHeights = new int[] {0, 0};
            ((GridBagLayout)panel3.getLayout()).columnWeights = new double[] {1.0, 1.0E-4};
            ((GridBagLayout)panel3.getLayout()).rowWeights = new double[] {1.0, 1.0E-4};

            //======== scrollPane1 ========
            {
                scrollPane1.setViewportView(table1);
            }
            panel3.add(scrollPane1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 0, 0), 0, 0));
        }
        contentPane.add(panel3, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 0), 0, 0));

        //======== panel1 ========
        {
            panel1.setLayout(new GridBagLayout());
            ((GridBagLayout)panel1.getLayout()).columnWidths = new int[] {0, 0, 0};
            ((GridBagLayout)panel1.getLayout()).rowHeights = new int[] {0, 0};
            ((GridBagLayout)panel1.getLayout()).columnWeights = new double[] {1.0, 0.0, 1.0E-4};
            ((GridBagLayout)panel1.getLayout()).rowWeights = new double[] {0.0, 1.0E-4};

            //======== panel2 ========
            {
                panel2.setBorder(new EmptyBorder(0, 5, 5, 5));
                panel2.setLayout(new GridBagLayout());
                ((GridBagLayout)panel2.getLayout()).columnWidths = new int[] {0, 0};
                ((GridBagLayout)panel2.getLayout()).rowHeights = new int[] {0, 0};
                ((GridBagLayout)panel2.getLayout()).columnWeights = new double[] {0.0, 1.0E-4};
                ((GridBagLayout)panel2.getLayout()).rowWeights = new double[] {0.0, 1.0E-4};

                //---- label1 ----
                label1.setText("Login, tt2t2am1119@gmail.com");
                panel2.add(label1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 0, 0), 0, 0));
            }
            panel1.add(panel2, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 0, 0), 0, 0));
        }
        contentPane.add(panel1, new GridBagConstraints(0, 1, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 0, 0), 0, 0));
        //setSize(400, 300);
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on

       // table1.getColumnModel().getColumn(0).setPreferredWidth(100); // "시간" 칼럼의 너비를 100으로 설정
       // table1.getColumnModel().getColumn(1).setPreferredWidth(200);


      //  table1.setTableHeader(null);
        setVisible(true);
        //엔티티보기
        menuItem3.addActionListener(e -> {
            if(StaticTable.entitiesScreen != null){
                StaticTable.entitiesScreen.dispose();
                StaticTable.entitiesScreen =  new EntitiesScreen();
            }else{
                StaticTable.entitiesScreen = new EntitiesScreen();
            }


        });
        menuItem5.addActionListener(e -> {
            //로그아웃 할까요? 라고 물어보기.
            int result = JOptionPane.showConfirmDialog(this, "로그아웃 하시겠습니까?", "로그아웃", JOptionPane.YES_NO_OPTION);
            if(result == JOptionPane.YES_OPTION){
                JOptionPane.showMessageDialog(null, "로그아웃 되었습니다.");

                dispose();
                StaticTable.loginScreen = new LoginScreen();
            }


        });

        table1.getColumnModel().getColumn(0).setPreferredWidth(80); // "시간" 칼럼의 너비를 100으로 설정
        int frameWidth = this.getWidth();
        table1.getColumnModel().getColumn(1).setPreferredWidth(300); // "내용" 칼럼의 너비를 200으로 설정
        //table1.setTableHeader(null);
        pack();

    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - Hyeonil
    private JMenuBar menuBar1;
    private JMenu menu1;
    private JMenuItem menuItem1;
    private JMenuItem menuItem4;
    private JMenuItem menuItem5;
    private JMenu menu3;
    private JMenuItem menuItem3;
    private JMenu menu4;
    private JMenuItem menuItem6;
    private JPanel panel3;
    private JScrollPane scrollPane1;
    private JTable table1;
    private JPanel panel1;
    private JPanel panel2;
    private JLabel label1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on


    public static void main(String[] args) {
        FlatDarculaLaf.setup();
        AdminScreen3 adminScreen = new AdminScreen3();
        adminScreen.setVisible(true);
    }
}
