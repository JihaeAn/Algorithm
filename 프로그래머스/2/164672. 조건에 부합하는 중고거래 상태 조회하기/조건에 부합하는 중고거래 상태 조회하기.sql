-- 코드를 입력하세요
SELECT BOARD_ID, WRITER_ID, TITLE, PRICE, 
DECODE(STATUS, 'RESERVED', '예약중', 'DONE', '거래완료', 'SALE', '판매중')
from USED_GOODS_BOARD
where to_char(CREATED_DATE,'YYYY-MM-dd') = '2022-10-05'
order by BOARD_ID desc;