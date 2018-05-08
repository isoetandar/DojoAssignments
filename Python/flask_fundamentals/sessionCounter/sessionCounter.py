from flask import Flask, render_template, request, redirect, session
app = Flask(__name__)
app.secret_key = 'ThisIsSecret'

@app.route('/')
def index():
    if 'count' not in session:
        session['count']=0
    else: session['count']+=1
    print(session)
    return render_template('index.html', count=session['count']) 

@app.route('/show' , methods=['POST'])
def add2():  
    session['count'] +=2 
    return redirect('/')

@app.route('/reset' , methods=['POST'])
def reset():
    session.clear()   
    return redirect('/')

if __name__ =="__main__":
    app.run(debug=True)