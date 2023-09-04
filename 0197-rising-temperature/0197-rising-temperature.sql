# Write your MySQL query statement below
select a.id 
from Weather as a, Weather as b
where a.temperature>b.temperature 
and datediff(a.recordDate, b.recordDate)=1;