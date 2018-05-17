from flask import Flask, render_template, request, redirect, session, flash
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
mysql = connectToMySQL('thewall')
# now, we may invoke the query_db method

@app.route('/', methods=['GET'])
def index():
    return render_template('index.html')

@app.route('/Registration', methods=['POST'])
def confirm():
    session.clear()
    session['counter']=0
    pw = request.form['password']
    pw_hash = bcrypt.generate_password_hash(pw)
    pw_hash = str(pw_hash).strip('b').replace("'","")

    if len(request.form['first_name']) <= 2 :
        session['first_name'] = "First Name must have at least 3 characters"
        session['counter']+=1
    if len(request.form['last_name']) <=2 :
        session['last_name'] = "Last Name have must at least 3 characters"
        session['counter']+=1
    if not EMAIL_REGEX.match(request.form['email']):
        session['email'] = "Invalid Email Address!"
        session['counter']+=1
    if len(request.form['password']) <= 5:
        session['password_char'] = 'Password must have at least 6 long characters!'
        session['counter']+=1
    if (request.form['password']!= request.form['confirmPassword']):
        session['password'] = "Password is not mactch"
        session['counter']+=1
    # TroubleshootMessage(message="Registration")
    if session['counter'] != 0:
        session['errors'] ="Your have" +" "+str(session['counter'])+" " + "errors input Registration"
        return redirect('/')
    else :
        query = "INSERT INTO users (first_name, last_name, email, password, created_at, updated_at) VALUES (%(first_name)s, %(last_name)s, %(email)s, %(password)s, NOW(), NOW());"
        data = {
            'first_name': request.form['first_name'],
            'last_name': request.form['last_name'],
            'email': request.form['email'],
            'password': pw_hash
            }
        mysql.query_db(query, data)
        return render_template('confirm.html')
    # Test Session:
    # session['first_name'] = request.form['first_name']
    # session['last_name'] = request.form['last_name']
    # session['email']= request.form['email']
    # session['password']= request.form['password']
    # session['confirmPassword']= request.form['confirmPassword']

@app.route('/Login', methods=['POST'])
def success_login():
    if not EMAIL_REGEX.match(request.form['email_log']):
        session['email_log'] = "Invalid Email Address!"
        return redirect('/')


    query = "SELECT password, id FROM users WHERE email = %(email)s;"
    data = { "email" : request.form["email_log"] }
    # print(data) #visual check the content of data
    fetch = mysql.query_db(query, data)
    session['id'] = fetch[0]['id']
    # print(fetch) #visual check the content of fetch password hashing.
    if fetch:
        if bcrypt.check_password_hash(fetch[0]['password'], request.form['password_log']):
            # session['useremail'] = request.form['email_log']
            return render_template('message.html')
    session['error_log'] = "Either your email and/or your password are incorrect, no permission to log in!"
    return redirect('/')

@app.route('/process', methods=)
def postmessage():
    users_id = session['id']
    print("number1")
    querymessage = "INSERT INTO messages (users_id, message, created_at, updated_at) VALUE (%(users_id)s, %(message)s, NOW(), NOW());"
    data = {
            'users_id': users_id,
            'message': request.form['message']
            }
    mysql.query_db(querymessage, data)
    return redirect('/Wall')

@app.route('/Wall', methods=['POST'])
def displaymessage():
    print("number2")
    # query = "SELECT message FROM messages;"
    messagetext = mysql.query_db("SELECT message, id FROM messages")
    session['messages_id'] = messagetext[0]['id']
    commenttext = mysql.query_db("SELECT comment FROM comments")
    # print(message_info)
    return render_template('message.html',  textmessage = messagetext, textcomment = commenttext)

# @app.route('/postcomment', methods=['GET'])
# def displaycomment():
#     print("number3")
#     users_id = session['id']
#     message_id = session['message_id']
#     querycomment = "INSERT INTO comments (users_id, message_id, comment, created_at, updated_at) VALUE (%(users_id)s, %(messages_id)s, %(comment)s, NOW(), NOW());"
#     data = {
#             'users_id': users_id,
#             'messages_id': message_id,
#             'comment': request.form['commenttext']
#             }
#     mysql.query_db(querycomment, data)
#     return redirect('/Wall')

@app.route('/getBack', methods=['GET'])
def getback():
    ession.clear()
    return redirect('/')

def TroubleshootMessage(message=""):
    print("\n\n------------", message, "--------------")
    print('REQUEST.FOR', request.form)
    print('SESSION;',session)
    print(session['counter'])

if __name__ == "__main__":
    app.run(debug=True)