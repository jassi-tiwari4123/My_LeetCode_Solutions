# Write your MySQL query statement below
select X,Y,Z ,case when ((x+y)>z) and ((y+z)>x) and ((x+z)>y) then "Yes" else "No" end as triangle FROM TRIANGLE;