SELECT EU.UNIQUE_ID, E.NAME 
FROM EMPLOYEES E
LEFT JOIN EMPLOYEEUNI EU ON EU.ID = E.ID;
