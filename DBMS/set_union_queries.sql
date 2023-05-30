select contactFirstName as firstName,contactLastName as lastName from customers
Union
select firstName,lastName from employees;


select contactFirstName as firstName,contactLastName as lastName,"Customer" as contactType  from customers
Union
select firstName,lastName,"Employee" as contactType from employees;

select concat(contactFirstName," ",contactLastName) as fullName,"Customer" as contactType  from customers
Union
select concat(firstName," ",lastName) as fullName,"Employee" as contactType from employees;



select concat(contactFirstName," ",contactLastName) as fullName,"Customer" as contactType  from customers
Union All
select concat(firstName," ",lastName) as fullName,"Employee" as contactType from employees order by fullName;