--To find the total purchase amount of all orders.
select SUM(purchase_amount) AS "Total sum" from orders;

-- To find the average purchase amount of all orders.
select AVG(purchase_amount) AS "Average" from orders;

-- To get the maximum purchase amount of all the orders.
select MAX(purchase_amount) AS "Maximum" from orders;

--To get the minimum purchase amount of all the orders.
select MIN(purchase_amount) AS "Minumum" from orders;

-- To find the number of salesmen listed in the table.
select COUNT(distinct salesman_id) AS "Total count" from orders;