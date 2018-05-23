from django.shortcuts import render

# Create your views here.
from django.shortcuts import render, HttpResponse, redirect
  # the index function is called when root is visitedcopy
from django.contrib import messages
from django.urls import reverse


# views.py
from django.shortcuts import render, HttpResponse, redirect
def index(request):
    return render(request, "surveyForm/index.html")

def process(request):
    if request.method == "POST":
        request.session['yourname']= request.POST['yourname']
        request.session['location']= request.POST['location']
        request.session['favorite']= request.POST['favorite']
        request.session['comment']= request.POST['comment']
        print(request.POST['yourname'])
        print(request.POST['location'])
        print(request.POST['favorite'])
        print(request.POST['comment'])
       
        return redirect ("/result")

def result(request):
    return render(request, "surveyForm/indexresult.html")
