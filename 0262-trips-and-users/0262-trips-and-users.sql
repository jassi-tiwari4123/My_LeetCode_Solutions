# Write your MySQL query statement below
-- select t.request_at as 'Day',round(
--     sum(case 
--     when t.status='cancelled_by_driver' or 
--     t.status='cancelled_by_client' then 1 
-- else 0
-- end)/count(*),2) as "Cancellation Rate" from trips t join users u on u.users_id=t.client_id 
-- join users u1 on u1.users_id=t.driver_id
-- where u.banned='No' and u1.banned='No'
-- and t.request_at between '2013-10-01' and '2013-10-03'

-- group by t.request_at;


select t.request_at as Day, round
(sum(case when t.status='cancelled_by_driver' or t.status='cancelled_by_client' then 1 else 0
end)/count(*),2) as "Cancellation Rate" 
from trips t join users u on u.users_id=t.client_id join users u1 on u1.users_id=t.driver_id 
where u.banned='No' and u1.banned='No' and t.request_at between '2013-10-01' and '2013-10-03'
group  by t.request_at;