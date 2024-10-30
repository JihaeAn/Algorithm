select name, count(name)
from animal_ins
group by name
HAVING 
    COUNT(name) >= 2
order by name;