# Write your MySQL query statement below
select a.customer_id, count(*) as count_no_trans
from Visits as a
where visit_id not in (select distinct visit_id from transactions)
group by customer_id;