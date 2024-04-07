package com.example.demo2.accessingdatajpa;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class TableView extends JFrame {

    public Long valueL;
    public String valueS;
    public String columnName;
    public DefaultTableModel tableModel;
    public int row;
    public String entityName;
    JPanel jp;
    JTextArea jt;
    JScrollPane jscrollPane;


    public TableView() {

    }


    public TableView(Object value, String columnName, DefaultTableModel tableModel, int row, String entityName) {


        // value가 Long, String 타입인 경우
        if(value instanceof Long){
            this.valueL = (Long) value;
        }else if(value instanceof String){
            this.valueS = (String) value;
        }
        jp = new JPanel();
        jt = new JTextArea(10, 20);

        jscrollPane = new JScrollPane(jt);
        jscrollPane.setPreferredSize(new Dimension(400, 200));
        this.columnName = columnName;
        this.tableModel = tableModel;
        this.row = row;
        this.entityName = entityName;

        setTitle("Entity: "+ entityName);
        setSize(450,250);

        //jtextArea에 선택된 값 출력, 다음에 한줄 데이터 출력. row를 이용.
        jt.setText("선택된 값:\n " + value + "\n\n");

        //jt.setText("선택된 줄:" + )


        jp.add(jt);
        add(jp);
        setVisible(true);


    }

    public void set(Object value, String columnName, DefaultTableModel tableModel, int row, String entityName) {

        // value가 Long, String 타입인 경우
        if(value instanceof Long){
            this.valueL = (Long) value;
        }else if(value instanceof String){
            this.valueS = (String) value;
        }

        this.columnName = columnName;
        this.tableModel = tableModel;
        this.row = row;
        this.entityName = entityName;

        jt.setText("선택된 값: " + value + "\n\n");
    }
}
