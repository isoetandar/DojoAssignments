# Create your views here.
from django.shortcuts import render, HttpResponse, redirect
  # the index function is called when root is visitedcopy
from django.utils.crypto import get_random_string

def index(request):
  response =""
  return HttpResponse(response)

def register(request):
  response =" "
  return HttpResponse(response)

def login(request):
  response =""
  return HttpResponse(response)

def new(request):
  return redirect('/register')
