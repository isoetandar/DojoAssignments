select count(*)
from users
left join friendships on users.id = friendships.friend_1_id
left join users users2 on users2.id = friendships.friend_2_id;