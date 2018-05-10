select users.first_name, users.last_name, 
	users2.first_name friend_firstname, users2.last_name friend_lastname
from users
left join friendships on users.id = friendships.friend_1_id
left join users users2 on users2.id = friendships.friend_2_id