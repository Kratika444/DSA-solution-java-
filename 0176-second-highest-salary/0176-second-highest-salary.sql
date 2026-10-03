# Write your MySQL query statement below
-- select(
--     select distinct salary 
--     from Employee
--     order by salary DESC
--     LIMIT 1 OFFSET 1
-- ) AS SecondHighestSalary

select MAX(salary) as SecondHighestSalary from Employee 
where salary <> (select MAX(salary) from Employee);