# Create your views here.
from django.shortcuts import render, HttpResponse, redirect
  # the index function is called when root is visitedcopy
from django.utils.crypto import get_random_string

def index(request):
  response = " placeholder to dispay all the surveys created"
  return HttpResponse(response)

def new(request):
  response = " placeholder for users to add a new survey"
  return HttpResponse(response)

