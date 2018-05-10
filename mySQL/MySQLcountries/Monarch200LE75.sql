select name goverment_form, capital, life_expectancy 
from countries 
where government_form ='Constitutional Monarchy' and life_expectancy > 75;