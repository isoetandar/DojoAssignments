select cities.name, cities.population
from cities
where population > 500000 and country_code='Mex';