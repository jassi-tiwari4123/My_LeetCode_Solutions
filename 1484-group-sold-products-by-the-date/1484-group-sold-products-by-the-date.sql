# Write your MySQL query statement below
-- select sell_date,count(distinct product)
-- as num_sold, group_concat(distinct product
-- order by product separator ',') as products
-- from activities group by sell_date
-- order by sell_date;


select a.sell_date, count(distinct a.product) as num_sold, 
group_concat(distinct a.product order by a.product) as products
from activities a group by a.sell_date