--create a stored proceduer
DELIMETER //
Create Procedure GetCustomer()
BEGIN
Select  
 *
 from 
 customers;
 END // DELIMETER;

--delete a stored procedure
 drop procedure procedure_name if exist;

--call a stored procedure
 call GetCustome();




DELIMITER $$
CREATE procedure GetOffice(
 IN customerName VARCHAR(255)
)
BEGIN
Select * from offices where country = customerName;
END $$
Delimiter $$;



 --create  proc to return no of orders by order status
 --input orderstatus varchar
 --output total int

Delimiter $$
CREATE procedure GetOrderCountByStatus(
 in orderStatus varchar(100),
 out total int
)
Begin 
Select count(orderNumber)
into total
from orders
where status = orderStatus;
END $$
Delimiter ;


--couter in procedure
Delimiter $$
CREATE procedure SetCounter(
 inout counter int,
 in inc int
)
Begin 
set counter = counter+inc;
end $$
Delimiter ;

set @counter=1;
call SetCounter(@counter,1);
call SetCounter(@counter,1);
call SetCounter(@counter,7);
select @counter;

--using Variables
DECLARE var_name data_type(size) [DEFAULT default_value]:

DECLARE totalsale DEC(10,2) DEFAULT 0.0;


--Stored procedure using Error handling
--prevent addintion of duplicate values

Declare action HANDLER


DELIMITER $$
CREATE PROCEDURE InsertSupplierProducts(
   IN inSupplierID int,
   IN inProductID int
)
BEGIN 
    Declare EXIT HANDLER FOR 1062
    BEGIN
    select concat('Duplicate key',inSupplierID,',',inProductID,') Occured') As Message;
    END;
    Insert into SupplierProducts(supplierID,productId) Values (inSupplierID,inProductID);
    Select count(*) from SupplierProducts
    where supplierId=inSupplierID;
    End $$
    Delimiter ;



---working with function
Delimiter $$

Create FUNCTION fun_name(
    
)
return data_type
BEGIN
--stmt
END $$
Delimiter ;


--create a function which will return customer level based o credit

Delimiter $$
Create FUNCTION CustomerLevel(
    credit DECIMAL(10,2)
)
 Returns VARCHAR(20)
DETERMINISTIC
BEGIN
    Declare customerLevel varchar(20);
    if credit > 50000 THEN
        set customerLevel = 'PLATINUM';
    ELSEIF (credit <= 50000 and credit >= 10000) THEN
        set customerLevel = 'GOLD';
    ELSEIF (credit < 10000) THEN
        set customerLevel = 'SILVER';
    END IF;
    RETURN (customerLevel);
END $$
Delimiter ;
    
Select customerName,CustomerLevel(creditLimit)
from customers
order by
customerName;