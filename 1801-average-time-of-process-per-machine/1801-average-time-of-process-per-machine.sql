# Write your MySQL query statement below
select s.machine_id, round(avg(e.timestamp - s.timestamp), 3) as processing_time
from Activity as s JOIN Activity as e on
    s.machine_id = e.machine_id AND s.process_id = e.process_id AND
    s.activity_type = 'start' AND e.activity_type = 'end'
group by s.machine_id;