package com.tnt.user.domain;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;// INT(11) NOT NULL AUTO_INCREMENT,

    private String login;// VARCHAR(50) CHARACTER SET 'utf8' NOT NULL,
    private String password;// VARCHAR(50) CHARACTER SET 'utf8' NOT NULL,

    @Column(name = "roleid")
    private Integer roleId;// INT(11) NOT NULL,
    
    @Column(name="active", columnDefinition = "TINYINT", length = 1)
    private boolean active;// TINYINT(1) NOT NULL DEFAULT '1' COMMENT 'User activo',
    
    private String name;// VARCHAR(200) CHARACTER SET 'utf8' NOT NULL,
    
    private String nif;// VARCHAR(16) CHARACTER SET 'utf8' NULL DEFAULT NULL,
    
    @Column(name = "birthdate")
    private Date birthDate;// DATE NULL DEFAULT NULL,
    
    @Column(name = "academicqualification")
    private String academicQualification;// VARCHAR(200) CHARACTER SET 'utf8' NULL DEFAULT NULL,
    
    private String phone;// VARCHAR(12) CHARACTER SET 'utf8' NULL DEFAULT NULL,
    
    private String mobile;// VARCHAR(12) CHARACTER SET 'utf8' NULL DEFAULT NULL,
    
    private String street;// VARCHAR(100) CHARACTER SET 'utf8' NULL DEFAULT NULL,
    
    private String city;// VARCHAR(100) CHARACTER SET 'utf8' NULL DEFAULT NULL,
    
    @Column(name = "postalcode")
    private String postalCode;// VARCHAR(5) CHARACTER SET 'utf8' NULL DEFAULT NULL,
    
    @Column(name = "provinceid")
    private Integer provinceId;// INT(11) NULL DEFAULT NULL,
    
    @Column(name="married", columnDefinition = "TINYINT", length = 1)
    private boolean married;// TINYINT(1) NOT NULL COMMENT 'Casado (1) o no (0)',
    
    @Column(name = "childrennumber")
    private Integer childrenNumber;// TINYINT(4) NOT NULL,
    
    @Column(name = "drivenlicensetype")
    private String drivenLicenseType;// VARCHAR(10) CHARACTER SET 'utf8' NULL DEFAULT NULL,
    
    @Column(name = "vehicletype")
    private String vehicleType;// VARCHAR(50) CHARACTER SET 'utf8' NULL DEFAULT NULL,
    
    @Column(name = "licenseplate")
    private String licensePlate;// VARCHAR(45) CHARACTER SET 'utf8' NULL DEFAULT NULL,
    
    @Column(name = "startdate")
    private Date startDate;// DATE NOT NULL COMMENT 'fecha de alta en la empresa',
    
    @Column(name = "categoryid")
    private Integer categoryId;// INT(11) NOT NULL,
    
    @Column(name = "socialsecuritynumber")
    private String socialSecurityNumber;// VARCHAR(45) CHARACTER SET 'utf8' NULL DEFAULT NULL,
    
    private String bank;// VARCHAR(100) CHARACTER SET 'utf8' NULL DEFAULT NULL,
    
    private String account;// VARCHAR(34) CHARACTER SET 'utf8' NULL DEFAULT NULL,
    
    @Column(name = "travelavailability")
    private String travelAvailability;// VARCHAR(128) CHARACTER SET 'utf8' NULL DEFAULT NULL COMMENT 'Disponibilidad
                                      // para viajar',
    @Column(name = "workinginclient", columnDefinition = "TINYINT", length = 1)
    private boolean workingInClient;// TINYINT(1) NOT NULL COMMENT 'Si esta tabajando en el cliente',
    
    private String email;// VARCHAR(128) CHARACTER SET 'utf8' NULL DEFAULT NULL,
    
    private String genre;// VARCHAR(16) CHARACTER SET 'utf8' NULL DEFAULT NULL,
    
    private BigDecimal salary;// DECIMAL(10,2) NULL DEFAULT NULL,
    
    @Column(name = "salaryextras")
    private BigDecimal salaryExtras;// DECIMAL(10,2) NULL DEFAULT NULL,
    
    @Column(name = "securitycard")
    private String securityCard;// VARCHAR(64) CHARACTER SET 'utf8' NULL DEFAULT NULL,
    
    @Column(name = "healthinsurance")
    private String healthInsurance;// VARCHAR(64) CHARACTER SET 'utf8' NULL DEFAULT NULL,
    
    private String notes;// VARCHAR(1024) CHARACTER SET 'utf8' NULL DEFAULT NULL,
    
    private String photo;// VARCHAR(255) CHARACTER SET 'utf8' NULL DEFAULT NULL,
    
    @Column(name = "endtestperioddate")
    private Date endTestPeriodDate;// DATE NULL DEFAULT NULL,
    
    @Column(name = "endcontractdate")
    private Date endContractDate;// DATE NULL DEFAULT NULL,
    
    @Column(name = "departmentid")
    private Integer departmentId;// INT(10) UNSIGNED NOT NULL DEFAULT '1',
    
    @Column(name = "contracttypeid")
    private Integer contractTypeId;// INT(10) UNSIGNED NULL DEFAULT NULL,
    
    @Column(name = "contractobservations")
    private String contractObservations;// VARCHAR(2048) CHARACTER SET 'utf8' NULL DEFAULT NULL,
    
    @Column(name = "insertdate")
    private Date insertDate;// DATETIME NULL DEFAULT NULL,
    
    @Column(name = "updatedate")
    private Date updateDate;// DATETIME NULL DEFAULT NULL,
    
    @Column(name = "dayduration")
    private Integer dayDuration;// INT(11) NULL DEFAULT NULL,
    
    @Column(name = "agreementid")
    private Integer agreementId;// INT(11) NOT NULL DEFAULT '1',
    
    @Column(name = "agreementyearduration")
    private Integer agreementYearDuration;// INT(11) NULL DEFAULT NULL,
    
    @Column(name = "passwordexpiredate")
    private Date passwordExpireDate;// DATE NULL DEFAULT NULL COMMENT 'Password Expire Date',
    
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
     * @return the login
     */
    public String getLogin() {
        return login;
    }
    /**
     * @param login the login to set
     */
    public void setLogin(String login) {
        this.login = login;
    }
    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }
    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }
    /**
     * @return the roleId
     */
    public Integer getRoleId() {
        return roleId;
    }
    /**
     * @param roleId the roleId to set
     */
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }
    /**
     * @return the active
     */
    public boolean isActive() {
        return active;
    }
    /**
     * @param active the active to set
     */
    public void setActive(boolean active) {
        this.active = active;
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
     * @return the nif
     */
    public String getNif() {
        return nif;
    }
    /**
     * @param nif the nif to set
     */
    public void setNif(String nif) {
        this.nif = nif;
    }
    /**
     * @return the birthDate
     */
    public Date getBirthDate() {
        return birthDate;
    }
    /**
     * @param birthDate the birthDate to set
     */
    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
    /**
     * @return the academicQualification
     */
    public String getAcademicQualification() {
        return academicQualification;
    }
    /**
     * @param academicQualification the academicQualification to set
     */
    public void setAcademicQualification(String academicQualification) {
        this.academicQualification = academicQualification;
    }
    /**
     * @return the phone
     */
    public String getPhone() {
        return phone;
    }
    /**
     * @param phone the phone to set
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }
    /**
     * @return the mobile
     */
    public String getMobile() {
        return mobile;
    }
    /**
     * @param mobile the mobile to set
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
    /**
     * @return the street
     */
    public String getStreet() {
        return street;
    }
    /**
     * @param street the street to set
     */
    public void setStreet(String street) {
        this.street = street;
    }
    /**
     * @return the city
     */
    public String getCity() {
        return city;
    }
    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }
    /**
     * @return the postalCode
     */
    public String getPostalCode() {
        return postalCode;
    }
    /**
     * @param postalCode the postalCode to set
     */
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
    /**
     * @return the provinceId
     */
    public Integer getProvinceId() {
        return provinceId;
    }
    /**
     * @param provinceId the provinceId to set
     */
    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
    }
    /**
     * @return the married
     */
    public boolean isMarried() {
        return married;
    }
    /**
     * @param married the married to set
     */
    public void setMarried(boolean married) {
        this.married = married;
    }
    /**
     * @return the childrenNumber
     */
    public Integer getChildrenNumber() {
        return childrenNumber;
    }
    /**
     * @param childrenNumber the childrenNumber to set
     */
    public void setChildrenNumber(Integer childrenNumber) {
        this.childrenNumber = childrenNumber;
    }
    /**
     * @return the drivenLicenseType
     */
    public String getDrivenLicenseType() {
        return drivenLicenseType;
    }
    /**
     * @param drivenLicenseType the drivenLicenseType to set
     */
    public void setDrivenLicenseType(String drivenLicenseType) {
        this.drivenLicenseType = drivenLicenseType;
    }
    /**
     * @return the vehicleType
     */
    public String getVehicleType() {
        return vehicleType;
    }
    /**
     * @param vehicleType the vehicleType to set
     */
    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }
    /**
     * @return the licensePlate
     */
    public String getLicensePlate() {
        return licensePlate;
    }
    /**
     * @param licensePlate the licensePlate to set
     */
    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
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
     * @return the categoryId
     */
    public Integer getCategoryId() {
        return categoryId;
    }
    /**
     * @param categoryId the categoryId to set
     */
    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }
    /**
     * @return the socialSecurityNumber
     */
    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }
    /**
     * @param socialSecurityNumber the socialSecurityNumber to set
     */
    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }
    /**
     * @return the bank
     */
    public String getBank() {
        return bank;
    }
    /**
     * @param bank the bank to set
     */
    public void setBank(String bank) {
        this.bank = bank;
    }
    /**
     * @return the account
     */
    public String getAccount() {
        return account;
    }
    /**
     * @param account the account to set
     */
    public void setAccount(String account) {
        this.account = account;
    }
    /**
     * @return the travelAvailability
     */
    public String getTravelAvailability() {
        return travelAvailability;
    }
    /**
     * @param travelAvailability the travelAvailability to set
     */
    public void setTravelAvailability(String travelAvailability) {
        this.travelAvailability = travelAvailability;
    }
    /**
     * @return the workingInClient
     */
    public boolean isWorkingInClient() {
        return workingInClient;
    }
    /**
     * @param workingInClient the workingInClient to set
     */
    public void setWorkingInClient(boolean workingInClient) {
        this.workingInClient = workingInClient;
    }
    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }
    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }
    /**
     * @return the genre
     */
    public String getGenre() {
        return genre;
    }
    /**
     * @param genre the genre to set
     */
    public void setGenre(String genre) {
        this.genre = genre;
    }
    /**
     * @return the salary
     */
    public BigDecimal getSalary() {
        return salary;
    }
    /**
     * @param salary the salary to set
     */
    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }
    /**
     * @return the salaryExtras
     */
    public BigDecimal getSalaryExtras() {
        return salaryExtras;
    }
    /**
     * @param salaryExtras the salaryExtras to set
     */
    public void setSalaryExtras(BigDecimal salaryExtras) {
        this.salaryExtras = salaryExtras;
    }
    /**
     * @return the securityCard
     */
    public String getSecurityCard() {
        return securityCard;
    }
    /**
     * @param securityCard the securityCard to set
     */
    public void setSecurityCard(String securityCard) {
        this.securityCard = securityCard;
    }
    /**
     * @return the healthInsurance
     */
    public String getHealthInsurance() {
        return healthInsurance;
    }
    /**
     * @param healthInsurance the healthInsurance to set
     */
    public void setHealthInsurance(String healthInsurance) {
        this.healthInsurance = healthInsurance;
    }
    /**
     * @return the notes
     */
    public String getNotes() {
        return notes;
    }
    /**
     * @param notes the notes to set
     */
    public void setNotes(String notes) {
        this.notes = notes;
    }
    /**
     * @return the photo
     */
    public String getPhoto() {
        return photo;
    }
    /**
     * @param photo the photo to set
     */
    public void setPhoto(String photo) {
        this.photo = photo;
    }
    /**
     * @return the endTestPeriodDate
     */
    public Date getEndTestPeriodDate() {
        return endTestPeriodDate;
    }
    /**
     * @param endTestPeriodDate the endTestPeriodDate to set
     */
    public void setEndTestPeriodDate(Date endTestPeriodDate) {
        this.endTestPeriodDate = endTestPeriodDate;
    }
    /**
     * @return the endContractDate
     */
    public Date getEndContractDate() {
        return endContractDate;
    }
    /**
     * @param endContractDate the endContractDate to set
     */
    public void setEndContractDate(Date endContractDate) {
        this.endContractDate = endContractDate;
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
     * @return the contractTypeId
     */
    public Integer getContractTypeId() {
        return contractTypeId;
    }
    /**
     * @param contractTypeId the contractTypeId to set
     */
    public void setContractTypeId(Integer contractTypeId) {
        this.contractTypeId = contractTypeId;
    }
    /**
     * @return the contractObservations
     */
    public String getContractObservations() {
        return contractObservations;
    }
    /**
     * @param contractObservations the contractObservations to set
     */
    public void setContractObservations(String contractObservations) {
        this.contractObservations = contractObservations;
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
     * @return the dayDuration
     */
    public Integer getDayDuration() {
        return dayDuration;
    }
    /**
     * @param dayDuration the dayDuration to set
     */
    public void setDayDuration(Integer dayDuration) {
        this.dayDuration = dayDuration;
    }
    /**
     * @return the agreementId
     */
    public Integer getAgreementId() {
        return agreementId;
    }
    /**
     * @param agreementId the agreementId to set
     */
    public void setAgreementId(Integer agreementId) {
        this.agreementId = agreementId;
    }
    /**
     * @return the agreementYearDuration
     */
    public Integer getAgreementYearDuration() {
        return agreementYearDuration;
    }
    /**
     * @param agreementYearDuration the agreementYearDuration to set
     */
    public void setAgreementYearDuration(Integer agreementYearDuration) {
        this.agreementYearDuration = agreementYearDuration;
    }
    /**
     * @return the passwordExpireDate
     */
    public Date getPasswordExpireDate() {
        return passwordExpireDate;
    }
    /**
     * @param passwordExpireDate the passwordExpireDate to set
     */
    public void setPasswordExpireDate(Date passwordExpireDate) {
        this.passwordExpireDate = passwordExpireDate;
    }
    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "User [id=" + id + ", login=" + login + ", password=" + password + ", roleId=" + roleId + ", active="
                + active + ", name=" + name + ", nif=" + nif + ", birthDate=" + birthDate + ", academicQualification="
                + academicQualification + ", phone=" + phone + ", mobile=" + mobile + ", street=" + street + ", city="
                + city + ", postalCode=" + postalCode + ", provinceId=" + provinceId + ", married=" + married
                + ", childrenNumber=" + childrenNumber + ", drivenLicenseType=" + drivenLicenseType + ", vehicleType="
                + vehicleType + ", licensePlate=" + licensePlate + ", startDate=" + startDate + ", categoryId="
                + categoryId + ", socialSecurityNumber=" + socialSecurityNumber + ", bank=" + bank + ", account="
                + account + ", travelAvailability=" + travelAvailability + ", workingInClient=" + workingInClient
                + ", email=" + email + ", genre=" + genre + ", salary=" + salary + ", salaryExtras=" + salaryExtras
                + ", securityCard=" + securityCard + ", healthInsurance=" + healthInsurance + ", notes=" + notes
                + ", photo=" + photo + ", endTestPeriodDate=" + endTestPeriodDate + ", endContractDate="
                + endContractDate + ", departmentId=" + departmentId + ", contractTypeId=" + contractTypeId
                + ", contractObservations=" + contractObservations + ", insertDate=" + insertDate + ", updateDate="
                + updateDate + ", dayDuration=" + dayDuration + ", agreementId=" + agreementId
                + ", agreementYearDuration=" + agreementYearDuration + ", passwordExpireDate=" + passwordExpireDate
                + "]";
    }
    
}
