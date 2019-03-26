CREATE DATABASE IF NOT EXISTS employee3;
USE employee3;
CREATE TABLE IF NOT EXISTS department(id INT PRIMARY KEY AUTO_INCREMENT, name VARCHAR(30));
CREATE TABLE IF NOT EXISTS employee(id INT PRIMARY KEY AUTO_INCREMENT,name VARCHAR(30),department_id INT, gender ENUM('M','F'),hire_date DATE,birth_date DATE, FOREIGN KEY(department_id) REFERENCES department(id));
