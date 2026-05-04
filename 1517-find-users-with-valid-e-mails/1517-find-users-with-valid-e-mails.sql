# Write your MySQL query statement below
-- select * from users where BINARY mail regexp '^[A-Za-z][A-Za-z0-9_.-]*@leetcode\\.[c][o][m]$';
SELECT *
FROM Users
WHERE mail REGEXP '^[A-Za-z][A-Za-z0-9_.-]*@leetcode\\.com$'
COLLATE utf8mb4_bin;