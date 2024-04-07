package com.example.demo2.screen;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class EntitiesScreen extends JFrame {

    DefaultTableModel tableModel;
    JTable table;

    public EntitiesScreen() {
        setTitle("Entities");
        setSize(400, 200);
        //setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        setLocation(300, 300);

        tableModel = new DefaultTableModel();
        tableModel.addColumn("Entity Name");
        tableModel.addColumn("classify");
        tableModel.addColumn("access role");

        tableModel.addRow(new Object[]{"user","유저", "ADMIN"});
        tableModel.addRow(new Object[]{"user_info", "유저 상세정보", "ADMIN"});

        table = new JTable(tableModel);

        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setViewportView(table);
        table.getTableHeader().setResizingAllowed(true);
        table.setPreferredSize(new Dimension(400, 100)); // 테이블 크기 늘림
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

        add(scrollPane);
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLocation(200, 200);

        table.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // 마우스 클릭 위치에서 행 인덱스 가져오기
                int row = table.rowAtPoint(e.getPoint());

                // 마우스 클릭 위치에서 칼럼 인덱스 가져오기
                int column = table.columnAtPoint(e.getPoint());
                //선택된 값 초기화
                String valueS = null;
                Long valueL = null;
                String columnName;
                //선택된 칼럼 초기화

                // 선택된 값 출력
                if (row != -1 && column != -1) {
                    try {
                        valueS = (String) table.getValueAt(row, column);
                        columnName = table.getColumnName(column);

                        System.out.println("선택된 값: " + valueS);
                        //선택된 칼럼명
                        System.out.println("선택된 칼럼명: " + columnName);
                        System.out.println("선택된 한 줄의 데이터: " + tableModel.getDataVector().elementAt(row));
                        System.out.println("선택된 한 줄의 데이터 엔티티: " + tableModel.getDataVector().elementAt(row).get(0));
                        String entityName = tableModel.getDataVector().elementAt(row).get(0).toString();



                        if(StaticTable.entitySearchScreen ==null){
                            StaticTable.entitySearchScreen = new EntitySearchScreen(entityName);
                        }else{
                            StaticTable.entitySearchScreen.dispose();
                            StaticTable.entitySearchScreen = new EntitySearchScreen(entityName);
                        }
                    } catch (Exception r) {
                        valueL = (Long) table.getValueAt(row, column);
                        columnName = table.getColumnName(column);

                        System.out.println("선택된 값: " + valueL);
                        //선택된 칼럼명
                        System.out.println("선택된 칼럼명: " + columnName);
                        //선택된 한 줄의 데이터
                        System.out.println("선택된 한 줄의 데이터: " + tableModel.getDataVector().elementAt(row));
                        System.out.println("선택된 한 줄의 데이터 엔티티: " + tableModel.getDataVector().elementAt(row).get(0));
                        String entityName = tableModel.getDataVector().elementAt(row).get(0).toString();

                        if(StaticTable.entitySearchScreen ==null){
                            StaticTable.entitySearchScreen = new EntitySearchScreen(entityName);
                        }else{
                            StaticTable.entitySearchScreen.dispose();
                            StaticTable.entitySearchScreen = new EntitySearchScreen(entityName);
                        }
                    }
                }
            }
        });


    }
}
