select film.film_id,film.title, film.description, film.release_year, 
rating, film.special_features, category.name genre, film.rental_rate
from film
join film_category on film.film_id=film_category.film_id
join category on category.category_id = film_category.category_id
where film.rental_rate = 2.99
order by genre asc;