WITH TRASAC AS (
    SELECT 
        CONCAT(YEAR(TRANS_DATE), '-', LPAD(MONTH(TRANS_DATE), 2, '0')) AS month,
        COUNTRY as country,
        COUNT(*) AS trans_count,
        COUNT(CASE WHEN STATE='approved' THEN 1 END) AS approved_count,
        SUM(AMOUNT) AS trans_total_amount,
        SUM(CASE WHEN STATE='approved' THEN AMOUNT ELSE 0 END) AS approved_total_amount
    FROM Transactions
    GROUP BY month, country
)

SELECT * FROM TRASAC;
