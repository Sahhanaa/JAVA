create table department(dept_id int primary key,dept_name varchar(50),location varchar(50));
create table employee (emp_id int,emp_name varchar(50),age int,salary int,dept_id int,
job_role varchar(50),foreign key (dept_id) references department(dept_id));

insert into department values(10,'HR','Chennai'),(20,'IT','Madurai'),(30,'Finance','Trichy'),
(40,'Sales','Coimbatore');
insert into employee values(101,'arun',23,25000,20,'developer'),(102,'bala',30,40000,10,'recruiter'),
(103,'charan',27,35000,20,'tester'),(104,'divya',35,50000,30,'accountant'),
(105,'eswar',29,28000,40,'sales'),(106,'farhana',26,32000,20,'developer'),
(107,'gokul',31,45000,30,'analyst'),(108,'hari',24,22000,10,'assistant');

select * from employee;
select * from department;

select e.emp_name,d.dept_name from employee e
join department d on e.dept_id=d.dept_id;

select e.emp_name,e.salary,d.location from employee e
join department d on e.dept_id=d.dept_id;

select e.emp_name from employee e
join department d on e.dept_id=d.dept_id where d.dept_name='IT';

select e.emp_name from employee e
join department d on e.dept_id=d.dept_id where d.location='Chennai';

select e.emp_name,e.salary,d.dept_name from employee e
join department d on e.dept_id=d.dept_id where e.salary>30000;

select d.dept_name, count(e.emp_id) as total_employees from department d
join employee e on d.dept_id = e.dept_id group by d.dept_name having count(e.emp_id) > 1;

select d.dept_name, count(e.emp_id) as total_employees from department d
join employee e on d.dept_id = e.dept_id group by d.dept_name;