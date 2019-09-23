package com.tnt.user.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="entitychange")
public class EntityChange {
    
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)  
    private Integer id;//INT(11) NOT NULL AUTO_INCREMENT,

    @Column(name = "insertdate") private Date insertDate;//DATETIME NULL DEFAULT NULL,
    
    @Column(name = "field")private String field ;//VARCHAR(1024) CHARACTER SET 'utf8' NOT NULL,
    
    @Column(name = "oldvalue")private String oldValue ;//VARCHAR(1024) CHARACTER SET 'utf8' NOT NULL,
    
    @Column(name = "newvalue")private String newValue ;//VARCHAR(1024) CHARACTER SET 'utf8' NOT NULL,
    
    @Column(name = "userid")private Integer userId ;//INT(10) NULL DEFAULT NULL,
    
    @Column(name = "entityid")private Integer entityId ;//INT(11) NOT NULL,
    
    @Column(name = "entityname")private String entityName ;//VARCHAR(1024) CHARACTER SET 'utf8' NOT NULL,

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
     * @return the field
     */
    public String getField() {
        return field;
    }

    /**
     * @param field the field to set
     */
    public void setField(String field) {
        this.field = field;
    }

    /**
     * @return the oldValue
     */
    public String getOldValue() {
        return oldValue;
    }

    /**
     * @param oldValue the oldValue to set
     */
    public void setOldValue(String oldValue) {
        this.oldValue = oldValue;
    }

    /**
     * @return the newValue
     */
    public String getNewValue() {
        return newValue;
    }

    /**
     * @param newValue the newValue to set
     */
    public void setNewValue(String newValue) {
        this.newValue = newValue;
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
     * @return the entityName
     */
    public String getEntityName() {
        return entityName;
    }

    /**
     * @param entityName the entityName to set
     */
    public void setEntityName(String entityName) {
        this.entityName = entityName;
    }
    
}
