create database ONLINE_VEHICLE_AUCTION_MANAGEMENT_SYSTEM;

use ONLINE_VEHICLE_AUCTION_MANAGEMENT_SYSTEM;

create table Bid_product(
     bid_id int(6) not null,
     bid_buyer_name varchar(90) not null,
     bid_price varchar(100) not null,
     bid_pro_id varchar(20) not null,
     status varchar(50) not null,
     primary key(bid_id)
     );

create table Customer(
     Customer_id int(6) not null,
     Contact_name varchar(50) not null,
     Customer_number varchar(10) not null,
     Password varchar(8) not null,
     primary key(Customer_id)
     );


create table Place_bid(
     Customer_id int(6) not null,
     bid_id int(6) not null,
     primary key(Customer_id,bid_id)
     );


create table Vehicle_Owner(
     Owner_id int(10) not null,
     Vehicle_Owner_name varchar(100) not null,
     Contact_number varchar(10) not null,
     Vehicle_Owner_Status varchar(100) not null,
     Password varchar(8) not null,
     primary key(Owner_id)
     );


create table Admin(
     Admin_id int(6) not null,
     Admin_Status varchar(100) not null,
     Contact_number varchar(10) not null,
     Password varchar(8) not null,
     Customer_id int(6) not null,
     Owner_id int(10) not null,
     primary key (Admin_id),
     foreign key (Customer_id) references Customer(Customer_id),
     foreign key (Owner_id) references Vehicle_Owner (Owner_id)
     );


create table Vehicle(
     Vehicle_id int(10) not null,
     Vehicle_type varchar(20) not null,
     Vehicle_buyer varchar(50) not null,
     Vehicle_details varchar(200) not null,
     Vehicle_Status varchar(100) not null,
     Vehicle_photos varchar(10) not null,
     Vehicle_base_price varchar(50) not null,
     Vehicle_sold_price varchar(50) not null,
     Owner_id int(10) not null,
     primary key (Vehicle_id),
     foreign key (Owner_id) references Vehicle_Owner (Owner_id)
     );
     insert into Bid_product(bid_id,bid_buyer_name,bid_price,bid_pro_id,status)
     values (01,'Rasod',1200,'open'
             02,'Virusha',5400,'close',
             03,'Malithi',3900,'close',
			 04,'Kavindya',6700,'open',
             05,'Hasith',5950,'open');
             
     insert into Customer(Customer_ID, Customer_name, Contact_Number, Password)
     values(001, 'Vishwa', 0782233441, 'gdi@351',
            002, 'Ashen', 0707739803, 'jdb@092',
            003, 'Kavindu', 0718809368, '11@kha1',
            004, 'Sasidu', 0756982011, 'Dgd*111',
			005, 'Hansika', 0771020493, 'Eds@761');
	
     insert into Place_bid(Customer_ID, bid_ID)
     values( 001, 01,
             002, 02,
             003, 03,
             004, 04,
             005, 05);
     
     insert into Vehicle_Owner(Owner_ID, Vehicle_owner_name, Contact_ number, Vehicle_Owner_Status, Password)
     values ('0001', 'Thathsara', '0778378281', 'ufhd@882',
             '0002', 'Kasun', '0787492823', 'dijsd@8du',
             '0003', 'Udeshika', '0717399220', 'hhsh@83d',
             '0004', 'Naduni', '0778888828', 'Mapd@98e',
             '0005', 'Varun', '0721939388', 'hJkks@08d');
     
     insert into Admin(Admin_ID, Admin_ Status, Contact_ number, Password)
     values(00001, 'online', 0783677211, 'hfgfF@35j',
            00002, 'online', 0758882191, 'kjKja@80h',
            00003, 'offline', 0779012827, 'dhDu@e87',
            00004, 'online', 0717738399, 'fHJjsj@87',
            00005, 'offline', 0729038033, 'shsTh@67');
     
select bid_id,bid_buyer_name
from bid_product;
select bid_id,bid_buyer_name
from bid_product
where bid_id<=04;
SELECT * FROM student LIMIT 5;
DELETE FROM student WHERE Student_ID=10;
UPDATE student 
SET First_Name='Sanjeeva', Study_Program='Technology' 
WHERE Student_ID=6; 
INSERT INTO student (First_Name,Last_Name,NIC,Sex,Study_Program) 
values('Nishantha','Lakmal','834546342V','Male','IT');
SELECT min(unit_price) AS SmallestPrice FROM Products;
SELECT max(unit_price) AS SmallestPrice FROM Products;
SELECT count(product_name) AS AllItems FROM Products WHERE 
unit_price<40000;
SELECT avg(unit_price) AS averageprice FROM Products;
SELECT sum(unit_price) AS total FROM Products;
SELECT * FROM student 
WHERE SEX='Male' AND 
(First_Name='Dimuthu' OR Last_Name='Silva');
SELECT * FROM student WHERE First_Name LIKE 'd%';
SELECT * FROM student WHERE First_Name NOT LIKE 's%a';
SELECT * FROM student WHERE Sex IN ('Male');
SELECT * FROM student WHERE Sex NOT IN ('Male');
SELECT * FROM Products WHERE unit_price BETWEEN 1000 AND 
20000;
SELECT * FROM Products WHERE unit_price BETWEEN 1000 AND 20000 
order by product_ID ;
SELECT * FROM products WHERE order_date BETWEEN '6/1/2020' AND 
'7/31/2020';
ALTER TABLE table_name
ADD column_name datatype;
ALTER TABLE table_name
MODIFY COLUMN column_name datatype;
    
     
    
     
             

     
