from django.conf.urls import url
from . import views           # This line is new!

urlpatterns = [
    # url(r'^blogs$', views.index, name="home_index"),
    # url(r'^blogs/new$', views.new),
    # url(r'^blogs/create$', views.create),
    # url(r'^blogs/(?P<number>\d+)/edit$', views.edit),
    # url(r'^blogs/(?P<number>\d+)$', views.show),
    # url(r'^blogs/(?P<number>\d+)/delete$', views.destroy)
]
