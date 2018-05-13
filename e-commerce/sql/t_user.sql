CREATE TABLE `e_commerce`.`t_user` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `username` VARCHAR(45) NOT NULL,
  `password` VARCHAR(45) NOT NULL,
  `first_name` VARCHAR(45) NOT NULL,
  `last_name` VARCHAR(45) NOT NULL,
  `address_street` VARCHAR(45) NOT NULL,
  `address_zip` VARCHAR(45) NOT NULL,
  `address_city` VARCHAR(45) NOT NULL,
  `address_provence` VARCHAR(45) NOT NULL,
  `phone` VARCHAR(45) NULL,
  `email` VARCHAR(45) NOT NULL,
  `role_id` INT NOT NULL,
  `company_id` INT NOT NULL,
  PRIMARY KEY (`id`));