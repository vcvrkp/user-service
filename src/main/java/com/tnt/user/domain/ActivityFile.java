package com.tnt.user.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "activityfile")
public class ActivityFile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;// INT(11) NOT NULL AUTO_INCREMENT,
    @Column(name = "insertdate")
    private Date insertDate;// DATETIME NOT NULL,
    @Column(name = "updatedate")
    private Date updateDate;// DATETIME NULL DEFAULT NULL,
    @Column(name = "externalactivityid")
    private Integer externalActivityId;// INT(10) NOT NULL,
    @Column(name = "userid")
    private Integer userId;// INT(10) NOT NULL,
    private String file;// VARCHAR(400) CHARACTER SET 'utf8' NOT NULL,
    @Column(name = "filemime")
    private String fileMime;// VARCHAR(128) CHARACTER SET 'utf8' NULL DEFAULT NULL,
    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }
    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
     * @return the insertDate
     */
    public Date getInsertDate() {
        return insertDate;
    }
    /**
     * @param insertDate the insertDate to set
     */
    public void setInsertDate(Date insertDate) {
        this.insertDate = insertDate;
    }
    /**
     * @return the updateDate
     */
    public Date getUpdateDate() {
        return updateDate;
    }
    /**
     * @param updateDate the updateDate to set
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
    /**
     * @return the externalActivityId
     */
    public Integer getExternalActivityId() {
        return externalActivityId;
    }
    /**
     * @param externalActivityId the externalActivityId to set
     */
    public void setExternalActivityId(Integer externalActivityId) {
        this.externalActivityId = externalActivityId;
    }
    /**
     * @return the userId
     */
    public Integer getUserId() {
        return userId;
    }
    /**
     * @param userId the userId to set
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }
    /**
     * @return the file
     */
    public String getFile() {
        return file;
    }
    /**
     * @param file the file to set
     */
    public void setFile(String file) {
        this.file = file;
    }
    /**
     * @return the fileMime
     */
    public String getFileMime() {
        return fileMime;
    }
    /**
     * @param fileMime the fileMime to set
     */
    public void setFileMime(String fileMime) {
        this.fileMime = fileMime;
    }
    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "ActivityFile [id=" + id + ", insertDate=" + insertDate + ", updateDate=" + updateDate
                + ", externalActivityId=" + externalActivityId + ", userId=" + userId + ", file=" + file + ", fileMime="
                + fileMime + "]";
    }
   
    
    

}
