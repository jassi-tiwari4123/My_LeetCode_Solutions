# Write your MySQL query statement below
# Write your MySQL query statement below
(SELECT name AS results
FROM MovieRating JOIN Users USING(user_id)
GROUP BY name
ORDER BY COUNT(*) DESC, name
LIMIT 1)

UNION ALL

(SELECT title AS results
FROM MovieRating JOIN Movies USING(movie_id)
WHERE MovieRating.created_at<="2020-02-29" and MovieRating.created_at>="2020-02-01" 
GROUP BY title
ORDER BY AVG(rating) DESC, title
LIMIT 1);