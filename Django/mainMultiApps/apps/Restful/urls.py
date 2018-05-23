from django.conf.urls import url
from . import views           # This line is new!

urlpatterns = [
    url(r'^users$', views.index, name="home_index"),
    url(r'^users/new$', views.addUser, name="add_User"),
    url(r'^users/create$', views.createUser, name="add_User"),
    url(r'^users/(?P<id>\d+)$', views.show, name="show_User"),
    url(r'^users/edit$', views.editUser, name="edit_User"),
    url(r'^users/(?P<id>\d+)/edit$', views.edit),
    url(r'^users/(?P<id>\d+)/update$', views.update),
    url(r'^users/(?P<id>\d+)/delete$', views.destroy)
]
