select actor.actor_id, concat(actor.first_name,' ',actor.last_name), film.film_id,title, 
film.description, film.release_year
from actor
join film_actor on actor.actor_id = film_actor.actor_id
join film on film.film_id = film_actor.film_id
where film_actor.actor_id =5;