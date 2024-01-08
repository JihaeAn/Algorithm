-- 코드를 입력하세요
SELECT COUNT(*) FROM (select * from user_info WHERE TO_CHAR(joined, 'YYYY') = '2021') where 20 <= age and age <= 29;
