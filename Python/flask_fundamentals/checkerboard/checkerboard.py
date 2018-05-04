from flask import Flask, render_template
app = Flask(__name__)
@app.route('/play/<num1>/<num2>')
def index(num1,num2):
    return render_template("index.html", row = int(num1), column=int(num2))

app.run(debug=True)