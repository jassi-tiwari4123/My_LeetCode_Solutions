# Write your MySQL query statement below
select emp.unique_id , e.name from employees e left join employeeUNI emp on emp.id=e.id;