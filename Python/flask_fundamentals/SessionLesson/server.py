from flask import Flask, render_template
app = Flask(__name__)



@app.route('/')
def index():
    return render_template("index.html", phrase="hello", times=5)

@app.route('/show')
def show_user():
  return render_template('user.html', name='Jay', email='kpatel@codingdojo.com')




if __name__=="__main__":
    app.run(debug=True)
