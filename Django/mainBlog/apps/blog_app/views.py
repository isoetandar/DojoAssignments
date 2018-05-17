from django.shortcuts import render

# Create your views here.
from django.shortcuts import render, HttpResponse, redirect, HttpResponseRedirect
  # the index function is called when root is visitedcopy
from django.contrib import messages
from django.urls import reverse


def index(request):
    response = "placeholder to later display all the list of blogs"
    return HttpResponse(response)

def new(request):
    response = "placeholder to display a new form to create a new blog"
    return HttpResponse(response)

def show(request, number):
    return HttpResponse("placeholder to display blog " + number)

def edit(request, number):
    return HttpResponse("placeholder to edit blog " + number)
    
def destroy(request, number):
    # return HttpResponseRedirect(reverse('home_index'))
    return redirect ("/")

def create(request):
    # return HttpResponseRedirect(reverse('home_index'))
    return redirect ("/")