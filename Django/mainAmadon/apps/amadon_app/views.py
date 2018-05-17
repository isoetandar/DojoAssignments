from django.shortcuts import render

# Create your views here.
from django.shortcuts import render, HttpResponse, redirect
  # the index function is called when root is visitedcopy
from django.contrib import messages
from django.urls import reverse


# views.py
from django.shortcuts import render, HttpResponse, redirect
def index(request):
    return render(request, "amadon/index.html")

def buy(request):
    if request.method == "POST":

        T = int(request.POST['Tshirt'])
        S = int(request.POST['Sweater'])
        C = int(request.POST['Cup'])
        A = int(request.POST['Algo'])

        totBuyItems = T+S+C+A
        totBuyPayment = float(T*19.99) + float(S*29.99)+ float(C*4.99)+float(A*49.99)

        request.session['totBuyItems'] = totBuyItems
        request.session['totBuyPayment'] = totBuyPayment

        # request.session['totItems'] += totBuyItems
    
        request.session['totCost'] =+ totBuyPayment

        print(request.session['totCost'])

    

        # request.session['Tshirt']= request.POST['Tshirt']
        # request.session['Sweater']= request.POST['Sweater']
        # request.session['Cup']= request.POST['Cup']
        # request.session['Algo']= request.POST['Algo']
        # print(request.POST['Tshirt'])
        # print(request.POST['Sweater'])
        # print(request.POST['Cup'])
        # print(request.POST['Algo'])
       
        return redirect ("/checkout")

def checkout(request):
    return render(request, "amadon/checkout.html")