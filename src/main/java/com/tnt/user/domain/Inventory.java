package com.tnt.user.domain;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Inventory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;// INT(11) NOT NULL AUTO_INCREMENT,
    @Column(name = "buydate")
    private Date buyDate;// DATE NULL DEFAULT NULL,
    @Column(name = "asignedtoid")
    private Integer asignedToId;// INT(11) NULL DEFAULT NULL,
    @Column(name = "renting",columnDefinition = "TINYINT", length = 1)
    private boolean renting;// TINYINT(1) NOT NULL DEFAULT '0' COMMENT 'De renting (1) o no (0)',
    @Column(name = "cost")
    private BigDecimal cost;// DECIMAL(10,2) NULL DEFAULT NULL,
    @Column(name = "amortizable",columnDefinition = "TINYINT", length = 1)
    private boolean amortizable;// TINYINT(1) NOT NULL DEFAULT '0' COMMENT 'Amortizable (1) o no (0)consumible',
    @Column(name = "serialnumber")
    private String serialNumber;// VARCHAR(30) CHARACTER SET 'utf8' NOT NULL,
    @Column(name = "type")
    private String type;// VARCHAR(16) CHARACTER SET 'utf8' NOT NULL,
    @Column(name = "provider")
    private String provider;// VARCHAR(128) CHARACTER SET 'utf8' NULL DEFAULT NULL,
    @Column(name = "trademark")
    private String trademark;// VARCHAR(128) CHARACTER SET 'utf8' NULL DEFAULT NULL,
    @Column(name = "model")
    private String model;// VARCHAR(128) CHARACTER SET 'utf8' NULL DEFAULT NULL,
    @Column(name = "speed")
    private String speed;// VARCHAR(10) CHARACTER SET 'utf8' NULL DEFAULT NULL,
    @Column(name = "storage")
    private String storage;// VARCHAR(10) CHARACTER SET 'utf8' NULL DEFAULT NULL,
    @Column(name = "ram")
    private String ram;// VARCHAR(10) CHARACTER SET 'utf8' NULL DEFAULT NULL,
    @Column(name = "location")
    private String location;// VARCHAR(128) CHARACTER SET 'utf8' NULL DEFAULT NULL,
    @Column(name = "description")
    private String description;// VARCHAR(256) CHARACTER SET 'utf8' NULL DEFAULT NULL,
    @Column(name = "ownerid")
    private Integer ownerId;// INT(11) NULL DEFAULT NULL,
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
     * @return the buyDate
     */
    public Date getBuyDate() {
        return buyDate;
    }
    /**
     * @param buyDate the buyDate to set
     */
    public void setBuyDate(Date buyDate) {
        this.buyDate = buyDate;
    }
    /**
     * @return the asignedToId
     */
    public Integer getAsignedToId() {
        return asignedToId;
    }
    /**
     * @param asignedToId the asignedToId to set
     */
    public void setAsignedToId(Integer asignedToId) {
        this.asignedToId = asignedToId;
    }
    /**
     * @return the renting
     */
    public boolean isRenting() {
        return renting;
    }
    /**
     * @param renting the renting to set
     */
    public void setRenting(boolean renting) {
        this.renting = renting;
    }
    /**
     * @return the cost
     */
    public BigDecimal getCost() {
        return cost;
    }
    /**
     * @param cost the cost to set
     */
    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }
    /**
     * @return the amortizable
     */
    public boolean isAmortizable() {
        return amortizable;
    }
    /**
     * @param amortizable the amortizable to set
     */
    public void setAmortizable(boolean amortizable) {
        this.amortizable = amortizable;
    }
    /**
     * @return the serialNumber
     */
    public String getSerialNumber() {
        return serialNumber;
    }
    /**
     * @param serialNumber the serialNumber to set
     */
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
    /**
     * @return the type
     */
    public String getType() {
        return type;
    }
    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }
    /**
     * @return the provider
     */
    public String getProvider() {
        return provider;
    }
    /**
     * @param provider the provider to set
     */
    public void setProvider(String provider) {
        this.provider = provider;
    }
    /**
     * @return the trademark
     */
    public String getTrademark() {
        return trademark;
    }
    /**
     * @param trademark the trademark to set
     */
    public void setTrademark(String trademark) {
        this.trademark = trademark;
    }
    /**
     * @return the model
     */
    public String getModel() {
        return model;
    }
    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }
    /**
     * @return the speed
     */
    public String getSpeed() {
        return speed;
    }
    /**
     * @param speed the speed to set
     */
    public void setSpeed(String speed) {
        this.speed = speed;
    }
    /**
     * @return the storage
     */
    public String getStorage() {
        return storage;
    }
    /**
     * @param storage the storage to set
     */
    public void setStorage(String storage) {
        this.storage = storage;
    }
    /**
     * @return the ram
     */
    public String getRam() {
        return ram;
    }
    /**
     * @param ram the ram to set
     */
    public void setRam(String ram) {
        this.ram = ram;
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
        return "Inventory [id=" + id + ", buyDate=" + buyDate + ", asignedToId=" + asignedToId + ", renting=" + renting
                + ", cost=" + cost + ", amortizable=" + amortizable + ", serialNumber=" + serialNumber + ", type="
                + type + ", provider=" + provider + ", trademark=" + trademark + ", model=" + model + ", speed=" + speed
                + ", storage=" + storage + ", ram=" + ram + ", location=" + location + ", description=" + description
                + ", ownerId=" + ownerId + ", departmentId=" + departmentId + ", insertDate=" + insertDate
                + ", updateDate=" + updateDate + "]";
    }
    
    
}
