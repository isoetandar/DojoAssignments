# Create your views here.
from django.shortcuts import render, HttpResponse, redirect
  # the index function is called when root is visitedcopy
from django.utils.crypto import get_random_string

def index(request):
  response ="placeholder to later display all the list of users"
  return HttpResponse(response)

def register(request):
  response =" Placeholder for users to create a new user record"
  return HttpResponse(response)

def login(request):
  response ="placeholder for users to login"
  return HttpResponse(response)

def new(request):
  return redirect('/register')
