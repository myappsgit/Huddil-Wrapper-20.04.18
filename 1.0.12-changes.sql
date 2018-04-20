use wrapper;

ALTER TABLE `wrapper`.`user_details` 
ADD COLUMN `companyName` VARCHAR(250) NULL AFTER `emailId`;