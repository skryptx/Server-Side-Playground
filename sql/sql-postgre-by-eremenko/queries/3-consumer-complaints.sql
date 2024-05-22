COPY consumer_complaints 
FROM 'C:\Users\sinni\WorkSpace\dev-bytes-BE\sql\sql-postgre-by-eremenko\datasets\Section-3-ConsumerComplaints.csv' 
DELIMITER ',' CSV HEADER

select * from consumer_complaints limit 1000