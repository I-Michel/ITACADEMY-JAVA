-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema Pizzeria
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema Pizzeria
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `Pizzeria` DEFAULT CHARACTER SET utf8 ;
USE `Pizzeria` ;

-- -----------------------------------------------------
-- Table `Pizzeria`.`states`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Pizzeria`.`states` (
  `id_state` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id_state`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Pizzeria`.`cities`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Pizzeria`.`cities` (
  `id_city` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `state_id` INT NOT NULL,
  PRIMARY KEY (`id_city`),
  INDEX `fk_cities_states_idx` (`state_id` ASC) VISIBLE,
  CONSTRAINT `fk_cities_states`
    FOREIGN KEY (`state_id`)
    REFERENCES `Pizzeria`.`states` (`id_state`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Pizzeria`.`customers`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Pizzeria`.`customers` (
  `id_customer` INT NOT NULL AUTO_INCREMENT,
  `first_name` VARCHAR(45) NOT NULL,
  `last_name` VARCHAR(45) NOT NULL,
  `address` TEXT NOT NULL,
  `zip` VARCHAR(5) NOT NULL,
  `phone` VARCHAR(10) NOT NULL,
  `city_id` INT NOT NULL,
  PRIMARY KEY (`id_customer`),
  INDEX `fk_customers_cities1_idx` (`city_id` ASC) VISIBLE,
  CONSTRAINT `fk_customers_cities1`
    FOREIGN KEY (`city_id`)
    REFERENCES `Pizzeria`.`cities` (`id_city`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Pizzeria`.`shops`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Pizzeria`.`shops` (
  `id_shop` INT NOT NULL AUTO_INCREMENT,
  `address` TEXT NOT NULL,
  `zip` VARCHAR(5) NOT NULL,
  `city_id` INT NOT NULL,
  PRIMARY KEY (`id_shop`),
  INDEX `fk_shops_cities1_idx` (`city_id` ASC) VISIBLE,
  CONSTRAINT `fk_shops_cities1`
    FOREIGN KEY (`city_id`)
    REFERENCES `Pizzeria`.`cities` (`id_city`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Pizzeria`.`employees`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Pizzeria`.`employees` (
  `id_employee` INT NOT NULL AUTO_INCREMENT,
  `first_name` VARCHAR(45) NOT NULL,
  `last_name` VARCHAR(45) NOT NULL,
  `nif` VARCHAR(10) NOT NULL,
  `phone` VARCHAR(10) NOT NULL,
  `job` ENUM('cook', 'delivery') NOT NULL,
  `shop_id` INT NOT NULL,
  PRIMARY KEY (`id_employee`),
  INDEX `fk_employees_shops1_idx` (`shop_id` ASC) VISIBLE,
  CONSTRAINT `fk_employees_shops1`
    FOREIGN KEY (`shop_id`)
    REFERENCES `Pizzeria`.`shops` (`id_shop`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Pizzeria`.`orders`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Pizzeria`.`orders` (
  `id_order` INT NOT NULL AUTO_INCREMENT,
  `date` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `method` ENUM('take away', 'delivery') NOT NULL,
  `pizza_qty` INT NOT NULL,
  `burger_qty` INT NOT NULL,
  `drink_qty` INT NOT NULL,
  `total_price` FLOAT NOT NULL,
  `customers_id` INT NOT NULL,
  `shops_id` INT NOT NULL,
  `delivery_employee_id` INT NULL,
  `delivery_date` DATETIME NULL,
  PRIMARY KEY (`id_order`),
  INDEX `fk_orders_customers1_idx` (`customers_id` ASC) VISIBLE,
  INDEX `fk_orders_shops1_idx` (`shops_id` ASC) VISIBLE,
  INDEX `fk_orders_employees1_idx` (`delivery_employee_id` ASC) VISIBLE,
  CONSTRAINT `fk_orders_customers1`
    FOREIGN KEY (`customers_id`)
    REFERENCES `Pizzeria`.`customers` (`id_customer`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT `fk_orders_shops1`
    FOREIGN KEY (`shops_id`)
    REFERENCES `Pizzeria`.`shops` (`id_shop`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT `fk_orders_employees1`
    FOREIGN KEY (`delivery_employee_id`)
    REFERENCES `Pizzeria`.`employees` (`id_employee`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Pizzeria`.`categories`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Pizzeria`.`categories` (
  `id_category` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id_category`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Pizzeria`.`products`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Pizzeria`.`products` (
  `id_product` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `description` VARCHAR(45) NULL,
  `picture` VARCHAR(30) NULL,
  `price` FLOAT NOT NULL,
  `type` ENUM('pizza', 'burger', 'drink') NOT NULL,
  `category_id` INT NULL,
  PRIMARY KEY (`id_product`),
  INDEX `fk_products_category1_idx` (`category_id` ASC) VISIBLE,
  CONSTRAINT `fk_products_category1`
    FOREIGN KEY (`category_id`)
    REFERENCES `Pizzeria`.`categories` (`id_category`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Pizzeria`.`order_details`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Pizzeria`.`order_details` (
  `id_order_detail` INT NOT NULL,
  `order_id` INT NOT NULL,
  `product_id` INT NOT NULL,
  PRIMARY KEY (`id_order_detail`, `order_id`),
  INDEX `fk_order_detail_products1_idx` (`product_id` ASC) VISIBLE,
  CONSTRAINT `fk_order_detail_orders1`
    FOREIGN KEY (`order_id`)
    REFERENCES `Pizzeria`.`orders` (`id_order`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT `fk_order_detail_products1`
    FOREIGN KEY (`product_id`)
    REFERENCES `Pizzeria`.`products` (`id_product`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
