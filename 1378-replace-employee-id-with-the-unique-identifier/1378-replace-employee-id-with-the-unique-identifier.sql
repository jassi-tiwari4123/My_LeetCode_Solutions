# Write your MySQL query statement below
-- select emp.unique_id , e.name from employees e left join employeeUNI emp on emp.id=e.id;

select e.unique_id ,ee.name from employees ee left join employeeUNI e on ee.id=e.id;