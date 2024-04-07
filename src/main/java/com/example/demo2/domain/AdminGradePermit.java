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
