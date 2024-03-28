-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema Òptica Cul d'Ampolla
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema Òptica Cul d'Ampolla
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `Òptica Cul d'Ampolla` DEFAULT CHARACTER SET utf8 ;
USE `Òptica Cul d'Ampolla` ;

-- -----------------------------------------------------
-- Table `Òptica Cul d'Ampolla`.`address`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Òptica Cul d'Ampolla`.`address` (
  `address_id` INT NOT NULL AUTO_INCREMENT,
  `address_street` VARCHAR(45) NOT NULL,
  `address_num` VARCHAR(45) NOT NULL,
  `address_apt` VARCHAR(45) NULL,
  `address_city` VARCHAR(45) NOT NULL,
  `address_zip` VARCHAR(5) NOT NULL,
  `address_country` VARCHAR(45) NOT NULL,
  `address_phone` VARCHAR(12) NOT NULL,
  PRIMARY KEY (`address_id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Òptica Cul d'Ampolla`.`supplier`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Òptica Cul d'Ampolla`.`supplier` (
  `supplier_id` INT NOT NULL AUTO_INCREMENT,
  `supplier_name` VARCHAR(45) NOT NULL,
  `supplier_fax` VARCHAR(10) NULL,
  `supplier_nif` VARCHAR(9) NOT NULL,
  `address_address_id` INT NOT NULL,
  PRIMARY KEY (`supplier_id`),
  INDEX `fk_supplier_address1_idx` (`address_address_id` ASC) VISIBLE,
  CONSTRAINT `fk_supplier_address1`
    FOREIGN KEY (`address_address_id`)
    REFERENCES `Òptica Cul d'Ampolla`.`address` (`address_id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Òptica Cul d'Ampolla`.`brand`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Òptica Cul d'Ampolla`.`brand` (
  `brand_id` INT NOT NULL AUTO_INCREMENT,
  `brand_name` VARCHAR(45) NOT NULL,
  `supplier_supplier_id` INT NOT NULL,
  PRIMARY KEY (`brand_id`, `supplier_supplier_id`),
  INDEX `fk_brand_supplier1_idx` (`supplier_supplier_id` ASC) VISIBLE,
  CONSTRAINT `fk_brand_supplier1`
    FOREIGN KEY (`supplier_supplier_id`)
    REFERENCES `Òptica Cul d'Ampolla`.`supplier` (`supplier_id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Òptica Cul d'Ampolla`.`glasses`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Òptica Cul d'Ampolla`.`glasses` (
  `glasses_id` INT NOT NULL AUTO_INCREMENT,
  `glasses_prescription_right` FLOAT NOT NULL,
  `glasses_prescription_left` FLOAT NOT NULL,
  `glasses_frame` ENUM('rimless', 'metal', 'plastic') NOT NULL,
  `glasses_framecolor` VARCHAR(45) NOT NULL,
  `glasses_glasscolor` VARCHAR(45) NOT NULL,
  `glasses_price` FLOAT NOT NULL,
  `brand_brand_id` INT NOT NULL,
  PRIMARY KEY (`glasses_id`),
  INDEX `fk_glasses_brand1_idx` (`brand_brand_id` ASC) VISIBLE,
  CONSTRAINT `fk_glasses_brand1`
    FOREIGN KEY (`brand_brand_id`)
    REFERENCES `Òptica Cul d'Ampolla`.`brand` (`brand_id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Òptica Cul d'Ampolla`.`customer`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Òptica Cul d'Ampolla`.`customer` (
  `customer_id` INT NOT NULL AUTO_INCREMENT,
  `customer_firstname` VARCHAR(45) NOT NULL,
  `customer_lastname` VARCHAR(45) NULL,
  `customer_email` VARCHAR(254) NOT NULL,
  `customer_creation` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `address_address_id` INT NOT NULL,
  `customer_referral_id` INT NULL,
  PRIMARY KEY (`customer_id`),
  INDEX `fk_customer_address_idx` (`address_address_id` ASC) VISIBLE,
  INDEX `fk_customer_customer1_idx` (`customer_referral_id` ASC) VISIBLE,
  CONSTRAINT `fk_customer_address`
    FOREIGN KEY (`address_address_id`)
    REFERENCES `Òptica Cul d'Ampolla`.`address` (`address_id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT `fk_customer_customer1`
    FOREIGN KEY (`customer_referral_id`)
    REFERENCES `Òptica Cul d'Ampolla`.`customer` (`customer_id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Òptica Cul d'Ampolla`.`seller`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Òptica Cul d'Ampolla`.`seller` (
  `seller_id` INT NOT NULL AUTO_INCREMENT,
  `seller_name` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`seller_id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Òptica Cul d'Ampolla`.`sale`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Òptica Cul d'Ampolla`.`sale` (
  `sale_id` INT NOT NULL AUTO_INCREMENT,
  `customer_customer_id` INT NOT NULL,
  `seller_seller_id` INT NOT NULL,
  `glasses_glasses_id` INT NOT NULL,
  PRIMARY KEY (`sale_id`, `customer_customer_id`, `seller_seller_id`),
  INDEX `fk_sale_customer1_idx` (`customer_customer_id` ASC) VISIBLE,
  INDEX `fk_sale_seller1_idx` (`seller_seller_id` ASC) VISIBLE,
  INDEX `fk_sale_glasses1_idx` (`glasses_glasses_id` ASC) VISIBLE,
  CONSTRAINT `fk_sale_customer1`
    FOREIGN KEY (`customer_customer_id`)
    REFERENCES `Òptica Cul d'Ampolla`.`customer` (`customer_id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT `fk_sale_seller1`
    FOREIGN KEY (`seller_seller_id`)
    REFERENCES `Òptica Cul d'Ampolla`.`seller` (`seller_id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT `fk_sale_glasses1`
    FOREIGN KEY (`glasses_glasses_id`)
    REFERENCES `Òptica Cul d'Ampolla`.`glasses` (`glasses_id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
