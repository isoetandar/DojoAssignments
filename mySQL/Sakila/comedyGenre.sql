select film.film_id, film.title, film.description, film.release_year, film.rating, 
film.special_features, category.name genre
from film
join film_category on film.film_id = film_category.film_id
join category on category.category_id = film_category.category_id
where category.name ='Comedy';

