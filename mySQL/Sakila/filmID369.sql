select actor.first_name, actor.last_name, actor.last_update
from actor
join film_actor on actor.actor_id = film_actor.actor_id
where film_id=369;