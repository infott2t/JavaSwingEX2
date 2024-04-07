package com.example.demo2.domain;

import com.example.demo2.util.Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDateTime;

@Repository
public class AdminGradePermitDAO {
    String URL;
    String USERNAME;
    String PASSWORD;

    public AdminGradePermitDAO() {
        URL = Util.URL;
        USERNAME = Util.USERNAME;
        PASSWORD = Util.PASSWORD;
    }


    @Autowired
    public DataSource dataSource;

    public void insert(AdminGradePermit AdminPermit) {
        Connection connection = null;
        PreparedStatement statement = null;

        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            String query = "INSERT INTO ADMIN_GRADE_PERMIT (is_permit, user_info_id, permit_user_id, trying, re_upload_files, uuid_file, file_path, origin_file_name, is_del, modified_date, created_date) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            statement = connection.prepareStatement(query);
            statement.setString(1, AdminPermit.getIsPermit());
            statement.setLong(2, AdminPermit.getUserInfoId());
            statement.setLong(3, AdminPermit.getPermitUserId());
            statement.setLong(4, AdminPermit.getTrying());
            statement.setLong(5, AdminPermit.getReUploadFiles());
            statement.setString(6, AdminPermit.getUuidFile());
            statement.setString(7, AdminPermit.getFilePath());
            statement.setString(8, AdminPermit.getOriginFileName());
            statement.setString(9, AdminPermit.getIsDel());
            statement.setObject(10, AdminPermit.getModifiedDate());
            statement.setObject(11, AdminPermit.getCreatedDate());
            statement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            closeQuietly(statement);
            closeQuietly(connection);
        }
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

    public AdminGradePermit findByUserInfoId(Long id) {
        Connection connection = null;
        PreparedStatement statement = null;
        AdminGradePermit adminGradePermit = null;

        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            //is_del = 'N'인 것만 가져오기
            String query = "SELECT * FROM ADMIN_GRADE_PERMIT WHERE USER_INFO_ID = ? AND IS_DEL = 'N'";

            statement = connection.prepareStatement(query);
            statement.setLong(1, id);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                adminGradePermit = new AdminGradePermit();
                adminGradePermit.setAdminGradePermitId(resultSet.getLong("admin_grade_permit_id"));
                adminGradePermit.setIsPermit(resultSet.getString("is_permit"));
                adminGradePermit.setUserInfoId(resultSet.getLong("user_info_id"));
                adminGradePermit.setPermitUserId(resultSet.getLong("permit_user_id"));
                adminGradePermit.setTrying(resultSet.getLong("trying"));
                adminGradePermit.setReUploadFiles(resultSet.getLong("re_upload_files"));
                adminGradePermit.setUuidFile(resultSet.getString("uuid_file"));
                adminGradePermit.setFilePath(resultSet.getString("file_path"));
                adminGradePermit.setOriginFileName(resultSet.getString("origin_file_name"));
                adminGradePermit.setIsDel(resultSet.getString("is_del"));
                adminGradePermit.setModifiedDate(resultSet.getObject("modified_date", LocalDateTime.class));
                adminGradePermit.setCreatedDate(resultSet.getObject("created_date", LocalDateTime.class));
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            closeQuietly(statement);
            closeQuietly(connection);
        }
        return adminGradePermit;
    }

    public AdminGradePermit getAdminGradePermitByUserInfoId(Long id) {
        Connection connection = null;
        PreparedStatement statement = null;
        AdminGradePermit adminGradePermit = null;

        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            //is_del = 'N'인 것만 가져오기
            String query = "SELECT * FROM ADMIN_GRADE_PERMIT WHERE USER_INFO_ID = ? AND IS_DEL = 'N'";
            statement = connection.prepareStatement(query);
            statement.setLong(1, id);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                adminGradePermit = new AdminGradePermit();
                adminGradePermit.setAdminGradePermitId(resultSet.getLong("admin_grade_permit_id"));
                adminGradePermit.setIsPermit(resultSet.getString("is_permit"));
                adminGradePermit.setUserInfoId(resultSet.getLong("user_info_id"));
                adminGradePermit.setPermitUserId(resultSet.getLong("permit_user_id"));
                adminGradePermit.setTrying(resultSet.getLong("trying"));
                adminGradePermit.setReUploadFiles(resultSet.getLong("re_upload_files"));
                adminGradePermit.setUuidFile(resultSet.getString("uuid_file"));
                adminGradePermit.setFilePath(resultSet.getString("file_path"));
                adminGradePermit.setOriginFileName(resultSet.getString("origin_file_name"));
                adminGradePermit.setIsDel(resultSet.getString("is_del"));
                adminGradePermit.setModifiedDate(resultSet.getObject("modified_date", LocalDateTime.class));
                adminGradePermit.setCreatedDate(resultSet.getObject("created_date", LocalDateTime.class));
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            closeQuietly(statement);
            closeQuietly(connection);
        }
        return adminGradePermit;
    }

    public void update(AdminGradePermit adPermit) {
        Connection connection = null;
        PreparedStatement statement = null;

        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            //is_del = 'N'인 것만 가져오기
            String query = "UPDATE ADMIN_GRADE_PERMIT SET IS_PERMIT = ?, TRYING = ?, RE_UPLOAD_FILES = ?, UUID_FILE = ?, FILE_PATH = ?, ORIGIN_FILE_NAME = ?, IS_DEL = ?, MODIFIED_DATE = ? WHERE USER_INFO_ID = ? AND IS_DEL = 'N'";
            statement = connection.prepareStatement(query);
            statement.setString(1, adPermit.getIsPermit());
            statement.setLong(2, adPermit.getTrying());
            statement.setLong(3, adPermit.getReUploadFiles());
            statement.setString(4, adPermit.getUuidFile());
            statement.setString(5, adPermit.getFilePath());
            statement.setString(6, adPermit.getOriginFileName());
            statement.setString(7, adPermit.getIsDel());
            statement.setObject(8, adPermit.getModifiedDate());
            statement.setLong(9, adPermit.getUserInfoId());
            statement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            closeQuietly(statement);
            closeQuietly(connection);
        }
    }
}
