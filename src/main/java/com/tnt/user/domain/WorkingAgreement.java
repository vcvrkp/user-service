package com.tnt.user.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="workingagreement")
public class WorkingAgreement {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;// INT(11) NOT NULL AUTO_INCREMENT,

    private String name;// VARCHAR(64) CHARACTER SET 'utf8' NOT NULL,

    @Column(name = "ownerid")
    private Integer ownerId;// INT(11) NULL DEFAULT NULL,

    @Column(name = "departmentid")
    private Integer departmentId;// INT(10) UNSIGNED NULL DEFAULT NULL,

    @Column(name = "insertdate")
    private Date insertDate;// DATETIME NULL DEFAULT NULL,

    @Column(name = "updatedate")
    private Date updateDate;// DATETIME NULL DEFAULT NULL

    private String description;// VARCHAR(2048) CHARACTER SET 'utf8' NOT NULL,
    
    private Integer holidays ;//INT(11) NOT NULL DEFAULT '22',
    
    @Column(name = "yearduration")
    private Integer yearDuration ;//INT(11) NOT NULL,

}
