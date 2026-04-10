# Write your MySQL query statement below
-- select id from weather w where temperature>(select temperature from weather where recorddate=
-- date_sub(w.recorddate,interval 1 day));


select w.Id from weather w where w.temperature>(select temperature from weather where recordDate=date_sub(w.recordDate,interval 1 day));