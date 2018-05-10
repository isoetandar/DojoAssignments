Select store.store_id, address.city_id, customer.first_name, customer.last_name,
	customer.email, address.address
From store
Join customer on customer.store_id=store.store_id
Join address on address.address_id = customer.address_id
Where store.store_id = 1 and (address.city_id = 1 || address.city_id =42 
 || address.city_id = 312 || address.city_id =459);
