# import Flask
from flask import Flask, render_template, redirect, request, session, flash

app = Flask(__name__)
app.secret_key = "ThisIsSecret!"

@app.route('/', methods=['GET'])
def index():
    return render_template("index.html")

@app.route('/result', methods=['POST'])
def submit():
    print(request.form)
    if len(request.form['yourname']) < 1:
        flash("Please enter your name, the field cannot be blank!")
        return redirect('/')
    elif (len(request.form['comment']) > 125):
        flash("Your comment is required less than 125 charaters")
        return redirect('/')
    else:
        return render_template("indexresult.html")
    
    
if __name__=="__main__":
    app.run(debug=True)