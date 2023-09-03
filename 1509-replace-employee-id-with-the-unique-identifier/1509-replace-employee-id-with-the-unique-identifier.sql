# Write your MySQL query statement below
select b.unique_id, a.name 
from Employees as a
LEFT JOIN EmployeeUNI as b
on a.id = b.id;