from django.conf.urls import url
from . import views           # This line is new!
urlpatterns = [
    url(r'^$', views.index, name="index"),
    url(r'^registration$', views.register, name="register"),
    url(r'^login$', views.login, name="login"),
    url(r'^ThanksForRegistration$', views.login, name="ThanksForRegistration")
    # url(r'^Success$', views.success),
    # url(r'^Dashboard$', views.dashboard),
    # # url(r'^addjob$', views.addjob),
    # url(r'^addjobs$', views.addjobs),
    # url(r'^addMyJobs/(?P<id>\d+)$', views.addMyJobs),
    # url(r'^logout$', views.logout),
    # url(r'^login$', views.login),
    # url(r'^edit/(?P<id>\d+)$', views.edit),
    # url(r'^view/(?P<id>\d+)$', views.view),
    # url(r'^delete/(?P<id>\d+)$', views.delete),
    # url(r'^update/(?P<id>\d+)$', views.update)
]                            
