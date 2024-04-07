package com.example.demo2.screen;

import com.example.demo2.accessingdatajpa.TableView;
import com.example.demo2.domain.UserInfo;
import com.example.demo2.domain.UserInfoDAO;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;


public class UserInfoScreen extends JFrame {

    JPanel jp;
    JTextArea jt;

    JTable table;
    DefaultTableModel tableModel;
    JScrollPane scrollPane;

    static TableView tableView;

    String columnName;



    UserInfo userInfo;


    public UserInfoScreen(String entityName){
        tableView = null;

        setTitle("Entity: "+ entityName);
        setSize(834,300);

        jp = new JPanel();
        jt = new JTextArea(10, 20);
        jt.setText("hello");

        if(entityName.equals("UserInfo")) {
            UserInfoDAO userInfoDAO = new UserInfoDAO();
            UserInfo userInfos = userInfoDAO.findByEmail("tt2t2am1118@gmail.com");
            //List<UserInfo> userInfos = userInfoDAO.findAll();
            jt.setText(userInfos.toString());

            // 테이블 모델 생성
            tableModel = new DefaultTableModel();
            tableModel.addColumn("id");
            tableModel.addColumn("addr");
            tableModel.addColumn("tel");
            tableModel.addColumn("email");
            tableModel.addColumn("password");
            tableModel.addColumn("role");
            tableModel.addColumn("isDel");
            tableModel.addColumn("modifiedDate");
            tableModel.addColumn("createdDate");
            tableModel.addColumn("userId");

            // UserInfo 데이터를 테이블 모델에 추가
            try {
                 //List형인지 체크.
                if(userInfos instanceof List){
                    List<UserInfo> userInfos1 = (List<UserInfo>) userInfos;
                    for (UserInfo userInfo1 : userInfos1) {
                        tableModel.addRow(new Object[]{
                                userInfo1.getId(),
                                userInfo1.getAddr(),
                                userInfo1.getTel(),
                                userInfo1.getEmail(),
                                userInfo1.getPassword(),
                                userInfo1.getRole(),
                                userInfo1.getIsDel(),
                                userInfo1.getModifiedDate(),
                                userInfo1.getCreatedDate(),
                                userInfo1.getUserId()
                        });
                    }
                }else{
                    tableModel.addRow(new Object[]{
                            userInfos.getId(),
                            userInfos.getAddr(),
                            userInfos.getTel(),
                            userInfos.getEmail(),
                            userInfos.getPassword(),
                            userInfos.getRole(),
                            userInfos.getIsDel(),
                            userInfos.getModifiedDate(),
                            userInfos.getCreatedDate(),
                            userInfos.getUserId()
                    });
                }


            }catch(Exception e){

            }
        }
        // JTable 생성 및 설정
        table = new JTable(tableModel);

        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setViewportView(table);
        table.getTableHeader().setResizingAllowed(true);
        table.setPreferredSize(new Dimension(800, 400)); // 테이블 크기 늘림
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

       // jp.add(scrollPane);
        add(scrollPane);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLocation(200, 200);
        this.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                Dimension size = getSize();
              System.out.println("창 크기: " + size.width + " x " + size.height);
            }


        });



        table.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // 마우스 클릭 위치에서 행 인덱스 가져오기
                int row = table.rowAtPoint(e.getPoint());

                // 마우스 클릭 위치에서 칼럼 인덱스 가져오기
                int column = table.columnAtPoint(e.getPoint());
                //선택된 값 초기화
                String valueS=null;
                Long valueL=null;
                //선택된 칼럼 초기화

                // 선택된 값 출력
                if (row != -1 && column != -1) {
                    try {
                        valueS = (String) table.getValueAt(row, column);
                        columnName = table.getColumnName(column);

                        System.out.println("선택된 값: " +valueS);
                        //선택된 칼럼명
                        System.out.println("선택된 칼럼명: " + columnName);

                    }catch(Exception r){
                        valueL = (Long) table.getValueAt(row, column);
                        columnName = table.getColumnName(column);

                        System.out.println("선택된 값: " + valueL);
                        //선택된 칼럼명
                        System.out.println("선택된 칼럼명: " + columnName);
                        //선택된 한 줄의 데이터


                    }
                }

                //if, tableView의 인스턴스가 있을때.

                if(StaticTable.chooseValue==null){
                    if(valueL!=null) {
                        StaticTable.chooseValue = new ChooseValue( valueL, columnName, tableModel, row, entityName);
                    }else{
                        StaticTable.chooseValue = new ChooseValue(valueS, columnName, tableModel, row, entityName);

                    }
                }else {
                    StaticTable.chooseValue.dispose();
                    if(valueL!=null) {
                        StaticTable.chooseValue.set( valueL, columnName, tableModel, row, entityName);
                    }else{
                        StaticTable.chooseValue.set( valueS, columnName, tableModel, row, entityName);
                    }
                }






            }
        });


    }




}
