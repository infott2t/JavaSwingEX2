package com.example.demo2.screen;
import com.example.demo2.domain.UserInfo;
import com.example.demo2.domain.UserInfoDAO;

import java.awt.*;
import java.awt.event.*;
import java.time.LocalDateTime;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class ChooseValue extends JFrame {

    JTextField textField1, textField2;
    JButton button;

    String columnName;


    public ChooseValue( String title, String columnName){
        this.columnName = columnName;
        setTitle(title + " Choose");
        setSize(285, 145);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 레이아웃 설정
        setLayout(new BorderLayout());

        // 텍스트 필드 크기 설정
        textField1 = new JTextField( 20);
        textField2 = new JTextField( 20);
        //textFiled1은 수정 불가
        textField1.setEditable(false);
        JPanel panel = new JPanel();

        // 라벨과 텍스트 필드를 담을 패널
        JPanel panel1 = new JPanel();
        panel1.setLayout(new FlowLayout());
        panel1.add(new JLabel("Col :"));
        panel1.add(textField1);

        JPanel panel2 = new JPanel();
        panel2.setLayout(new FlowLayout());
        panel2.add(new JLabel("Val :"));
        panel2.add(textField2);

        // 패널 크기 설정
        panel.setPreferredSize(new Dimension(200, 50));
        panel.add(panel1, BorderLayout.NORTH);
        panel.add(panel2, BorderLayout.SOUTH);

        //panel2.setPreferredSize(new Dimension(200, 50));
        // 패널 추가
        add(panel, BorderLayout.CENTER);

        // 수정 버튼
        button = new JButton("수정");
        button.setPreferredSize(new Dimension(100, 25));
        add(button, BorderLayout.SOUTH);
        setLocation(1000, 500);

        // 버튼 이벤트 처리
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


            }
        });
    }


    public ChooseValue(Object value, String columnName, DefaultTableModel tableModel, int row, String entityName) {
        this(entityName, columnName);
        this.columnName = columnName;
        textField1.setText(columnName);
        if(value != null){
            textField2.setText(value.toString());
        }else{
            textField2.setText("");
        }

        setVisible(true);

        // 버튼 이벤트 처리
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 현재 선택된 행의 id값.
                Long id = (Long) tableModel.getValueAt(row, 0);
                // 수정된 값
                String newValue = textField2.getText();
                String colName = textField1.getText();
                // 수정된 값을 테이블에 담음.
                if(entityName.equals("UserInfo")){
                    UserInfoDAO userInfoDAO = new UserInfoDAO();
                    UserInfo userInfo = (UserInfo) userInfoDAO.findById(entityName,id);

                    if (colName.equals("addr")) {
                        // addr 컬럼의 값 변경
                        userInfo.setAddr(newValue);
                    } else if (colName.equals("tel")) {
                        // tel 컬럼의 값 변경
                        userInfo.setTel(newValue);
                    } else if (colName.equals("email")) {
                        // email 컬럼의 값 변경
                        userInfo.setEmail(newValue);
                    } else if (colName.equals("password")) {
                        // password 컬럼의 값 변경
                        userInfo.setPassword(newValue);
                    } else if (colName.equals("role")) {
                        // role 컬럼의 값 변경
                        userInfo.setRole(newValue);
                    } else if (colName.equals("isDel")) {
                        // is_del 컬럼의 값 변경
                        userInfo.setIsDel(newValue);
                    } else if (colName.equals("modifiedDate")) {
                        // modified_date 컬럼의 값 변경
                        userInfo.setModifiedDate(LocalDateTime.parse(newValue));
                    } else if (colName.equals("createdDate")) {
                        // created_date 컬럼의 값 변경
                        userInfo.setCreatedDate(LocalDateTime.parse(newValue));
                    }
                    userInfoDAO.update(userInfo);
                    StaticTable.chooseValue.dispose();
                    StaticTable.userInfoScreen.dispose();
                    StaticTable.userInfoScreen = new UserInfoScreen("UserInfo");
                }


            }
        });

    }

    public void set( Object value, String columnName, DefaultTableModel tableModel, int row, String entityName) {
        this.columnName = columnName;

        textField1.setText(columnName);
        if(value != null){
            textField2.setText(value.toString());
        }else{
            textField2.setText("");
        }
        setVisible(true);
    }
}
