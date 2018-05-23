# Create your views here.
from django.shortcuts import render, HttpResponse, redirect
from django.contrib import messages  #this is important for validations
from .models import *

def index(request):
  return render(request, 'restful/index.html', { 'user' : User.objects.all() })

def addUser(request):
  return render(request, 'restful/new.html')

def createUser(request):
  errors = User.objects.Validator(request.POST)
  if len(errors):
    for key, value in errors.items():
      print(value)
      messages.error(request, value)
    return redirect('/users/new', value)
  else:
    User.objects.create(first_name=request.POST['first_name'], last_name=request.POST['last_name'],email=request.POST['email'])
    return redirect('/users')

def show(request, id):
  tagUser = User.objects.get(id=id)
  context = {
    "userID" : tagUser
  }
  return render(request, 'restful/show.html', context)

def edit(request, id):
  tagUser = User.objects.get(id=id)
  context = {
    "userID" : tagUser }
  return render(request, 'restful/edit.html', context)

def destroy(request, id):
  dstry = User.objects.get(id=id)
  dstry.delete()
  return redirect('/users') 

def editUser(request):
  return render(request, 'restful/edit.html', user = User.objects.get(id=id))

def update(request, id): # lesson learn
  errors = User.objects.Validator(request.POST)
  if len(errors):
    for key, value in errors.items():
      print(value)
      messages.error(request, value)
    return render(request, 'restful/edit.html')
  else:
    i = User.objects.get(id=id)
    i.first_name = request.POST['first_name']
    i.last_name = request.POST['last_name']
    i.email = request.POST['email']
    i.save()
    return redirect('/users')