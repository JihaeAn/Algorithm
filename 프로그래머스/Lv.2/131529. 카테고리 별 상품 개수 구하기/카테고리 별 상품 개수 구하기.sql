-- 코드를 입력하세요
SELECT substr(PRODUCT_CODE, 1, 2) as CATEGORY, count(*) as PRODUCTS 
from product
group by substr(PRODUCT_CODE, 1, 2)
order by substr(PRODUCT_CODE, 1, 2)
