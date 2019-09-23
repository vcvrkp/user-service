package com.tnt.user.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "externalactivity")
public class ExternalActivity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;// INT(11) NOT NULL AUTO_INCREMENT,
    
    private String name;// VARCHAR(256) CHARACTER SET 'utf8' NULL DEFAULT NULL,
    
    private String category;// VARCHAR(256) CHARACTER SET 'utf8' NULL DEFAULT NULL,
    
    @Column(name = "startdate")
    private Date startDate;// DATETIME NOT NULL,
    
    @Column(name = "enddate")
    private Date endDate;// DATETIME NOT NULL,
    
    private String location;// VARCHAR(256) CHARACTER SET 'utf8' NULL DEFAULT NULL,
    
    private String organizer;// VARCHAR(256) CHARACTER SET 'utf8' NULL DEFAULT NULL,
    
    private String comments;// VARCHAR(2048) CHARACTER SET 'utf8' NULL DEFAULT NULL,
    
    @Column(name = "ownerid")
    private Integer ownerId;// INT(10) NULL DEFAULT NULL,
    
    @Column(name = "departmentid")
    private Integer departmentId;// INT(10) NULL DEFAULT NULL,
    
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
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the category
     */
    public String getCategory() {
        return category;
    }

    /**
     * @param category the category to set
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * @return the startDate
     */
    public Date getStartDate() {
        return startDate;
    }

    /**
     * @param startDate the startDate to set
     */
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    /**
     * @return the endDate
     */
    public Date getEndDate() {
        return endDate;
    }

    /**
     * @param endDate the endDate to set
     */
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    /**
     * @return the location
     */
    public String getLocation() {
        return location;
    }

    /**
     * @param location the location to set
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * @return the organizer
     */
    public String getOrganizer() {
        return organizer;
    }

    /**
     * @param organizer the organizer to set
     */
    public void setOrganizer(String organizer) {
        this.organizer = organizer;
    }

    /**
     * @return the comments
     */
    public String getComments() {
        return comments;
    }

    /**
     * @param comments the comments to set
     */
    public void setComments(String comments) {
        this.comments = comments;
    }

    /**
     * @return the ownerId
     */
    public Integer getOwnerId() {
        return ownerId;
    }

    /**
     * @param ownerId the ownerId to set
     */
    public void setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
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
        return "ExternalActivity [id=" + id + ", name=" + name + ", category=" + category + ", startDate=" + startDate
                + ", endDate=" + endDate + ", location=" + location + ", organizer=" + organizer + ", comments="
                + comments + ", ownerId=" + ownerId + ", departmentId=" + departmentId + ", insertDate=" + insertDate
                + ", updateDate=" + updateDate + "]";
    }
    
    
}
