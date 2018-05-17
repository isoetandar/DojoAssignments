# Create your views here.
from django.shortcuts import render, HttpResponse, redirect
  # the index function is called when root is visitedcopy
import datetime

def index(request):
  context = {
        "current_day" : datetime.datetime.now().strftime('%b %d, %Y'),
        "current_time" : datetime.datetime.now().strftime('%H:%M:%S')
    }
  return render(request, "timedisplay/index.html", context)

