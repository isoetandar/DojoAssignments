from django.shortcuts import render, HttpResponse, redirect
from django.contrib import messages
from .models import *
import bcrypt

def index(request):
    return render(request, 'handyHelper/index.html')

def register(request):
  errors = User.objects.Validator(request.POST)
  if len(errors):
    for key, value in errors.items():
      messages.error(request, value)
    return redirect('/', value)
  else:
    hashPass = bcrypt.hashpw(request.POST['password'].encode(), bcrypt.gensalt())
    User.objects.create(first_name=request.POST['first_name'], last_name=request.POST['last_name'],email=request.POST['email'], password=hashPass)
    request.session['first_name'] = request.POST['first_name']
    return redirect ('/Success', )

def success(request):
  return render(request, 'handyHelper/success.html' )

def login(request):
  if len(User.objects.filter(email=request.POST['email']))!=0:
    a = User.objects.get(email=request.POST['email'])
    request.session['id'] = a.id
    # print("user id........from login", request.session['id'])
    request.session['first_name'] = a.first_name
    # print("user id........from login", request.session['first_name'])
    request.session['last_name'] = a.last_name
    if bcrypt.checkpw(request.POST['password'].encode(), a.password.encode()):
      return redirect('/Dashboard')
    else:
      context ={
        'loginerror' : 'Password do not match' 
      }
      return redirect('/', context)
  else:
    context ={
        'loginerror' : 'The email is not registered yet' 
      }
    return redirect('/', context)

def addjob(request):
  return render(request, 'handyHelper/addjob.html' )

def addjobs(request):
  # print(request.session['first_name'])
  usr = User.objects.get(first_name = request.session['first_name'])
  job = jobList.objects.create(job= request.POST['title'], desc= request.POST['description'], location= request.POST['location'])
  # jobList.objects.create(job="request.POST['title]", desc="request.POST['description']", location="request.POST['location']", 
  #         user = User.objects.get(first_name = request.session['first_name']))
  return redirect("/Dashboard")

def logout(request):
  request.session.clear()
  return redirect("/")

def dashboard(request):
  context ={
        'Jobs' : jobList.objects.all()
      }
  return render(request, 'handyHelper/dashboard.html', context)

def edit(request, id):
  jobList.objects.update(job= request.POST['title'], desc= request.POST['description'], location= request.POST['location'])
  context = {
    'job' : jobList.objects.get(id=id)
  }
  return render(request, 'handyHelper/userQuote.html', context)

def view(request, id):
  context = {
    'job' : jobList.objects.get(id=id)
  }
  return render(request, 'handyHelper/viewJob.html', context)

def add(request, id):
  context = {
    'job' : jobList.objects.get(id=id)
  }
  return render(request, 'handyHelper/viewJob.html', context)

def delete(requst, id):
  a= jobList.objects.get(id=id)
  a.delete()
  return redirect('/Dashboard')