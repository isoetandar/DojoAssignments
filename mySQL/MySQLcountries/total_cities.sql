SELECT countries.name, count(cities.country_code) cities 
FROM cities JOIN countries 
WHERE cities.country_code = countries.code 
GROUP by country_code
ORDER BY cities DESC;