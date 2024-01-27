-- 코드를 입력하세요
SELECT BOOK_ID, AUTHOR_NAME, 
       to_char(PUBLISHED_DATE, 'YYYY-MM-DD') as PUBLISHED_DATE
from book b left join author a on b.AUTHOR_ID = a.AUTHOR_ID
where CATEGORY = '경제'
order by PUBLISHED_DATE;