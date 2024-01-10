-- 코드를 입력하세요
SELECT DR_NAME, DR_ID, MCDP_CD, to_char(HIRE_YMD, 'YYYY-MM-dd') as HIRE_YMD
from doctor
where MCDP_CD = 'GS' or MCDP_CD = 'CS'
order by HIRE_YMD desc, dr_name;