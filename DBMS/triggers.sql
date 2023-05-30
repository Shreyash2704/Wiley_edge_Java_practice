--create a trigger to save all the previos change when updation on databse is done.

CREATE Table employee_audit(
   id INT AUTO_INCREMENT PRIMARY KEY,
   employeeNumber INT NOT NULL,
   lastname VARCHAR(50) NOT NULL,
   changedate DATETIME DEFAULT NULL,
   action VARCHAR(50) DEFAULT NULL 
);

CREATE TRIGGER before_employee_update
    Before Update on employees
    for each ROW 
INSERT INTO employee_audit
SET action = 'update',
    employeeNumber = OLD.employeeNumber,
    lastname = OLD.lastname,
    changedate = NOW();

    
Update employees set lastname="Steve" where employeeNumber=1056;

DELIMITER $$
Create TRIGGER after_members_insert
    After INSERT on member
    for each row 
BEGIN 
    if NEW.dob == null THEN 
        INSERT INTO reminder(id,name,message)
        values(NEW.id,NEW.name,concat('Hi ',New.name,', please update your dob.'))
    END IF;
END $$
DELIMITER ;



DELIMITER $$
Create TRIGGER before_additional_payment
After Insert on customers_
for each row 
Begin 
if NEW.extra_payment > NEW.emi_amount*2 THEN
   SIGNAL SQLSTATE '45000' SET MESSAGE_TEXT = "invalid extra pyment"
END IF;
END $$
DELIMITER ;





--EMi_table
create table emi(
 emi_id int NOT NULL,
 user_id int NOT NULL,
 loan_id int NOT NULL,
 emi_amount double(10,2) NOT NULL,
 emi_duration int NOT NULL,
 total_amount_left double(10,2) NOT NULL,
 PRIMARY Key (emi_id)
 );

--EMI Tranasaction Audit
create table emi_audit(
 transaction_id int NOT NULL,
 emi_id int NOT NULL,
 amount_paid double(10,2) NOT NULL,
 date_of_payment date NOT NULL,
 PRIMARY Key (transaction_id),
 FOREIGN KEY (emi_id) REFERENCES emi(emi_id)
 );


insert into emi values(1,21,11,933.33,12,11200);

--trigger to update total amount left for customer to be paid.
Delimiter $$
Create Trigger after_emi_paid
After Insert on emi_audit
for each ROW
BEGIN
Update emi
    set total_amount_left = total_amount_left - NEW.amount_paid
	WHERE emi_id = NEW.emi_id;
End $$
Delimiter ;





--trigger to check if emi amount is valid or not.
Delimiter $$

Create Trigger before_emi_payment
Before Insert on emi_demo
for each ROW
Begin 
if OLD.emi_amount > OLD.total_amount_left then 
   SIGNAL SQLSTATE '45000' SET MESSAGE_TEXT = "emi amount is greater than loan amount" 
Delimiter ;










