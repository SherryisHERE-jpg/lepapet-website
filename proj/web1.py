from operator import index
from flask import Flask, render_template
app = Flask(__name__)

@app.route('/')
def index():
    return render_template(index.html)

@app.route('/About')
def About():
    return render_template(About.html)

@app.route('/Why')
def Why():
    return render_template(Why.html)

@app.route('/pic')
def Why():
    return render_template(pic.html)

if __name__ == '__main__':
    app.run()