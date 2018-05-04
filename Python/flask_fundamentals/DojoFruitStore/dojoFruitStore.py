from flask import Flask, render_template, request, redirect
from datetime import datetime

app = Flask(__name__)

# our index route will handle rendering our form
@app.route('/')
def index():
    return render_template("index.html")

@app.route('/checkout', methods=['POST'])
def indexresult():
    
    print(request.form)
    print(datetime.now())
    # strw =int(request.form["Strawberry"])
    # rsp = int(request.form["Raspberry"])
    # appl= int(request.form["Apple"])
    # tn = datetime.now()
    # named =request.form["Name"]
    # idStudent=request.form["Student_ID"]
    
    return render_template("checkout.html", strw =int(request.form["Strawberry"]), rsp = int(request.form["Raspberry"]), 
        appl= int(request.form["Apple"]),tn = datetime.now() ) 
    #this passing parameters to checkout.html, like parameter strw, rsp, appl) 

if __name__ =="__main__":
    app.run(debug=True) 