select region, count(*) countries
from countries
group by region
order by countries desc;