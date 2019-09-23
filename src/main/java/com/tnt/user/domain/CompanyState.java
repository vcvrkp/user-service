package com.tnt.user.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name = "companystate")
public class CompanyState {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;// INT(11) NOT NULL AUTO_INCREMENT,
    @Column(name = "userid")
    private Integer userId;// INT(11) NOT NULL COMMENT 'aplicacin que manda el mail',
    @Column(name = "creationdate")
    private Date creationDate;// DATETIME NOT NULL,
    
    @Column(name = "description")
    private String description;// VARCHAR(255) CHARACTER SET 'utf8' NOT NULL,
    
    @Column(name = "departmentid")
    private Integer departmentId;// INT(10) UNSIGNED NULL DEFAULT NULL,
    
    @Column(name = "insertdate")
    private Date insertDate;// DATETIME NULL DEFAULT NULL,
    
    @Column(name = "updatedate")
    private Date updateDate;// DATETIME NULL DEFAULT NULL,
    
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
     * @return the creationDate
     */
    public Date getCreationDate() {
        return creationDate;
    }
    /**
     * @param creationDate the creationDate to set
     */
    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }
    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }
    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }
    /**
     * @return the departmentId
     */
    public Integer getDepartmentId() {
        return departmentId;
    }
    /**
     * @param departmentId the departmentId to set
     */
    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
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
    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "CompanyState [id=" + id + ", userId=" + userId + ", creationDate=" + creationDate + ", description="
                + description + ", departmentId=" + departmentId + ", insertDate=" + insertDate + ", updateDate="
                + updateDate + "]";
    }

    
}
