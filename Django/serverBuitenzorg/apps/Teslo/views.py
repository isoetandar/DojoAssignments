from django.shortcuts import render, HttpResponse, redirect
from django.contrib import messages
from .models import *
import bcrypt

def index(request):
    return render(request, 'Teslo/index.html')

def register(request):
  if request.method == "POST":
    errors = User.objects.Validator(request.POST)
    if len(errors):
      for key, value in errors.items():
        messages.error(request, value)
      return redirect('/', value)
    else:
      hashPass = bcrypt.hashpw(request.POST['password'].encode(), bcrypt.gensalt())
      User.objects.create(first_name=request.POST['first_name'], last_name=request.POST['last_name'],email=request.POST['email'], password=hashPass)
      request.session['first_name'] = request.POST['first_name']
      return redirect ('/ThanksForRegistration', )
  else:
    return render(request, 'Teslo/registration.html')

def ThanksForRegistration(request):
   return render(request, 'Teslo/ThanksForRegistration.html' )

def login(request):
  if request.method=="POST":
    if len(User.objects.filter(email=request.POST['email']))!=0:
      a = User.objects.get(email=request.POST['email'])
      request.session ['email'] = a.email
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
  else:
    return render(request, 'Teslo/login.html')

# def addMyJobs(request, id):
#     addMine = jobList.objects.get(id=id)
#     addMine.myJob = User.objects.get(id = request.session['id'])

#     return redirect('/Dashboard')

# def addjobs(request):
#   if request.method == "POST":
#     jobList.objects.create(job = request.POST['title'], desc= request.POST['description'], location= request.POST['location'], user = User.objects.get(email = request.session['email']))
#     return redirect("/Dashboard")
#   else:
#     return render(request, "handyHelper/addjob.html")

# def logout(request):
#   request.session.clear()
#   return redirect("/")

# def dashboard(request):
#   if len(request.session['first_name']) !=0 :
#     context ={
#         'Jobs' : jobList.objects.all()
#       }
#     return render(request, 'handyHelper/dashboard.html', context)
#   else:
#     return render (request, 'handyHelper/Acces_Denied.html')

# def edit(request, id):
#   context = {
#     'job' : jobList.objects.get(id=id)
#   }
#   return render(request, 'handyHelper/editQuote.html', context)

# def view(request, id):
#   context = {
#     'job' : jobList.objects.get(id=id)
#   }
#   return render(request, 'handyHelper/viewJob.html', context)

# # def add(request, id):
# #   context = {
# #     'job' : jobList.objects.get(id=id)
# #   }
# #   return render(request, 'handyHelper/viewJob.html', context)

# def delete(request, id):
#   a= jobList.objects.get(id=id)
#   a.delete()
#   return redirect('/Dashboard')

# def update(request, id):
#   specJob = jobList.objects.get(id=id)
#   specJob.job = request.POST['title']
#   specJob.desc = request.POST['description']
#   specJob.location = request.POST['location']
#   # request.session['job'] = request.POST['title']
#   # request.session['desc'] = request.POST['description']
#   # request.session['location'] = request.POST['location']
#   # print(specJob.job)
#   # print(specJob.desc)
#   # print(specJob.location)
  
#   specJob.save()

#   return redirect ('/Dashboard')