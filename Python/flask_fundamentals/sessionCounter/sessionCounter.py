from flask import Flask, render_template, request, redirect, session
app = Flask(__name__)
app.secret_key = 'ThisIsSecret'
app.count =0

@app.route('/', methods=['POST'])
def index():
    session['count'] +=1
    return render_template('index.html', count=session['count'])  

if __name__ =="__main__":
    app.run(debug=True)