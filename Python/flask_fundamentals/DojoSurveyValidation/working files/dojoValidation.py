from flask import Flask, render_template, request, redirect, flash
app = Flask(__name__)
app.secret_key = "ThisIsSecret!"

# our index route will handle rendering our form
@app.route('/')
def index():
    return render_template("index.html")

@app.route('/result', methods=['POST'])
def indexresult():
    print(request.form)
    if len(request.form['name']) < 1:
        flash("Please enter your name, the field cannot be blank!")
        return redirect('/')
    elif (len(request.form['comment'])>125):
        flash("Your comment is required between 5 to up 125 charaters")
        return redirect('/')
    else:
        return render_template("indexresult.html")

if __name__ =="__main__":
    app.run(debug=True) 