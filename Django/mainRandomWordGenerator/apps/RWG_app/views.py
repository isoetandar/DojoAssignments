# Create your views here.
from django.shortcuts import render, HttpResponse, redirect
  # the index function is called when root is visitedcopy
from django.utils.crypto import get_random_string

def index(request):
  randWord = get_random_string(length=14)
  if 'count' not in request.session:
        request.session['count']=0
  else: request.session['count']+=1
  context = {
    "displayWord" : randWord,
    "counter" : request.session['count']
  }
  return render(request, "RWG/index.html", context)

def reset(request):
  randWord =""
  request.session['count']=0
  return redirect('/')

