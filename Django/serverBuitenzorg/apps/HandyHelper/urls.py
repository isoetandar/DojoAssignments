from django.conf.urls import url
from . import views           # This line is new!
urlpatterns = [
    url(r'^$', views.index, name="index"),
    url(r'^Registration$', views.register),
    url(r'^Success$', views.success),
    url(r'^Dashboard$', views.dashboard),
    url(r'^addJob$', views.addjob),
    url(r'^addJobs$', views.addjobs),
    url(r'^logout$', views.logout),
    url(r'^login$', views.login),
    url(r'^edit/(?P<id>\d+)$', views.edit),
    url(r'^view/(?P<id>\d+)$', views.view),
    url(r'^delete/(?P<id>\d+)$', views.delete),
    url(r'^add/(?P<id>\d+)$', views.add)
]                            
