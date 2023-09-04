# Write your MySQL query statement below
select a.name, b.bonus 
from Employee as a
LEFT JOIN Bonus as b
on a.empId = b.empId
where bonus is null or bonus<1000;