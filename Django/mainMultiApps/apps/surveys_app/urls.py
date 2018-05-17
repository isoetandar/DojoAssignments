from django.conf.urls import url
from . import views           # This line is new!

urlpatterns = [
    url(r'^surveys$', views.index, name="home_index"),
    url(r'^surveys/new$', views.new)
]
