/*
 * Created by JFormDesigner on Sun Mar 10 21:14:39 KST 2024
 */

package com.example.demo2.screen.help;

import com.example.demo2.domain.AdminGradePermit;
import com.example.demo2.domain.AdminGradePermitDAO;
import com.example.demo2.domain.UserInfo;
import com.example.demo2.domain.UserInfoDAO;
import com.example.demo2.util.ChkValidate;
import com.example.demo2.util.SendMailNumber;
import com.example.demo2.util.Util;
import com.formdev.flatlaf.FlatLightLaf;
import org.apache.commons.io.FileUtils;
import org.mindrot.jbcrypt.BCrypt;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.UUID;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 * @author ee323
 */
public class RegistADMINScreen extends JFrame {

    boolean mailChk = false;
    boolean authNumberSended = false;

    String authNumber;

    String inputEmail;

    File selectedFile;
    String fileUUID;

    public RegistADMINScreen() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - Hyeonil
        panel1 = new JPanel();
        panel2 = new JPanel();
        panel4 = new JPanel();
        panel5 = new JPanel();
        label1 = new JLabel();
        textField1 = new JTextField();
        button1 = new JButton();
        label2 = new JLabel();
        textField2 = new JTextField();
        label3 = new JLabel();
        passwordField1 = new JPasswordField();
        passwordField2 = new JPasswordField();
        panel3 = new JPanel();
        panel6 = new JPanel();
        label4 = new JLabel();
        textField3 = new JTextField();
        button2 = new JButton();
        label5 = new JLabel();
        button3 = new JButton();

        //======== this ========
        setTitle("회원등록 - ADMIN");
        var contentPane = getContentPane();
        contentPane.setLayout(new GridBagLayout());
        ((GridBagLayout)contentPane.getLayout()).columnWidths = new int[] {0, 0};
        ((GridBagLayout)contentPane.getLayout()).rowHeights = new int[] {0, 0};
        ((GridBagLayout)contentPane.getLayout()).columnWeights = new double[] {1.0, 1.0E-4};
        ((GridBagLayout)contentPane.getLayout()).rowWeights = new double[] {1.0, 1.0E-4};

        //======== panel1 ========
        {
            panel1.setBorder(new EmptyBorder(15, 10, 10, 10));

            panel1.setLayout(new GridBagLayout());
            ((GridBagLayout)panel1.getLayout()).columnWidths = new int[] {0, 0};
            ((GridBagLayout)panel1.getLayout()).rowHeights = new int[] {0, 0, 0};
            ((GridBagLayout)panel1.getLayout()).columnWeights = new double[] {1.0, 1.0E-4};
            ((GridBagLayout)panel1.getLayout()).rowWeights = new double[] {0.0, 0.0, 1.0E-4};

            //======== panel2 ========
            {
                panel2.setBorder(new TitledBorder("User Info"));
                panel2.setLayout(new GridBagLayout());
                ((GridBagLayout)panel2.getLayout()).columnWidths = new int[] {0, 0};
                ((GridBagLayout)panel2.getLayout()).rowHeights = new int[] {0, 0};
                ((GridBagLayout)panel2.getLayout()).columnWeights = new double[] {1.0, 1.0E-4};
                ((GridBagLayout)panel2.getLayout()).rowWeights = new double[] {0.0, 1.0E-4};

                //======== panel4 ========
                {
                    panel4.setBorder(new EmptyBorder(10, 10, 10, 10));
                    panel4.setLayout(new GridBagLayout());
                    ((GridBagLayout)panel4.getLayout()).columnWidths = new int[] {0, 0};
                    ((GridBagLayout)panel4.getLayout()).rowHeights = new int[] {0, 0};
                    ((GridBagLayout)panel4.getLayout()).columnWeights = new double[] {1.0, 1.0E-4};
                    ((GridBagLayout)panel4.getLayout()).rowWeights = new double[] {0.0, 1.0E-4};

                    //======== panel5 ========
                    {
                        panel5.setLayout(new GridBagLayout());
                        ((GridBagLayout)panel5.getLayout()).columnWidths = new int[] {0, 0, 0, 0};
                        ((GridBagLayout)panel5.getLayout()).rowHeights = new int[] {0, 0, 0, 0, 0};
                        ((GridBagLayout)panel5.getLayout()).columnWeights = new double[] {0.0, 1.0, 0.0, 1.0E-4};
                        ((GridBagLayout)panel5.getLayout()).rowWeights = new double[] {0.0, 0.0, 0.0, 0.0, 1.0E-4};

                        //---- label1 ----
                        label1.setText("E-Mail:");
                        panel5.add(label1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
                            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                            new Insets(0, 0, 5, 5), 0, 0));
                        panel5.add(textField1, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
                            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                            new Insets(0, 0, 5, 5), 0, 0));

                        //---- button1 ----
                        button1.setText("\uc778\uc99d\ubc88\ud638\ubc1b\uae30");
                        panel5.add(button1, new GridBagConstraints(2, 0, 1, 1, 0.0, 0.0,
                            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                            new Insets(0, 0, 5, 0), 0, 0));

                        //---- label2 ----
                        label2.setText("\uc778\uc99d\ubc88\ud638:");
                        panel5.add(label2, new GridBagConstraints(0, 1, 1, 1, 0.0, 0.0,
                            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                            new Insets(0, 0, 5, 5), 0, 0));
                        panel5.add(textField2, new GridBagConstraints(1, 1, 1, 1, 0.0, 0.0,
                            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                            new Insets(0, 0, 5, 5), 0, 0));

                        //---- label3 ----
                        label3.setText("Password:");
                        panel5.add(label3, new GridBagConstraints(0, 2, 1, 1, 0.0, 0.0,
                            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                            new Insets(0, 0, 5, 5), 0, 0));
                        panel5.add(passwordField1, new GridBagConstraints(1, 2, 1, 1, 0.0, 0.0,
                            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                            new Insets(0, 0, 5, 5), 0, 0));
                        panel5.add(passwordField2, new GridBagConstraints(1, 3, 1, 1, 0.0, 0.0,
                            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                            new Insets(0, 0, 0, 5), 0, 0));
                    }
                    panel4.add(panel5, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 0, 0, 0), 0, 0));
                }
                panel2.add(panel4, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 0, 0), 0, 0));
            }
            panel1.add(panel2, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
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

                //======== panel6 ========
                {
                    panel6.setLayout(new GridBagLayout());
                    ((GridBagLayout)panel6.getLayout()).columnWidths = new int[] {0, 0, 0, 0};
                    ((GridBagLayout)panel6.getLayout()).rowHeights = new int[] {0, 0, 0, 0};
                    ((GridBagLayout)panel6.getLayout()).columnWeights = new double[] {1.0, 0.0, 0.0, 1.0E-4};
                    ((GridBagLayout)panel6.getLayout()).rowWeights = new double[] {0.0, 0.0, 0.0, 1.0E-4};

                    //---- label4 ----
                    label4.setText("\ud30c\uc77c \ucca8\ubd80 (\uc790\uaca9\uc99d \uc0ac\ubcf8, \uac1c\uc778\uc815\ubcf4 \ucde8\uae09\uc0ac \ub4f1):");
                    panel6.add(label4, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 0, 5, 5), 0, 0));
                    panel6.add(textField3, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 0, 5, 5), 0, 0));

                    //---- button2 ----
                    button2.setText("\ud30c\uc77c\ucca8\ubd80");
                    panel6.add(button2, new GridBagConstraints(2, 0, 1, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 0, 5, 0), 0, 0));

                    //---- label5 ----
                    label5.setText("<html>ADMIN \ub4f1\ub85d\uc758 \uacbd\uc6b0, \uad00\ub828 \ucca8\ubd80\ud30c\uc77c\uc774 \ud544\uc694\ud569\ub2c8\ub2e4.<br> (\ud655\uc778 \ud544\uc694) \uba54\uc77c\ubb38\uc758, abcdefghigj@abcdefg.com</html>");

                    panel6.add(label5, new GridBagConstraints(0, 1, 1, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 0, 5, 5), 0, 0));

                    //---- button3 ----
                    button3.setText("\ud68c\uc6d0 \ub4f1\ub85d");
                    panel6.add(button3, new GridBagConstraints(2, 2, 1, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 0, 0, 0), 0, 0));
                }
                panel3.add(panel6, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 0, 0), 0, 0));
            }
            panel1.add(panel3, new GridBagConstraints(0, 1, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 0, 0), 0, 0));
        }
        contentPane.add(panel1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 0, 0), 0, 0));
        setSize(510, 330);
        setLocationRelativeTo(getOwner());
        setVisible(true);

        button1.addActionListener(e -> {
            String email = textField1.getText();
            if(email.equals("")){
                JOptionPane.showMessageDialog(null, "이메일을 입력해주세요.");

            }else if(!ChkValidate.isEmail(email)){
                JOptionPane.showMessageDialog(null, "이메일 형식이 아닙니다.");
            }else{
                //메일 중복확인. UserInfo
                UserInfoDAO userInfoDAO = new UserInfoDAO();
                UserInfo userInfo = userInfoDAO.findByEmail(email);
                SendMailNumber mailNumber = new SendMailNumber();
                if(userInfo != null) {
                    JOptionPane.showMessageDialog(null, "이미 가입된 이메일입니다.");
                }else{
                    if(!authNumberSended){

                        //System.out.println(email);
                        boolean success= mailNumber.sendMailNumber(email);
                        if(success){
                            JOptionPane.showMessageDialog(null, "인증번호가 발송되었습니다. 인증번호를 입력해주세요.");
                            inputEmail = email;
                            authNumber = mailNumber.getAuthNumber();
                            System.out.println(authNumber + " authNumber.");
                            authNumberSended = true;
                            mailChk= true;

                        }else{
                            JOptionPane.showMessageDialog(null, "인증번호 발송에 실패했습니다. 다시 시도해주세요.");
                        }
                    }else{
                        JOptionPane.showMessageDialog(null, "이미 인증번호가 발송되었습니다. 3분 뒤에 재 발송가능합니다.");
                        Timer timer = new Timer(180000, new ActionListener() { //3분.
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                authNumberSended = false;
                            }
                        });
                        timer.setRepeats(false); // Timer should only go off once
                        timer.start();

                    }


                }


            }

        }); //button1 end

        button2.addActionListener(e -> {
            // JFileChooser 객체 생성
            JFileChooser fileChooser = new JFileChooser();

            // 파일 필터 설정
            //fileChooser.setFileFilter(new FileNameExtensionFilter("텍스트 파일", "txt"));
            fileChooser.setFileFilter(new FileNameExtensionFilter("이미지 파일", "jpg", "png", "gif"));
            // 다중 선택 설정
            fileChooser.setMultiSelectionEnabled(true);

            // 미리 보기 설정
            fileChooser.setAccessory(new JTextPane());

            // 다이얼로그 상자 표시
            int returnVal = fileChooser.showOpenDialog(null);

            // 사용자 선택 처리
            if (returnVal == JFileChooser.APPROVE_OPTION) {
                selectedFile = fileChooser.getSelectedFile();

                textField3.setText(selectedFile.getName());
            }
        });

        button3.addActionListener(e -> {
            if(passwordField1 == null || passwordField2 == null || textField1 == null || textField2 == null || textField3 == null){
                JOptionPane.showMessageDialog(null, "모든 항목을 입력해주세요.");
            }

            if(mailChk){
                if(authNumber.equals(textField2.getText())){
                    if(textField1.getText().equals(inputEmail)){
                        if(passwordField1.getText().equals(passwordField2.getText())){
                            if(ChkValidate.isPassword(passwordField1.getText())){
                                if(selectedFile !=null){
                                    //UserInfo의 마지막 id값을 구한다.
                                    UserInfoDAO userInfoDAO = new UserInfoDAO();
                                    UserInfo userInfo = null;
                                    long id = 1L;
                                    try{
                                     userInfo = userInfoDAO.findLastId();
                                     System.out.println(userInfo.getId() + " userInfoId.getId()");
                                     id = userInfo.getId() + 1L;
                                    }catch (Exception e2 ){
                                        if(userInfo == null){
                                            System.out.println("userInfo is null");
                                            id = 1L;

                                        }
                                    }

                                    userInfo = new UserInfo();
                                    userInfo.setId(id);
                                    userInfo.setRole("ADMIN");
                                    userInfo.setEmail(inputEmail);
                                    String pw = new String(passwordField1.getPassword());
                                    String hashPW = BCrypt.hashpw(pw, BCrypt.gensalt());
                                    userInfo.setPassword(hashPW);
                                    userInfo.setIsDel("N");


                                    userInfoDAO.insert(userInfo);
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

                                    //AdminGradePermit에 데이터 추가.
                                    AdminGradePermitDAO adminGradePermitDAO = new AdminGradePermitDAO();
                                    AdminGradePermit adminGradePermit = new AdminGradePermit();
                                    adminGradePermit.setIsPermit("N");
                                    adminGradePermit.setUserInfoId(id);
                                    adminGradePermit.setPermitUserId(0L);
                                    adminGradePermit.setTrying(1L);
                                    adminGradePermit.setReUploadFiles(1L);
                                    adminGradePermit.setUuidFile(fileUUID);
                                    adminGradePermit.setFilePath(Util.dataFPath);
                                    adminGradePermit.setOriginFileName(selectedFile.getName());
                                    adminGradePermit.setIsDel("N");
                                    adminGradePermit.setModifiedDate(LocalDateTime.now());
                                    adminGradePermit.setCreatedDate(LocalDateTime.now());
                                    adminGradePermitDAO.insert(adminGradePermit);


                                    JOptionPane.showMessageDialog(null, "회원가입이 완료되었습니다. \nADMIN 확인을 할때까지 기다려주세요. \n문의처, "+Util.contactCompany+"\n메일: "+Util.contactEmail+" 전화: "+Util.contactTel);
                                    dispose();
                                }else{
                                    JOptionPane.showMessageDialog(null, "파일을 선택해주세요.");
                                }

                            }else{
                                JOptionPane.showMessageDialog(null, "비밀번호는 4자 이상이어야 합니다.");
                            }

                        }else{
                            JOptionPane.showMessageDialog(null, "비밀번호가 일치하지 않습니다.");
                        }
                    }else{
                        JOptionPane.showMessageDialog(null, "이메일이 일치하지 않습니다.");
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "인증번호가 일치하지 않습니다.");
                }
            }else{
                JOptionPane.showMessageDialog(null, "이메일 인증을 해주세요.");
            }

        });
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - Hyeonil
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel4;
    private JPanel panel5;
    private JLabel label1;
    private JTextField textField1;
    private JButton button1;
    private JLabel label2;
    private JTextField textField2;
    private JLabel label3;
    private JPasswordField passwordField1;
    private JPasswordField passwordField2;
    private JPanel panel3;
    private JPanel panel6;
    private JLabel label4;
    private JTextField textField3;
    private JButton button2;
    private JLabel label5;
    private JButton button3;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on



    public static void main(String[] args) {
        FlatLightLaf.setup();
        new RegistADMINScreen();

    }
}
