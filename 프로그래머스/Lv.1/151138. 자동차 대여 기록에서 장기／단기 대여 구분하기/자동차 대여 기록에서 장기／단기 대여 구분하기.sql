-- 코드를 입력하세요
SELECT HISTORY_ID, CAR_ID, to_char(START_DATE,'YYYY-MM-DD') as START_DATE, 
to_char(END_DATE, 'YYYY-MM-DD') as END_DATE, 
CASE WHEN(end_date - start_date + 1) >= 30
    THEN '장기 대여' 
    ELSE '단기 대여'
END AS RENT_TYPE
from CAR_RENTAL_COMPANY_RENTAL_HISTORY
where to_char(START_DATE, 'YYYY-MM') like '%2022-09%'
order by HISTORY_ID desc;   