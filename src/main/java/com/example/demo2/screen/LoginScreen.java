/*
 * Created by JFormDesigner on Sun Mar 17 04:55:01 KST 2024
 */

package com.example.demo2.screen;

import com.example.demo2.accessingdatajpa.SessionStatic;
import com.example.demo2.domain.AdminGradePermit;
import com.example.demo2.domain.AdminGradePermitDAO;
import com.example.demo2.domain.UserInfo;
import com.example.demo2.domain.UserInfoDAO;
import com.example.demo2.screen.admin.AdminScreen2;
import com.example.demo2.screen.help.HelpScreen;
import com.example.demo2.util.Util;
import com.formdev.flatlaf.FlatDarculaLaf;
import org.mindrot.jbcrypt.BCrypt;

import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;
import javax.swing.*;
import javax.swing.border.*;

/**
 * @author ee323
 */
public class LoginScreen extends JFrame {
    public LoginScreen() {
        //저장된 setting.txt파일을 불러와서, email을 채워넣기.

        try {
            File file = new File(Util.dataFPath + "settings.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String data = scanner.nextLine();
                if (data.contains("email")) {
                    this.email = data.split(":")[1].trim(); // Assuming the email is written as "email: example@example.com"
                    break;
                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Build setting file. //uploadData/settings.txt.");
            File file = new File(Util.dataFPath +"settings.txt");
            try {
                //file에 email: 이라는 내용을 넣어주기.
                file.createNewFile();
                FileWriter fileWriter = new FileWriter(file);
                fileWriter.write("email: " + email); // email is the email string you want to write to the file
                fileWriter.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }

        }


        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - Hyeonil
        panel1 = new JPanel();
        panel4 = new JPanel();
        panel5 = new JPanel();
        label2 = new JLabel();
        textField1 = new JTextField();
        label3 = new JLabel();
        passwordField1 = new JPasswordField();
        textField2 = new JTextField();
        panel7 = new JPanel();
        panel8 = new JPanel();
        checkBox1 = new JCheckBox();
        panel10 = new JPanel();
        panel11 = new JPanel();
        panel12 = new JPanel();
        button2 = new JButton();
        button3 = new JButton();

        //======== this ========
        setTitle("LOGIN");
        var contentPane = getContentPane();
        contentPane.setLayout(new GridBagLayout());
        ((GridBagLayout)contentPane.getLayout()).columnWidths = new int[] {0, 0};
        ((GridBagLayout)contentPane.getLayout()).rowHeights = new int[] {0, 0};
        ((GridBagLayout)contentPane.getLayout()).columnWeights = new double[] {1.0, 1.0E-4};
        ((GridBagLayout)contentPane.getLayout()).rowWeights = new double[] {1.0, 1.0E-4};

        //======== panel1 ========
        {
            panel1.setBorder(new EmptyBorder(30, 30, 20, 30));

            panel1.setLayout(new GridBagLayout());
            ((GridBagLayout)panel1.getLayout()).columnWidths = new int[] {0, 0};
            ((GridBagLayout)panel1.getLayout()).rowHeights = new int[] {0, 0};
            ((GridBagLayout)panel1.getLayout()).columnWeights = new double[] {1.0, 1.0E-4};
            ((GridBagLayout)panel1.getLayout()).rowWeights = new double[] {1.0, 1.0E-4};

            //======== panel4 ========
            {
                panel4.setLayout(new GridBagLayout());
                ((GridBagLayout)panel4.getLayout()).columnWidths = new int[] {0, 0};
                ((GridBagLayout)panel4.getLayout()).rowHeights = new int[] {0, 0, 0, 0};
                ((GridBagLayout)panel4.getLayout()).columnWeights = new double[] {1.0, 1.0E-4};
                ((GridBagLayout)panel4.getLayout()).rowWeights = new double[] {0.0, 0.0, 0.0, 1.0E-4};

                //======== panel5 ========
                {
                    panel5.setLayout(new GridBagLayout());
                    ((GridBagLayout)panel5.getLayout()).columnWidths = new int[] {0, 0, 0};
                    ((GridBagLayout)panel5.getLayout()).rowHeights = new int[] {0, 0, 0};
                    ((GridBagLayout)panel5.getLayout()).columnWeights = new double[] {0.0, 1.0, 1.0E-4};
                    ((GridBagLayout)panel5.getLayout()).rowWeights = new double[] {0.0, 0.0, 1.0E-4};

                    //---- label2 ----
                    label2.setText("EMail :");
                    panel5.add(label2, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 0, 5, 5), 0, 0));
                    panel5.add(textField1, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 0, 5, 0), 0, 0));

                    //---- label3 ----
                    label3.setText("Password :");
                    panel5.add(label3, new GridBagConstraints(0, 1, 1, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 0, 0, 5), 0, 0));
                    panel5.add(passwordField1, new GridBagConstraints(1, 1, 1, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 0, 0, 0), 0, 0));
                }
                panel4.add(panel5, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 5, 0), 0, 0));

                //======== panel7 ========
                {
                    panel7.setBorder(new EmptyBorder(5, 220, 5, 0));
                    panel7.setLayout(new GridBagLayout());
                    ((GridBagLayout)panel7.getLayout()).columnWidths = new int[] {0, 0};
                    ((GridBagLayout)panel7.getLayout()).rowHeights = new int[] {0, 0};
                    ((GridBagLayout)panel7.getLayout()).columnWeights = new double[] {0.0, 1.0E-4};
                    ((GridBagLayout)panel7.getLayout()).rowWeights = new double[] {0.0, 1.0E-4};

                    //======== panel8 ========
                    {
                        panel8.setLayout(new BorderLayout());

                        //---- checkBox1 ----
                        checkBox1.setText("\uc544\uc774\ub514 \uc800\uc7a5\ud558\uae30");
                        panel8.add(checkBox1, BorderLayout.WEST);
                    }
                    panel7.add(panel8, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 0, 0, 0), 0, 0));
                }
                panel4.add(panel7, new GridBagConstraints(0, 1, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 5, 0), 0, 0));

                //======== panel10 ========
                {
                    panel10.setBorder(new EmptyBorder(5, 0, 0, 0));
                    panel10.setLayout(new GridBagLayout());
                    ((GridBagLayout)panel10.getLayout()).columnWidths = new int[] {0, 0};
                    ((GridBagLayout)panel10.getLayout()).rowHeights = new int[] {0, 0};
                    ((GridBagLayout)panel10.getLayout()).columnWeights = new double[] {1.0, 1.0E-4};
                    ((GridBagLayout)panel10.getLayout()).rowWeights = new double[] {0.0, 1.0E-4};

                    //======== panel11 ========
                    {
                        panel11.setLayout(new BorderLayout());

                        //======== panel12 ========
                        {
                            panel12.setLayout(new GridBagLayout());
                            ((GridBagLayout)panel12.getLayout()).columnWidths = new int[] {0, 0, 0};
                            ((GridBagLayout)panel12.getLayout()).rowHeights = new int[] {0, 0};
                            ((GridBagLayout)panel12.getLayout()).columnWeights = new double[] {0.0, 0.0, 1.0E-4};
                            ((GridBagLayout)panel12.getLayout()).rowWeights = new double[] {0.0, 1.0E-4};

                            //---- button2 ----
                            button2.setText("\ub85c\uadf8\uc778");
                            panel12.add(button2, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
                                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                                new Insets(0, 0, 0, 5), 0, 0));

                            //---- button3 ----
                            button3.setText("Help");
                            panel12.add(button3, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
                                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                                new Insets(0, 0, 0, 0), 0, 0));
                        }
                        panel11.add(panel12, BorderLayout.EAST);
                    }
                    panel10.add(panel11, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 0, 0, 0), 0, 0));
                }
                panel4.add(panel10, new GridBagConstraints(0, 2, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 0, 0), 0, 0));
            }
            panel1.add(panel4, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 0, 0), 0, 0));
        }
        contentPane.add(panel1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 0, 0), 0, 0));
        setSize(400, 225);
        setLocationRelativeTo(getOwner());

        setDefaultCloseOperation(
                JFrame.DO_NOTHING_ON_CLOSE
        );

        addWindowListener(new WindowAdapter() {
                              public void windowClosing(WindowEvent e) {
                                  //버튼을 예, 아니오로 만들기.
                                  int result = JOptionPane.showConfirmDialog(null, "종료하시겠습니까?", "Confirm", JOptionPane.YES_NO_OPTION);
                                  if(result == JOptionPane.OK_OPTION){
                                      System.exit(0);
                                  }
                              }
                          }
        );
        textField1.setText(email);
        if(email != null && !email.equals("")){
            checkBox1.setSelected(true);
        }

        passwordField1.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode() == KeyEvent.VK_ENTER){
                    // button 클릭처리
                    button2.doClick();
                }
            }
        });

        // 버튼 이벤트 처리
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String email = textField1.getText();
                String t = new String(passwordField1.getPassword());
                UserInfoDAO userInfoDAO = new UserInfoDAO();

                UserInfo userInfo = userInfoDAO.findByEmail(email);
                if(userInfo == null) {

                    //새창을 띄워서, 표시 해주기.
                    JOptionPane.showMessageDialog(null, "로그인 할 수 없습니다.");

                }else{

                    if(BCrypt.checkpw(t,userInfo.getPassword())){
                        //회원등급이 ADMIN인지 확인.
                        if(userInfo.getRole().equals("ADMIN")){
                            //AdminGradePermit 테이블에 isPermit이 Y인지 확인.
                            AdminGradePermitDAO adminGradePermitDAO = new AdminGradePermitDAO();
                            AdminGradePermit adminGradePermit = adminGradePermitDAO.findByUserInfoId(userInfo.getId());
                            if(adminGradePermit!=null){
                                if(adminGradePermit.getIsPermit().equals("N")){
                                    JOptionPane.showMessageDialog(null, "관리자 승인이 필요합니다. \nisPermit=N");
                                    new AdminPermitYetScreen(userInfo);

                                }else{
                                    System.out.println("로그인 성공, "+ userInfo.getEmail());
                                    JOptionPane.showMessageDialog(null, "로그인 되었습니다.");
                                    StaticTable.loginScreen.dispose();

                                    SessionStatic.logUserInfo = userInfo;

                                    AdminScreen2 adminScreen = new AdminScreen2();
                                    adminScreen.setVisible(true);
                                }

                            }else{

                            }
                        }else if(userInfo.getRole().equals("USER")){
                            System.out.println("로그인 성공, "+ userInfo.getEmail());
                            StaticTable.loginScreen.dispose();
                            StaticTable.entitiesScreen = new EntitiesScreen();
                            SessionStatic.logUserInfo = userInfo;
                            StaticTable.statusScreen = new StatusScreen();
                        }

                    }else{
                        System.out.println("비밀번호가 틀렸습니다.");


                        JOptionPane.showMessageDialog(null, "비밀번호가 틀림니다.");
                    }
                }


            }
        });

        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StaticTable.helpScreen = new HelpScreen();
            }
        });

        //textField1.setText("tt2t2am1118@gmail.com");

        checkBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(checkBox1.isSelected()){

                    //저장된 setting.txt파일을 불러와서, email을 채워넣기.
                    try {
                        File file = new File(Util.dataFPath + "settings.txt");
                        FileWriter fileWriter = new FileWriter(file);
                        fileWriter.write("email: " +   textField1.getText()); // email is the email string you want to write to the file
                        fileWriter.close();

                        }catch (Exception e1){
                            e1.printStackTrace();
                    }

                }
            }
        });

        setVisible(true);

        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - Hyeonil
    private JPanel panel1;
    private JPanel panel4;
    private JPanel panel5;
    private JLabel label2;
    private JTextField textField1;
    private JLabel label3;
    private JTextField textField2;
    private JPasswordField passwordField1;
    private JPanel panel7;
    private JPanel panel8;
    private JCheckBox checkBox1;
    private JPanel panel10;
    private JPanel panel11;
    private JPanel panel12;
    private JButton button2;
    private JButton button3;

    private String email;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
    public static void main(String[] args) {
        FlatDarculaLaf.setup();
        new LoginScreen().setVisible(true);
    }
}
