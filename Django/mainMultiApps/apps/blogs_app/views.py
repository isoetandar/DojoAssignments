# Create your views here.
from django.shortcuts import render, HttpResponse, redirect
  # the index function is called when root is visitedcopy
from django.utils.crypto import get_random_string

def index(request):
  response= " placeholder to later display all th list of blogs"
  return HttpResponse(response)
  

def edit(request, number):
  response = " placeholder to edit blog" + number
  return HttpResponse(response)

def show(request, number):
  response = " placeholder to display blog" + number
  return HttpResponse(response)

def create(request):
  return redirect('/blogs')

def destroy(request, number):
  return redirect('/blogs')

def new(request):
  response =" placeholder to display a new form to create a new blog"
  return HttpResponse(response)
