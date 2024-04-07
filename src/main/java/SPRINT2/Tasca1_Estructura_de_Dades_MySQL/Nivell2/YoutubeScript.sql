-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema youtube
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema youtube
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `youtube` DEFAULT CHARACTER SET utf8 ;
USE `youtube` ;

-- -----------------------------------------------------
-- Table `youtube`.`user`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `youtube`.`user` (
  `user_id` INT NOT NULL AUTO_INCREMENT,
  `email` VARCHAR(45) NOT NULL,
  `password` VARCHAR(45) NOT NULL,
  `name` VARCHAR(45) NOT NULL,
  `birthdate` DATE NOT NULL,
  `gender` ENUM('male', 'female', 'other') NOT NULL,
  `country` VARCHAR(45) NOT NULL,
  `zip` VARCHAR(5) NOT NULL,
  PRIMARY KEY (`user_id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `youtube`.`video`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `youtube`.`video` (
  `video_id` INT NOT NULL AUTO_INCREMENT,
  `title` VARCHAR(45) NOT NULL,
  `description` VARCHAR(100) NOT NULL,
  `size` DOUBLE NOT NULL,
  `file_name` VARCHAR(45) NOT NULL,
  `video_length` TIME NOT NULL,
  `thumbnail` VARCHAR(45) NOT NULL,
  `views` INT NOT NULL,
  `likes` INT NOT NULL,
  `dislikes` INT NOT NULL,
  `status` ENUM('public', 'private', 'hidden') NOT NULL,
  `publication_date` DATETIME NOT NULL,
  `id_user` INT NOT NULL,
  PRIMARY KEY (`video_id`),
  INDEX `fk_video_user1_idx` (`id_user` ASC) VISIBLE,
  CONSTRAINT `fk_video_user1`
    FOREIGN KEY (`id_user`)
    REFERENCES `youtube`.`user` (`user_id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `youtube`.`tag`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `youtube`.`tag` (
  `tag_id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `id_video` INT NOT NULL,
  PRIMARY KEY (`tag_id`),
  INDEX `fk_tag_video_idx` (`id_video` ASC) VISIBLE,
  CONSTRAINT `fk_tag_video`
    FOREIGN KEY (`id_video`)
    REFERENCES `youtube`.`video` (`video_id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `youtube`.`channel`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `youtube`.`channel` (
  `channel_id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `description` VARCHAR(100) NOT NULL,
  `creation_date` DATETIME NOT NULL,
  `id_user` INT NOT NULL,
  PRIMARY KEY (`channel_id`),
  INDEX `fk_channel_user1_idx` (`id_user` ASC) VISIBLE,
  CONSTRAINT `fk_channel_user1`
    FOREIGN KEY (`id_user`)
    REFERENCES `youtube`.`user` (`user_id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `youtube`.`user_subscription`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `youtube`.`user_subscription` (
  `user_subscription_id` INT NOT NULL AUTO_INCREMENT,
  `id_user` INT NOT NULL,
  `id_channel` INT NOT NULL,
  PRIMARY KEY (`user_subscription_id`),
  INDEX `fk_user_subscription_user1_idx` (`id_user` ASC) VISIBLE,
  INDEX `fk_user_subscription_channel1_idx` (`id_channel` ASC) VISIBLE,
  CONSTRAINT `fk_user_subscription_user1`
    FOREIGN KEY (`id_user`)
    REFERENCES `youtube`.`user` (`user_id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT `fk_user_subscription_channel1`
    FOREIGN KEY (`id_channel`)
    REFERENCES `youtube`.`channel` (`channel_id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `youtube`.`video_like_dislike`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `youtube`.`video_like_dislike` (
  `video_like_dislike_id` INT NOT NULL AUTO_INCREMENT,
  `type` ENUM('like', 'dislike') NOT NULL,
  `date_time` DATETIME NOT NULL,
  `id_video` INT NOT NULL,
  `id_user` INT NOT NULL,
  PRIMARY KEY (`video_like_dislike_id`),
  INDEX `fk_like_dislike_video1_idx` (`id_video` ASC) VISIBLE,
  INDEX `fk_like_dislike_user1_idx` (`id_user` ASC) VISIBLE,
  CONSTRAINT `fk_like_dislike_video1`
    FOREIGN KEY (`id_video`)
    REFERENCES `youtube`.`video` (`video_id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT `fk_like_dislike_user1`
    FOREIGN KEY (`id_user`)
    REFERENCES `youtube`.`user` (`user_id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `youtube`.`playlist`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `youtube`.`playlist` (
  `playlist_id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `creation_date` DATETIME NOT NULL,
  `status` ENUM('public', 'private') NOT NULL,
  `id_user` INT NOT NULL,
  PRIMARY KEY (`playlist_id`),
  INDEX `fk_playlist_user1_idx` (`id_user` ASC) VISIBLE,
  CONSTRAINT `fk_playlist_user1`
    FOREIGN KEY (`id_user`)
    REFERENCES `youtube`.`user` (`user_id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `youtube`.`video_has_playlist`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `youtube`.`video_has_playlist` (
  `id_video` INT NOT NULL,
  `id_playlist` INT NOT NULL,
  PRIMARY KEY (`id_video`, `id_playlist`),
  INDEX `fk_video_has_playlist_playlist1_idx` (`id_playlist` ASC) VISIBLE,
  INDEX `fk_video_has_playlist_video1_idx` (`id_video` ASC) VISIBLE,
  CONSTRAINT `fk_video_has_playlist_video1`
    FOREIGN KEY (`id_video`)
    REFERENCES `youtube`.`video` (`video_id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT `fk_video_has_playlist_playlist1`
    FOREIGN KEY (`id_playlist`)
    REFERENCES `youtube`.`playlist` (`playlist_id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `youtube`.`comments`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `youtube`.`comments` (
  `comments_id` INT NOT NULL AUTO_INCREMENT,
  `text` VARCHAR(100) NOT NULL,
  `date_time` DATETIME NOT NULL,
  `id_user` INT NOT NULL,
  `id_video` INT NOT NULL,
  PRIMARY KEY (`comments_id`),
  INDEX `fk_comments_user1_idx` (`id_user` ASC) VISIBLE,
  INDEX `fk_comments_video1_idx` (`id_video` ASC) VISIBLE,
  CONSTRAINT `fk_comments_user1`
    FOREIGN KEY (`id_user`)
    REFERENCES `youtube`.`user` (`user_id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT `fk_comments_video1`
    FOREIGN KEY (`id_video`)
    REFERENCES `youtube`.`video` (`video_id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `youtube`.`comment_like_dislike`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `youtube`.`comment_like_dislike` (
  `comment_like_dislike_id` INT NOT NULL AUTO_INCREMENT,
  `type` ENUM('like', 'dislike') NOT NULL,
  `date_time` DATETIME NOT NULL,
  `id_user` INT NOT NULL,
  `id_comment` INT NOT NULL,
  PRIMARY KEY (`comment_like_dislike_id`),
  INDEX `fk_comment_like_dislike_user1_idx` (`id_user` ASC) VISIBLE,
  INDEX `fk_comment_like_dislike_comments1_idx` (`id_comment` ASC) VISIBLE,
  CONSTRAINT `fk_comment_like_dislike_user1`
    FOREIGN KEY (`id_user`)
    REFERENCES `youtube`.`user` (`user_id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT `fk_comment_like_dislike_comments1`
    FOREIGN KEY (`id_comment`)
    REFERENCES `youtube`.`comments` (`comments_id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
