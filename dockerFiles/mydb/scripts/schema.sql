create database development;
use development;
create table user_info(id INT NOT NULL AUTO_INCREMENT,salutation varchar(100),first_Name varchar(100),last_Name varchar(100),middle_Name varchar(100),PRIMARY KEY (id));
create user 'mathivanan'@'%' identified by 'password';
grant all privileges on *.* to 'mathivanan'@'%';
flush privileges;
