# Write your MySQL query statement below
-- SELECT 
--     p.product_name,
--     SUM(o.unit) AS unit
-- FROM Orders o
-- JOIN Products p
--     ON o.product_id = p.product_id
-- WHERE o.order_date >= '2020-02-01'
--   AND o.order_date < '2020-03-01'
-- GROUP BY p.product_name
-- HAVING SUM(o.unit) >= 100;


select p.product_name,sum(o.unit) as unit from products p join orders o on o.product_id=
p.product_id where o.order_date>='2020-02-01' and o.order_date<'2020-03-01'
group by p.product_name having sum(o.unit)>=100;
