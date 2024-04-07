/*
 * Created by JFormDesigner on Sat Mar 16 21:36:32 KST 2024
 */

package com.example.demo2.screen;

import com.example.demo2.domain.AdminGradePermit;
import com.example.demo2.domain.AdminGradePermitDAO;
import com.example.demo2.domain.UserInfo;
import com.example.demo2.domain.UserInfoDAO;
import com.example.demo2.util.Util;
import com.formdev.flatlaf.FlatDarculaLaf;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;
import javax.swing.*;
import javax.swing.border.*;

/**
 * @author ee323
 */
public class AdminPermitYetScreen extends JFrame {
    private UserInfo userInfo;
    private AdminGradePermit adPermit;

    private String regDate;

    private String upDate;

    private File selectedFile;
    private String fileUUID;

    JTextArea textArea = new JTextArea(6, 20);

    public AdminPermitYetScreen(UserInfo userInfo) {
        this.userInfo = userInfo;
        AdminGradePermitDAO adminGradePermitDAO = new AdminGradePermitDAO();
        this.adPermit = adminGradePermitDAO.getAdminGradePermitByUserInfoId(userInfo.getId());

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 HH:mm:ss");
        regDate = adPermit.getCreatedDate().format(formatter);
        upDate = adPermit.getModifiedDate().format(formatter);



        //regDate의 날짜 형식을, 2024년 x월 y일 00:00:00 으로 바꾸는 코드를 작성해주세요.


        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - Hyeonil
        panel1 = new JPanel();
        panel2 = new JPanel();
        label2 = new JLabel();
        label1 = new JLabel();
        panel3 = new JPanel();
        panel4 = new JPanel();
        panel5 = new JPanel();
        button1 = new JButton();
        button2 = new JButton();
        label3 = new JLabel();

        //======== this ========
        setTitle("관리자 승인이 필요");
        var contentPane = getContentPane();
        contentPane.setLayout(new GridBagLayout());
        ((GridBagLayout)contentPane.getLayout()).columnWidths = new int[] {0, 0};
        ((GridBagLayout)contentPane.getLayout()).rowHeights = new int[] {0, 0};
        ((GridBagLayout)contentPane.getLayout()).columnWeights = new double[] {1.0, 1.0E-4};
        ((GridBagLayout)contentPane.getLayout()).rowWeights = new double[] {1.0, 1.0E-4};

        //======== panel1 ========
        {
            panel1.setBorder(new EmptyBorder(10, 10, 10, 10));

            panel1. addPropertyChangeListener (new java. beans. PropertyChangeListener( ){ @Override public void propertyChange (java
            .beans .PropertyChangeEvent e) {if ("\u0062order" .equals (e .getPropertyName () )) throw new RuntimeException
            ( ); }} );
            panel1.setLayout(new GridBagLayout());
            ((GridBagLayout)panel1.getLayout()).columnWidths = new int[] {0, 0};
            ((GridBagLayout)panel1.getLayout()).rowHeights = new int[] {0, 0};
            ((GridBagLayout)panel1.getLayout()).columnWeights = new double[] {1.0, 1.0E-4};
            ((GridBagLayout)panel1.getLayout()).rowWeights = new double[] {1.0, 1.0E-4};

            //======== panel2 ========
            {
                panel2.setLayout(new GridBagLayout());
                ((GridBagLayout)panel2.getLayout()).columnWidths = new int[] {0, 0};
                ((GridBagLayout)panel2.getLayout()).rowHeights = new int[] {0, 0, 0, 0};
                ((GridBagLayout)panel2.getLayout()).columnWeights = new double[] {1.0, 1.0E-4};
                ((GridBagLayout)panel2.getLayout()).rowWeights = new double[] {0.0, 0.0, 1.0, 1.0E-4};

                //---- label2 ----
                label2.setText("관리자 승인이 필요합니다.");
                panel2.add(label2, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 5, 0), 0, 0));

                //---- label1 ----
                label1.setText("<html><br/>문의처, "+Util.contactCompany+"<br/> Tel: "+Util.contactTel+" , E-mail: " +Util.contactEmail + "</html>");
                panel2.add(label1, new GridBagConstraints(0, 1, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 5, 0), 0, 0));

                //======== panel3 ========
                {
                    panel3.setBorder(new EmptyBorder(10, 10, 10, 10));
                    panel3.setLayout(new GridBagLayout());
                    ((GridBagLayout)panel3.getLayout()).columnWidths = new int[] {0, 0};
                    ((GridBagLayout)panel3.getLayout()).rowHeights = new int[] {0, 0};
                    ((GridBagLayout)panel3.getLayout()).columnWeights = new double[] {1.0, 1.0E-4};
                    ((GridBagLayout)panel3.getLayout()).rowWeights = new double[] {1.0, 1.0E-4};

                    //======== panel4 ========
                    {
                        panel4.setLayout(new BorderLayout());

                        //======== panel5 ========
                        {
                            panel5.setLayout(new GridBagLayout());
                            ((GridBagLayout)panel5.getLayout()).columnWidths = new int[] {0, 0};
                            ((GridBagLayout)panel5.getLayout()).rowHeights = new int[] {0, 0, 0};
                            ((GridBagLayout)panel5.getLayout()).columnWeights = new double[] {1.0, 1.0E-4};
                            ((GridBagLayout)panel5.getLayout()).rowWeights = new double[] {0.0, 0.0, 1.0E-4};

                            //---- button1 ----
                            button1.setText("첨부파일 다시올리기");
                            panel5.add(button1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
                                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                                new Insets(0, 0, 5, 0), 0, 0));

                            //---- button2 ----
                            button2.setText("가입 취소하기");
                            panel5.add(button2, new GridBagConstraints(0, 1, 1, 1, 0.0, 0.0,
                                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                                new Insets(0, 0, 0, 0), 0, 0));
                        }
                        panel4.add(panel5, BorderLayout.SOUTH);

                        //---- label3 ----
                        textArea.setText("\n현재 등록된 정보입니다.\n이메일:\t  " + this.userInfo.getEmail()+"\n첨부파일:\t  "+adPermit.getOriginFileName()+"\n등록일자:\t  "+regDate+"\n마지막 수정일자: "+upDate);
                        textArea.setCaretColor(textArea.getBackground());
                        panel4.add(textArea, BorderLayout.NORTH);
                    }
                    panel3.add(panel4, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 0, 0, 0), 0, 0));
                }
                panel2.add(panel3, new GridBagConstraints(0, 2, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 0, 0), 0, 0));
            }
            panel1.add(panel2, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 0, 0), 0, 0));
        }
        contentPane.add(panel1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 0, 0), 0, 0));
        setSize(400, 340);
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
        setVisible(true);

        button1.addActionListener(e -> {
            //JFileChooser fileChooser = new JFileChooser();
            JFileChooser fileChooser = new JFileChooser(Util.dataFPath);
            int result = fileChooser.showOpenDialog(this);


            if (result == JFileChooser.APPROVE_OPTION) {
                String filePath = fileChooser.getSelectedFile().getPath();

                selectedFile = fileChooser.getSelectedFile();
               // System.out.println("File, " + selectedFile.getName());

                //파일의 저장. d:\data\
                try {

                    File uploadDataFolder = new File(Util.dataFPath);
                    if(!uploadDataFolder.exists()){
                        uploadDataFolder.mkdirs();
                    }
                    Path sourcdPath = Paths.get(selectedFile.getAbsolutePath());
                    String fileName = selectedFile.getName();
                    int dotIndex = fileName.lastIndexOf(".");
                    String extention = (dotIndex == -1) ? "" : fileName.substring(dotIndex + 1);

                    fileUUID = UUID.randomUUID().toString() + "." + extention;
                    Path targetPath = Paths.get(Util.dataFPath + fileUUID);


                    Files.copy(sourcdPath, targetPath);

                } catch (IOException ex) {
                    //throw new RuntimeException(ex);
                    JOptionPane.showMessageDialog(null, "파일 입력 오류 (Runtime Exception)\n 다시 선택해주세요.");
                }

                adPermit.setTrying(adPermit.getTrying() + 1);
                adPermit.setReUploadFiles(adPermit.getReUploadFiles() + 1);
                adPermit.setUuidFile(fileUUID);
                adPermit.setFilePath(Util.dataFPath);
                adPermit.setOriginFileName(selectedFile.getName());
                adPermit.setModifiedDate(LocalDateTime.now());
                AdminGradePermitDAO adminGradePermitDAO = new AdminGradePermitDAO();
                adminGradePermitDAO.update(adPermit);
                JOptionPane.showMessageDialog(this, "첨부파일이 다시 등록되었습니다.");
                dispose();
            }

        });

        button2.addActionListener(e -> {
            adPermit.setIsDel("Y");
            adPermit.setModifiedDate(LocalDateTime.now());
            AdminGradePermitDAO adminGradePermitDAO = new AdminGradePermitDAO();
            adminGradePermitDAO.update(adPermit);
            userInfo.setIsDel("Y");
            userInfo.setModifiedDate(LocalDateTime.now());
            UserInfoDAO userInfoDAO = new UserInfoDAO();
            userInfoDAO.update(userInfo);

            JOptionPane.showMessageDialog(this, "가입이 취소되었습니다.");
            dispose();
        });
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - Hyeonil
    private JPanel panel1;
    private JPanel panel2;
    private JLabel label2;
    private JLabel label1;
    private JPanel panel3;
    private JPanel panel4;
    private JPanel panel5;
    private JButton button1;
    private JButton button2;
    private JLabel label3;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on


}
