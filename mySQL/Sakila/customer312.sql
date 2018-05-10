select city.city_id id, city.city city, customer.first_name firstname, 
	customer.last_name lastname,
	customer.email email, address.address address
from city 
join address on city.city_id=address.city_id
join customer on address.address_id = customer.address_id 
where city.city_id = 312;


