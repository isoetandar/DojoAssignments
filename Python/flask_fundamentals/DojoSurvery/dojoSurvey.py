from flask import Flask, render_template, request, redirect
app = Flask(__name__)

# our index route will handle rendering our form
@app.route('/')
def index():
    return render_template("index.html")

@app.route('/result', methods=['POST'])
def indexresult():
    
    print(request.form)
    
    return render_template("indexresult.html")

if __name__ =="__main__":
    app.run(debug=True) 