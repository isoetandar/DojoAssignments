from flask import Flask, render_template
app = Flask(__name__)
@app.route('/play/<numb>')
def index(numb):
    return render_template("index.html", times = int(numb))

app.run(debug=True)