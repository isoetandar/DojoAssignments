SELECT countries.name, languages.language, languages.percentage 
FROM countries 
JOIN languages 
ON countries.code = languages.country_code
and languages.percentage > 89
order by percentage DESC ;
