package com.example.demo2.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name="ADMIN_GRADE_PERMIT")
public class AdminGradePermit {

    private Long adminGradePermitId;

    private String isPermit;
    private Long userInfoId;
    private Long permitUserId;
    private Long trying;
    private Long reUploadFiles;
    private String uuidFile;
    private String filePath;
    private String originFileName;
    private String isDel;
    private LocalDateTime modifiedDate;
    private LocalDateTime createdDate;

}


/**
 * MySQL Table create.
 * CREATE TABLE `example0`.`admin_grade_permit` (
 *   `admin_grade_permit_id` BIGINT NOT NULL AUTO_INCREMENT,
 *   `is_permit` VARCHAR(45) NULL,
 *   `user_info_id` BIGINT NULL,
 *   `permit_user_id` BIGINT NULL,
 *   `trying` BIGINT NULL,
 *   `re_upload_files` BIGINT NULL,
 *   `uuid_file` VARCHAR(200) NULL,
 *   `file_path` VARCHAR(255) NULL,
 *   `origin_file_name` VARCHAR(100) NULL,
 *   `is_del` VARCHAR(45) NULL,
 *   `modified_date` DATETIME(6) NULL,
 *   `created_date` DATETIME(6) NULL,
 *   PRIMARY KEY (`admin_grade_permit_id`))
 * ENGINE = InnoDB
 * DEFAULT CHARACTER SET = utf8mb4
 * COLLATE = utf8mb4_0900_ai_ci;
 *
 * */
