from django.conf.urls import url
from . import views           # This line is new!

urlpatterns = [
    url(r'^users$', views.index, name="home_index"),
    url(r'^users/new$', views.new),
    url(r'^register$', views.register),
    url(r'^login$', views.login)
]
