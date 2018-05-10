select film.title, film.description, film.release_year, 
	rating, film.special_features, category.name genre
from film
join film_actor on film.film_id = film_actor.film_id
join film_category on film_category.film_id = film.film_id
join category on category.category_id = film_category.category_id
where  category.name ='Action';
