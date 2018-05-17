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


# def index(request):
# #   randWord = get_random_string(length=14)
# #   if 'count' not in request.session:
# #         request.session['count']=0
# #   else: request.session['count']+=1
#   context = {
#     "displayWord" : randWord,
#     "counter" : request.session['count']
#   }
#   return render(request, "RWG/index.html", context)


# def index(request):
#     context = {
#         "email" : "blog@gmail.com",
#         "name" : "mike"
#     }
#     return render(request, "surveyForm/index.html", context)


# def new(request):
#     response = "placeholder to display a new form to create a new blog"
#     return HttpResponse(response)

# def show(request, number):
#     return HttpResponse("placeholder to display blog " + number)

# def edit(request, number):
#     return HttpResponse("placeholder to edit blog " + number)
    
# def destroy(request, number):
#     return HttpResponseRedirect(reverse('home_index'))

# def create(request):
#     if request.method == "POST":
#         print("*"*50)
#         request.session['name']= request.POST['name']
#         print(request.session['name'])
#         print(request.POST['name'])
#         print(request.POST['desc'])
#         request.session['name'] = "test"  # more on session below
#         print("*"*50)
#         return redirect("/")
#     else:
#         return redirect("/")
