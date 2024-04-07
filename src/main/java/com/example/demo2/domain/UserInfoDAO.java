package com.example.demo2.domain;


import com.example.demo2.util.Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.*;
import java.time.LocalDateTime;
import java.util.List;

@Repository
public class UserInfoDAO {

    String URL;
    String USERNAME;
    String PASSWORD;

    public UserInfoDAO() {
        URL = Util.URL;
        USERNAME = Util.USERNAME;
        PASSWORD = Util.PASSWORD;
    }


    @Autowired
    public DataSource dataSource;

    // 1개의 레코드를 업데이트하는 메소드
    public UserInfo update(UserInfo userInfo) {
        Connection connection = null;
        PreparedStatement statement = null;

        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            //is_del이 N인 것만 조회
            String query = "UPDATE user_info SET addr = ?, tel = ?, email = ?, password = ?, role = ?, is_del = ?, modified_date = ?, created_date = ? WHERE user_info_id = ? AND is_del = 'N'";
            statement = connection.prepareStatement(query);
            statement.setString(1, userInfo.getAddr());
            statement.setString(2, userInfo.getTel());
            statement.setString(3, userInfo.getEmail());
            statement.setString(4, userInfo.getPassword());
            statement.setString(5, userInfo.getRole());
            statement.setString(6, userInfo.getIsDel());
            statement.setObject(7, LocalDateTime.now());
            statement.setObject(8, userInfo.getCreatedDate());
            //statement.setLong(9, userInfo.getUserId());
            statement.setLong(9, userInfo.getId());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeQuietly(statement);
            closeQuietly(connection);

        }

        return userInfo;
    }

    public UserInfo findByEmail(String email) {
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        UserInfo userInfo = null;

        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            //is_del이 N인 것만 조회
            String query = "SELECT * FROM user_info WHERE email = ? AND is_del = 'N'";
            statement = connection.prepareStatement(query);
            statement.setString(1, email);
            resultSet = statement.executeQuery();

            if (resultSet.next()) {
                userInfo = new UserInfo();
                userInfo.setId(resultSet.getLong("user_info_id"));
                userInfo.setAddr(resultSet.getString("addr"));
                userInfo.setTel(resultSet.getString("tel"));
                userInfo.setEmail(resultSet.getString("email"));
                userInfo.setPassword(resultSet.getString("password"));
                userInfo.setRole(resultSet.getString("role"));
                userInfo.setIsDel(resultSet.getString("is_del"));
                userInfo.setModifiedDate((LocalDateTime) resultSet.getObject("modified_date"));
                userInfo.setCreatedDate((LocalDateTime) resultSet.getObject("created_date"));
                userInfo.setUserId(resultSet.getLong("user_id"));

            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeQuietly(resultSet);
            closeQuietly(statement);
            closeQuietly(connection);
        }


        return userInfo;
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

    public Object findById(String entityName, Long id) {
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        Object object = null;
        UserInfo userInfo = null;
        if(entityName.equals("UserInfo")){
            try {
                connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
                String query = "SELECT * FROM user_info WHERE user_info_id = ?";
                statement = connection.prepareStatement(query);
                statement.setLong(1, id);
                resultSet = statement.executeQuery();



                if (resultSet.next()) {
                    userInfo = new UserInfo();
                    userInfo.setId(resultSet.getLong("user_info_id"));
                    userInfo.setAddr(resultSet.getString("addr"));
                    userInfo.setTel(resultSet.getString("tel"));
                    userInfo.setEmail(resultSet.getString("email"));
                    userInfo.setPassword(resultSet.getString("password"));
                    userInfo.setRole(resultSet.getString("role"));
                    userInfo.setIsDel(resultSet.getString("is_del"));
                    userInfo.setModifiedDate((LocalDateTime) resultSet.getObject("modified_date"));
                    userInfo.setCreatedDate((LocalDateTime) resultSet.getObject("created_date"));
                    userInfo.setUserId(resultSet.getLong("user_id"));

                }
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                closeQuietly(resultSet);
                closeQuietly(statement);
                closeQuietly(connection);
            }
            object = userInfo;
        }
        return object;
    }

    public List<UserInfo> findAll() {
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        List<UserInfo> userInfos = null;

        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            String query = "SELECT * FROM user_info";
            statement = connection.prepareStatement(query);
            resultSet = statement.executeQuery();

            while (resultSet.next()) {
                UserInfo userInfo = new UserInfo();
                userInfo.setId(resultSet.getLong("user_info_id"));
                userInfo.setAddr(resultSet.getString("addr"));
                userInfo.setTel(resultSet.getString("tel"));
                userInfo.setEmail(resultSet.getString("email"));
                userInfo.setPassword(resultSet.getString("password"));
                userInfo.setRole(resultSet.getString("role"));
                userInfo.setIsDel(resultSet.getString("is_del"));
                userInfo.setModifiedDate((LocalDateTime) resultSet.getObject("modified_date"));
                userInfo.setCreatedDate((LocalDateTime) resultSet.getObject("created_date"));
                userInfo.setUserId(resultSet.getLong("user_id"));
                userInfos.add(userInfo);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeQuietly(resultSet);
            closeQuietly(statement);
            closeQuietly(connection);
        }

        return userInfos;
    }


    public void insert(UserInfo userInfo) {
        Connection connection = null;
        PreparedStatement statement = null;

        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            String query = "INSERT INTO user_info (email, password, role, is_del, modified_date, created_date, user_info_id) VALUES (?, ?, ?, ?, ?, ?, ?)";
            statement = connection.prepareStatement(query);
            statement.setString(1, userInfo.getEmail());
            statement.setString(2, userInfo.getPassword());
            statement.setString(3, userInfo.getRole());
            statement.setString(4, userInfo.getIsDel());
            statement.setTimestamp(5, Timestamp.valueOf(LocalDateTime.now()));
            statement.setTimestamp(6, Timestamp.valueOf(LocalDateTime.now()));
            statement.setLong(7, userInfo.getId());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeQuietly(statement);
            closeQuietly(connection);
        }
    }

    public UserInfo findLastId() {
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        UserInfo userInfo = null;

        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            String query = "SELECT * FROM user_info ORDER BY user_info_id DESC LIMIT 1";
            statement = connection.prepareStatement(query);
            resultSet = statement.executeQuery();

            if (resultSet.next()) {
                userInfo = new UserInfo();
                userInfo.setId(resultSet.getLong("user_info_id"));
                userInfo.setAddr(resultSet.getString("addr"));
                userInfo.setTel(resultSet.getString("tel"));
                userInfo.setEmail(resultSet.getString("email"));
                userInfo.setPassword(resultSet.getString("password"));
                userInfo.setRole(resultSet.getString("role"));
                userInfo.setIsDel(resultSet.getString("is_del"));
                userInfo.setModifiedDate((LocalDateTime) resultSet.getObject("modified_date"));
                userInfo.setCreatedDate((LocalDateTime) resultSet.getObject("created_date"));
                userInfo.setUserId(resultSet.getLong("user_id"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeQuietly(resultSet);
            closeQuietly(statement);
            closeQuietly(connection);
        }
        return userInfo;
    }
}
