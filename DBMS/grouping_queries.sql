
--syntax for group by
select 
    c1,c2,c3,...,cn,aggregate_function(ci)
from 
   TABLE_NAme
WHERE
    where_condition
Group By c1,c2,c3...cn. 

--group by year
select Year(orderDate),sum(quantityOrdered*priceEach) as Sales from orders inner join orderDetails group by Year(orderDate);

select Year(orderDate),count(orders.orderNumber) from orders group by Year(orderDate);

select status,count(*) from orders inner join orderDetails group by status;

--having clause is used in select statement to specify 
--filter condition for group of agrregation function

select orderNumber,sum(quantityOrdered),sum(quantityordered*priceEach) as totalSum from orderDetails group by orderNumber having sum(quantityOrdered)>600 and totalSum>1000;

select orders.orderNumber,status, sum(quantityOrdered*priceEach) as totalSum from orderDetails inner join orders on orderDetails.orderNumber=orders.orderNumber  group by orderNumber,status having status="Shipped" and totalSum>35000;

--Create a new table using pervous 3 tables
Create Table Sales
 Select productline,
 Year(orderDate) orderYear,
 SUM(priceEach*quantityOrdered) as orderValue
 from orderDetails
 Inner Join orders using(orderNumber)
 Inner Join products using (productCode)
 Group by
 productline,orderYear;


 Select 
 productline,
 sum(orderValue) totalOrderValue
 from sales
 group by productline;


--Get Total sales for each product and Total sales

--using union all and group by lead to complex query
 SELECT
    productline,
    SUM(orderValue) totalOrderValue
From sales
Group by 
    productline
Union all 
select Null,sum(orderValue) totalOrderValue
from sales;

--Mysql Roll Up is used to hgenerate subtotal and grand total
--as done above 
--easy query and increase performance
 SELECT
    productline,
    SUM(orderValue) totalOrderValue
From sales
Group by 
    productline with ROLLUP;

-- Group by c1,c2,c3 with ROllup
-- c1>c2>c3

--Generate these grouping sets
-- c1>c2>c3
--c1>c2
--c1


SELECT
    productline,
    orderYear,
    SUM(orderValue) totalOrderValue
From sales
Group by 
    orderYear,
    productline
    with ROLLUP;

--to check whetjer NULL in the result set which represent grand total,
--we use Grouping()

SELECT
    if(Grouping(productline),'All Productline',productline)productline,
    if(Grouping(orderYear),'All Year',orderYear) orderYear,
    SUM(orderValue) totalOrderValue
From sales
Group by 
    productline,
    orderYear
    with ROLLUP;
