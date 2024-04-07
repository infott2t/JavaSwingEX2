package com.example.demo2.domain;

import com.example.demo2.util.Util;
import com.github.lgooddatepicker.components.DateTimePicker;

import java.sql.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TableSearchDAO {

    String URL;
    String USERNAME;
    String PASSWORD;

    public TableSearchDAO() {
        URL = Util.URL;
        USERNAME = Util.USERNAME;
        PASSWORD = Util.PASSWORD;
    }

    //테이블의 칼럼들을 불러오는 메소드
    public String[] getTableColumns(String tableName) {
        String[] columns = null;
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            String query = "SELECT * FROM " + tableName + " WHERE 1 = 0";
            statement = connection.prepareStatement(query);
            resultSet = statement.executeQuery();

            ResultSetMetaData metaData = resultSet.getMetaData();
            int columnCount = metaData.getColumnCount();
            columns = new String[columnCount];

            for (int i = 1; i <= columnCount; i++) {
                columns[i - 1] = metaData.getColumnName(i);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // resultSet, statement, connection을 닫아야 합니다.
            // 이 작업은 try-with-resources를 사용하거나 별도의 메소드를 만들어 수행할 수 있습니다.
            closeQuietly(statement);
            closeQuietly(connection);
        }



        return columns;
    }

    private void closeQuietly(AutoCloseable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception e) {
                // 예외를 무시하거나 로깅
            }
        }
    }



    public List<Map<String, Object>> searchEntityByCreatedDate(String entityName, String[] columns, DateTimePicker datePicker, DateTimePicker datePicker1) {
        List<Map<String, Object>> entities = new ArrayList<>();
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        LocalDateTime dateValue1, dateValue2;
        String query = "";
        String statementValue = "";

        // if() codes. datePicker, datePicker1.
        if(datePicker.getDateTimePermissive()==null || datePicker.getDateTimePermissive().toString().isEmpty() || datePicker.getDateTimePermissive().toString().isBlank() ){
            dateValue1 = null;

            if(datePicker1.getDateTimePermissive()==null || datePicker1.getDateTimePermissive().toString().isEmpty() || datePicker1.getDateTimePermissive().toString().isBlank() ) {
                dateValue2 = null;
                query = "SELECT * FROM " + entityName;
                statementValue = "1";
            }else{
                dateValue2 = datePicker1.getDateTimePermissive();
                query = "SELECT * FROM " + entityName + " WHERE created_date <= ?";
                statementValue = "2";
            }

        }else{
            dateValue1 = datePicker.getDateTimePermissive();

            if(datePicker1.getDateTimePermissive()==null || datePicker1.getDateTimePermissive().toString().isEmpty() || datePicker1.getDateTimePermissive().toString().isBlank() ) {
                dateValue2 = null;
                query = "SELECT * FROM " + entityName + " WHERE created_date >= ?";
                statementValue = "3";
            }else{
                dateValue2 = datePicker1.getDateTimePermissive();
                query = "SELECT * FROM " + entityName + " WHERE created_date BETWEEN ? AND ?";
                statementValue = "4";
            }
        }

        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);

            //String query = "SELECT * FROM " + entityName + " WHERE created_date BETWEEN ? AND ?";
            statement = connection.prepareStatement(query);

            if(statementValue.equals("1")) {
                //do nothing
            }else if(statementValue.equals("2")) {
                statement.setObject(1, dateValue2);
            }else if(statementValue.equals("3")) {
                statement.setObject(1, dateValue1);
            }else if(statementValue.equals("4")) {
                statement.setObject(1, dateValue1);
                statement.setObject(2, dateValue2);
            }

            //statement.setObject(1, datePicker.getDate());
            //statement.setObject(2, datePicker1.getDate());

            resultSet = statement.executeQuery();

            while (resultSet.next()) {
                Map<String, Object> entity = new HashMap<>();
                for (String column : columns) {
                    entity.put(column, resultSet.getObject(column));
                }
                entities.add(entity);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            closeQuietly(resultSet);
            closeQuietly(statement);
            closeQuietly(connection);
        }

        for (Map<String, Object> entity : entities) {
            for (Map.Entry<String, Object> entry : entity.entrySet()) {
                System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
            }
        }

        if(entities == null){
            System.out.println("entities is null");
        }

        return entities;

    }


}
