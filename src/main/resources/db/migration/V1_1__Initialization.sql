CREATE TABLE IF NOT EXISTS `usercategory` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(64) CHARACTER SET 'utf8' NOT NULL,
  `ownerId` INT(11) NULL DEFAULT NULL,
  `departmentId` INT(10) UNSIGNED NULL DEFAULT NULL,
  `insertDate` DATETIME NULL DEFAULT NULL,
  `updateDate` DATETIME NULL DEFAULT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
AUTO_INCREMENT = 5
DEFAULT CHARACTER SET = utf8
COMMENT = 'Se almacenan las categorias';

CREATE TABLE IF NOT EXISTS `role` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(64) CHARACTER SET 'utf8' NOT NULL,
  `ownerId` INT(11) NULL DEFAULT NULL,
  `departmentId` INT(10) UNSIGNED NULL DEFAULT NULL,
  `insertDate` DATETIME NULL DEFAULT NULL,
  `updateDate` DATETIME NULL DEFAULT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
AUTO_INCREMENT = 7
DEFAULT CHARACTER SET = utf8
COMMENT = 'Roles de la aplicacin';

CREATE TABLE IF NOT EXISTS `contracttype` (
  `id` INT(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(128) CHARACTER SET 'utf8' NOT NULL,
  `description` VARCHAR(2048) CHARACTER SET 'utf8' NOT NULL,
  `ownerId` INT(11) NULL DEFAULT NULL,
  `departmentId` INT(10) UNSIGNED NULL DEFAULT NULL,
  `insertDate` DATETIME NULL DEFAULT NULL,
  `updateDate` DATETIME NULL DEFAULT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
AUTO_INCREMENT = 4
DEFAULT CHARACTER SET = utf8;

CREATE TABLE IF NOT EXISTS `workingagreement` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(128) CHARACTER SET 'utf8' NOT NULL,
  `description` VARCHAR(2048) CHARACTER SET 'utf8' NULL DEFAULT NULL,
  `holidays` INT(11) NOT NULL DEFAULT '22',
  `ownerId` INT(11) NULL DEFAULT NULL,
  `departmentId` INT(10) UNSIGNED NULL DEFAULT NULL,
  `insertDate` DATETIME NULL DEFAULT NULL,
  `updateDate` DATETIME NULL DEFAULT NULL,
  `yearDuration` INT(11) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
AUTO_INCREMENT = 2
DEFAULT CHARACTER SET = utf8
COMMENT = 'Convenios laborales';


CREATE TABLE IF NOT EXISTS `user` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `login` VARCHAR(50) CHARACTER SET 'utf8' NOT NULL,
  `password` VARCHAR(50) CHARACTER SET 'utf8' NOT NULL,
  `roleId` INT(11) NOT NULL,
  `active` TINYINT(1) NOT NULL DEFAULT '1' COMMENT 'User activo',
  `name` VARCHAR(200) CHARACTER SET 'utf8' NOT NULL,
  `nif` VARCHAR(16) CHARACTER SET 'utf8' NULL DEFAULT NULL,
  `birthDate` DATE NULL DEFAULT NULL,
  `academicQualification` VARCHAR(200) CHARACTER SET 'utf8' NULL DEFAULT NULL,
  `phone` VARCHAR(12) CHARACTER SET 'utf8' NULL DEFAULT NULL,
  `mobile` VARCHAR(12) CHARACTER SET 'utf8' NULL DEFAULT NULL,
  `street` VARCHAR(100) CHARACTER SET 'utf8' NULL DEFAULT NULL,
  `city` VARCHAR(100) CHARACTER SET 'utf8' NULL DEFAULT NULL,
  `postalCode` VARCHAR(5) CHARACTER SET 'utf8' NULL DEFAULT NULL,
  `provinceId` INT(11) NULL DEFAULT NULL,
  `married` TINYINT(1) NOT NULL COMMENT 'Casado (1) o no (0)',
  `childrenNumber` TINYINT(4) NOT NULL,
  `drivenLicenseType` VARCHAR(10) CHARACTER SET 'utf8' NULL DEFAULT NULL,
  `vehicleType` VARCHAR(50) CHARACTER SET 'utf8' NULL DEFAULT NULL,
  `licensePlate` VARCHAR(45) CHARACTER SET 'utf8' NULL DEFAULT NULL,
  `startDate` DATE NOT NULL COMMENT 'fecha de alta en la empresa',
  `categoryId` INT(11) NOT NULL,
  `socialSecurityNumber` VARCHAR(45) CHARACTER SET 'utf8' NULL DEFAULT NULL,
  `bank` VARCHAR(100) CHARACTER SET 'utf8' NULL DEFAULT NULL,
  `account` VARCHAR(34) CHARACTER SET 'utf8' NULL DEFAULT NULL,
  `travelAvailability` VARCHAR(128) CHARACTER SET 'utf8' NULL DEFAULT NULL COMMENT 'Disponibilidad para viajar',
  `workingInClient` TINYINT(1) NOT NULL COMMENT 'Si esta tabajando en el cliente',
  `email` VARCHAR(128) CHARACTER SET 'utf8' NULL DEFAULT NULL,
  `genre` VARCHAR(16) CHARACTER SET 'utf8' NULL DEFAULT NULL,
  `salary` DECIMAL(10,2) NULL DEFAULT NULL,
  `salaryExtras` DECIMAL(10,2) NULL DEFAULT NULL,
  `securityCard` VARCHAR(64) CHARACTER SET 'utf8' NULL DEFAULT NULL,
  `healthInsurance` VARCHAR(64) CHARACTER SET 'utf8' NULL DEFAULT NULL,
  `notes` VARCHAR(1024) CHARACTER SET 'utf8' NULL DEFAULT NULL,
  `photo` VARCHAR(255) CHARACTER SET 'utf8' NULL DEFAULT NULL,
  `endTestPeriodDate` DATE NULL DEFAULT NULL,
  `endContractDate` DATE NULL DEFAULT NULL,
  `departmentId` INT(10) UNSIGNED NOT NULL DEFAULT '1',
  `contractTypeId` INT(10) UNSIGNED NULL DEFAULT NULL,
  `contractObservations` VARCHAR(2048) CHARACTER SET 'utf8' NULL DEFAULT NULL,
  `insertDate` DATETIME NULL DEFAULT NULL,
  `updateDate` DATETIME NULL DEFAULT NULL,
  `dayDuration` INT(11) NULL DEFAULT NULL,
  `agreementId` INT(11) NOT NULL DEFAULT '1',
  `agreementYearDuration` INT(11) NULL DEFAULT NULL,
  `passwordExpireDate` DATE NULL DEFAULT NULL COMMENT 'Password Expire Date',
  PRIMARY KEY (`id`),
  INDEX `ndx_user_roleId` (`roleId` ASC),
  INDEX `ndx_user_categoryId` (`categoryId` ASC),
  INDEX `ndx_user_departmentId` (`departmentId` ASC),
  INDEX `ndx_user_contractTypeId` (`contractTypeId` ASC),
  INDEX `ndx_user_agreementId` (`agreementId` ASC),
  CONSTRAINT `fk_user_agreementId`
    FOREIGN KEY (`agreementId`)
    REFERENCES `workingagreement` (`id`),
  CONSTRAINT `fk_user_categoryId`
    FOREIGN KEY (`categoryId`)
    REFERENCES `usercategory` (`id`),
  CONSTRAINT `fk_user_contractTypeId`
    FOREIGN KEY (`contractTypeId`)
    REFERENCES `contracttype` (`id`),
   CONSTRAINT `fk_user_roleId`
    FOREIGN KEY (`roleId`)
    REFERENCES `role` (`id`))
ENGINE = InnoDB
AUTO_INCREMENT = 2
DEFAULT CHARACTER SET = utf8;

CREATE TABLE IF NOT EXISTS `externalactivity` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(256) CHARACTER SET 'utf8' NULL DEFAULT NULL,
  `category` VARCHAR(256) CHARACTER SET 'utf8' NULL DEFAULT NULL,
  `startDate` DATETIME NOT NULL,
  `endDate` DATETIME NOT NULL,
  `location` VARCHAR(256) CHARACTER SET 'utf8' NULL DEFAULT NULL,
  `organizer` VARCHAR(256) CHARACTER SET 'utf8' NULL DEFAULT NULL,
  `comments` VARCHAR(2048) CHARACTER SET 'utf8' NULL DEFAULT NULL,
  `ownerId` INT(10) NULL DEFAULT NULL,
  `departmentId` INT(10) NULL DEFAULT NULL,
  `insertDate` DATETIME NULL DEFAULT NULL,
  `updateDate` DATETIME NULL DEFAULT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE TABLE IF NOT EXISTS `activityfile` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `externalActivityId` INT(10) NOT NULL,
  `userId` INT(10) NOT NULL,
  `insertDate` DATETIME NOT NULL,
  `updateDate` DATETIME NULL DEFAULT NULL,
  `file` VARCHAR(400) CHARACTER SET 'utf8' NOT NULL,
  `fileMime` VARCHAR(128) CHARACTER SET 'utf8' NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_activityFile_externalActivity` (`externalActivityId` ASC),
  INDEX `fk_activityFile_user` (`userId` ASC),
  CONSTRAINT `fk_activityFile_externalActivity`
    FOREIGN KEY (`externalActivityId`)
    REFERENCES `externalactivity` (`id`),
  CONSTRAINT `fk_activityFile_user`
    FOREIGN KEY (`userId`)
    REFERENCES `user` (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE TABLE IF NOT EXISTS `entitychange` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `field` VARCHAR(1024) CHARACTER SET 'utf8' NOT NULL,
  `oldValue` VARCHAR(1024) CHARACTER SET 'utf8' NOT NULL,
  `newValue` VARCHAR(1024) CHARACTER SET 'utf8' NOT NULL,
  `userId` INT(10) NULL DEFAULT NULL,
  `insertDate` DATETIME NULL DEFAULT NULL,
  `entityId` INT(11) NOT NULL,
  `entityName` VARCHAR(1024) CHARACTER SET 'utf8' NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_entityChange_user` (`userId` ASC),
  CONSTRAINT `fk_entityChange_user`
    FOREIGN KEY (`userId`)
    REFERENCES `user` (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE TABLE IF NOT EXISTS `idea` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `userId` INT(11) NOT NULL,
  `creationDate` DATETIME NOT NULL,
  `description` VARCHAR(2048) CHARACTER SET 'utf8' NOT NULL,
  `cost` VARCHAR(500) CHARACTER SET 'utf8' NULL DEFAULT NULL,
  `benefits` VARCHAR(2048) CHARACTER SET 'utf8' NULL DEFAULT NULL,
  `name` VARCHAR(300) CHARACTER SET 'utf8' NOT NULL,
  `departmentId` INT(10) UNSIGNED NULL DEFAULT NULL,
  `insertDate` DATETIME NULL DEFAULT NULL,
  `updateDate` DATETIME NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  INDEX `ndx_idea_userId` (`userId` ASC),
  CONSTRAINT `fk_idea_userId`
    FOREIGN KEY (`userId`)
    REFERENCES `user` (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE TABLE IF NOT EXISTS `companystate` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `userId` INT(11) NOT NULL COMMENT 'aplicacin que manda el mail',
  `creationDate` DATETIME NOT NULL,
  `description` LONGTEXT CHARACTER SET 'utf8' NOT NULL,
  `departmentId` INT(10) UNSIGNED NULL DEFAULT NULL,
  `insertDate` DATETIME NULL DEFAULT NULL,
  `updateDate` DATETIME NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  INDEX `ndx_companystate_userId` (`userId` ASC),
  CONSTRAINT `fk_companystate_userId`
    FOREIGN KEY (`userId`)
    REFERENCES `user` (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


CREATE TABLE IF NOT EXISTS `inventory` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `buyDate` DATE NULL DEFAULT NULL,
  `asignedToId` INT(11) NULL DEFAULT NULL,
  `renting` TINYINT(1) NOT NULL DEFAULT '0' COMMENT 'De renting (1) o no (0)',
  `cost` DECIMAL(10,2) NULL DEFAULT NULL,
  `amortizable` TINYINT(1) NOT NULL DEFAULT '0' COMMENT 'Amortizable (1) o no (0)consumible',
  `serialNumber` VARCHAR(30) CHARACTER SET 'utf8' NOT NULL,
  `type` VARCHAR(16) CHARACTER SET 'utf8' NOT NULL,
  `provider` VARCHAR(128) CHARACTER SET 'utf8' NULL DEFAULT NULL,
  `trademark` VARCHAR(128) CHARACTER SET 'utf8' NULL DEFAULT NULL,
  `model` VARCHAR(128) CHARACTER SET 'utf8' NULL DEFAULT NULL,
  `speed` VARCHAR(10) CHARACTER SET 'utf8' NULL DEFAULT NULL,
  `storage` VARCHAR(10) CHARACTER SET 'utf8' NULL DEFAULT NULL,
  `ram` VARCHAR(10) CHARACTER SET 'utf8' NULL DEFAULT NULL,
  `location` VARCHAR(128) CHARACTER SET 'utf8' NULL DEFAULT NULL,
  `description` VARCHAR(256) CHARACTER SET 'utf8' NULL DEFAULT NULL,
  `ownerId` INT(11) NULL DEFAULT NULL,
  `departmentId` INT(10) UNSIGNED NULL DEFAULT NULL,
  `insertDate` DATETIME NULL DEFAULT NULL,
  `updateDate` DATETIME NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  INDEX `ndx_invetory_userId` (`asignedToId` ASC),
  CONSTRAINT `fk_inventory_userId`
    FOREIGN KEY (`asignedToId`)
    REFERENCES `user` (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;