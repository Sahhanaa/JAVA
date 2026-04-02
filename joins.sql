CREATE TABLE orders (order_id INT,customer_id INT,amount INT);
CREATE TABLE customers (customer_id INT,customer_name VARCHAR(50),city VARCHAR(50));
INSERT INTO orders VALUES (101, 1, 6000),(102, 2, 4000),(103, 3, 8000);
INSERT INTO customers VALUES (1, 'Janani', 'Chennai'),(2, 'Karthika', 'Madurai'),
(3, 'Sahhana', 'Coimbatore');
select * from orders;
select * from customers;
SELECT o.order_id, c.customer_name, c.city, o.amount FROM orders o, customers c
WHERE o.customer_id = c.customer_id AND o.amount > 5000;





CREATE TABLE employees (emp_id INT,emp_name VARCHAR(50),dept_id INT,salary INT);
CREATE TABLE departments (dept_id INT,dept_name VARCHAR(50));
INSERT INTO employees VALUES (101, 'Sahhana', 1, 35000),(102, 'Janani', 2, 40000),
(103, 'Karthika', 2, 25000);
INSERT INTO departments VALUES (1, 'HR'),(2, 'IT'),(3, 'Manager');
select * from employees;
select * from departments;
SELECT e.emp_name, d.dept_name, e.salary FROM employees e, departments d
WHERE e.dept_id = d.dept_id AND e.salary > 30000 AND d.dept_name = 'HR';






CREATE TABLE orderss (order_id INT,customer_id INT,amount INT);
INSERT INTO orderss VALUES (1, 101, 3000),(2, 102, 7000),(3, 103, 5000);
select * from orderss;
SELECT order_id, customer_id, amount
FROM orderss WHERE amount > (SELECT AVG(amount) FROM orderss);