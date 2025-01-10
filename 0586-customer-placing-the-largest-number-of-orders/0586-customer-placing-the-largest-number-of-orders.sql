# Write your MySQL query statement below
Select customer_number
from Orders
group by customer_number
order by count(customer_number) desc
limit 1 offset 0;


