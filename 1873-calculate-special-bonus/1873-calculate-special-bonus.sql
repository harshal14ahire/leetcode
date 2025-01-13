SELECT 
    employee_id,
    CASE 
        WHEN MOD(employee_id, 2) = 0 THEN salary * 0
        WHEN name LIKE 'M%' THEN salary * 0
        ELSE salary
    END AS bonus
FROM 
    Employees
ORDER BY employee_id;