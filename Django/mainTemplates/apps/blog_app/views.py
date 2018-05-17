from django.shortcuts import render

# Create your views here.
from django.shortcuts import render, HttpResponse, redirect
  # the index function is called when root is visitedcopy
from django.contrib import messages
from django.urls import reverse


# views.py
from django.shortcuts import render, HttpResponse, redirect
def index(request):
    context = {
        "email" : "blog@gmail.com",
        "name" : "mike"
    }
    return render(request, "blogs/index.html", context)


def new(request):
    response = "placeholder to display a new form to create a new blog"
    return HttpResponse(response)

def show(request, number):
    return HttpResponse("placeholder to display blog " + number)

def edit(request, number):
    return HttpResponse("placeholder to edit blog " + number)
    
def destroy(request, number):
    return HttpResponseRedirect(reverse('home_index'))

def create(request):
    if request.method == "POST":
        print("*"*50)
        request.session['name']= request.POST['name']
        print(request.session['name'])
        print(request.POST['name'])
        print(request.POST['desc'])
        request.session['name'] = "test"  # more on session below
        print("*"*50)
        return redirect("/")
    else:
        return redirect("/")
