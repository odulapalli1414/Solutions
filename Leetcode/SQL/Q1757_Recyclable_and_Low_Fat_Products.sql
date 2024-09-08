-- Select the product_id from the Products table
SELECT product_id 
FROM Products
-- Where the product has low fats (denoted by 'Y')
WHERE low_fats = 'Y' 
-- And the product is recyclable (denoted by 'Y')
AND recyclable = 'Y';
