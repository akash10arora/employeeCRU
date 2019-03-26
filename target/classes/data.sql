INSERT INTO department (name) SELECT 'tech' WHERE NOT EXISTS (SELECT * FROM department where name = 'tech');
INSERT INTO department (name) SELECT 'product' WHERE NOT EXISTS (SELECT * FROM department where name = 'product');
INSERT INTO department (name) SELECT 'finance' WHERE NOT EXISTS (SELECT * FROM department where name = 'finance');
INSERT INTO department (name) SELECT 'security' WHERE NOT EXISTS (SELECT * FROM department where name = 'security');
INSERT INTO department (name) SELECT 'design' WHERE NOT EXISTS (SELECT * FROM department where name = 'design');

--INSERT INTO employee(name, department_id, gender, hire_date, birth_date) VALUES('Akash ', 1, 'M', '2018-05-07 00:00:00', '1992-03-13 00:00:00');
--INSERT INTO employee(name, department_id, gender, hire_date, birth_date) VALUES('Raj ', 1, 'M', '2018-05-11 00:00:00', '1995-02-13 00:00:00');
--INSERT INTO employee(name, department_id, gender, hire_date, birth_date) VALUES('Rohit ', 1, 'M', '2018-05-21 00:00:00', '1995-06-13 00:00:00');
--INSERT INTO employee(name, department_id, gender, hire_date, birth_date) VALUES('Ramesh ', 2, 'M', '2018-05-21 00:00:00', '1995-06-13 00:00:00');

