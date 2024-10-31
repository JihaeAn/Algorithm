-- 코드를 입력하세요
SELECT ins.name, ins.datetime
FROM animal_ins ins left join animal_outs outs
on ins.animal_id = outs.animal_id
where outs.datetime is null
ORDER BY ins.datetime
LIMIT 3;