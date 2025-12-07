# Write your MySQL query statement below
select (select case when id%2=1 and s.id+1<=(select max(id) from seat)then s.id+1
when s.id%2=0 then s.id-1
else s.id
end
) as id,s.student from seat s order by id;