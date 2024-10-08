SELECT V.CUSTOMER_ID AS customer_id, COUNT(V.CUSTOMER_ID) AS count_no_trans
FROM VISITS V
LEFT JOIN TRANSACTIONS T ON T.VISIT_ID = V.VISIT_ID
WHERE T.TRANSACTION_ID IS NULL
GROUP BY V.CUSTOMER_ID
ORDER BY count_no_trans DESC; 
