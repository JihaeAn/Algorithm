-- 코드를 입력하세요
SELECT animal_id, name
from animal_ins
where upper(name) like '%EL%'
and ANIMAL_TYPE = 'Dog'
order by name;