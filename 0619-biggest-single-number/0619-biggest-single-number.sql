SELECT IFNULL(
(SELECT num 
FROM MyNumbers
GROUP BY num
HAVING COUNT(*)=1
ORDER BY num DESC
LIMIT 1 OFFSET 0),NULL) AS num