SELECT countries.name, languages.language, languages.percentage 
FROM countries 
JOIN languages 
WHERE countries.id = languages.country_id 
AND language = 'Slovene' 
ORDER BY percentage DESC;