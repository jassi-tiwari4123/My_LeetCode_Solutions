# Write your MySQL query statement below
SELECT max(num) as num from (select num from mynumbers group by num having count(*)=1)t;