from flask import Flask, render_template, request, redirect, flash
from flask_bcrypt import Bcrypt
# the "re" module will let us perform some regular expression operations
import re
# create a regular expression object that we can use run operations on
EMAIL_REGEX = re.compile(r'^[a-zA-Z0-9.+_-]+@[a-zA-Z0-9._-]+\.[a-zA-Z]+$')
# import the function connectToMySQL from the file mysqlconnections.py
from mysqlconnections import connectToMySQL


app = Flask(__name__)
app.secret_key = "ThisIsSecret!"
bcrypt = Bcrypt(app)
# invoke the connectToMySQL function and pass it the name of the database we're using
# connectToMySQL returns an instance of MySQLConnection, which we will store in the variable 'mysql'
mysql = connectToMySQL('emaildb')
# now, we may invoke the query_db method
# print("all emails", mysql.query_db("SELECT * FROM emails;"))

@app.route('/', methods=['GET'])
def index():
    
    all_emails = mysql.query_db("SELECT * FROM emaildb")
    print("Fetched all emails", all_emails)
    return render_template('index.html', emails = all_emails)

@app.route('/process', methods=['POST'])
def create():
    if len(request.form['emails']) < 1:
        flash("Email cannot be blank!")
    elif not EMAIL_REGEX.match(request.form['emails']):
        flash("Invalid Email Address!")
    else:
        query = "INSERT INTO emaildb (emails, created_at, updated_at) VALUES (%(emails)s, NOW(), NOW());"
        data = {
                'emails': request.form['emails']
            }
        mysql.query_db(query, data)
    
    return redirect('/')

app.run(debug=True)