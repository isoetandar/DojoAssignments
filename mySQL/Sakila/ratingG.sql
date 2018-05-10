select film.title, film.description, film.release_year, film.rating, film.special_features
from film
join film_actor on film.film_id = film_actor.film_id
where special_features LIKE '%Behind the Scenes%' 
and film.rating = 'G' and film_actor.actor_id = 15;

