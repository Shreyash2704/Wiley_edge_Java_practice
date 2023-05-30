--connect mysql through shells
--mysql -u root -p

--List database
show databases

--Display all engines in mYSQL.
show engines

--import database and tables from .sql file
source path/filename.sql

--Create Database
use wileyedge;

--Create Table:
Create Table Student(
	Id int,
    LastName varchar(255),
    FirstName varchar(255),
    Semester varchar(255),
    Department varchar(255)
);

--Create rows and insert data
INSERT INTO Student VALUES (1, "Matele", "Shreyash", "7","Computer Engineering");
INSERT INTO Student VALUES (2, "Patil", "Shubham", "6","Electrical Engineering");

--Drop table
Drop Table Student;


--Concat
select concat("Wiley"," ","Edge")

--Return current date time
select now()

--queries--
select orderNumber,orderLineNumber, quantityOrdered*priceEach as Sum from orderdetails order by orderNumber limit 10;

SELECT orderNumber,status
from orders
order by field(
    status,
    "In Process",
    "On Hold",
    "Cancelled",
    "Resolved",
    "Disputed",
    "Shipped"
    );

select lastName,firstName,jobTitle,officeCode
from employees
where jobTitle="Sales Rep" and officeCode=1
order by officeCode,jobTitle;


select customerName,country,state, creditLimit from customers
where country in ("USA","France")  and creditLimit > 10000;