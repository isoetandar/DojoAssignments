select countries.name, cities.name, cities.district, cities.population 
from cities 
left join countries 
on countries.code = cities.country_code
where cities.population > 500000
and countries.name ='Argentina'
order by district asc;
