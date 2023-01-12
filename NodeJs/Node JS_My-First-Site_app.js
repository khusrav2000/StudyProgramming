/**
 * Created by KHUSRAV on 10.09.2017.
 */
var express = require('express');
var app = express();

app.listen(8080);
app.set('views' , __dirname);
var names = {'KHUSRAV' : 'Admin' ,
             'Shohin' : 'User' ,
             'John' : 'User'
            };
app.get('/' , function (req , res) {
    res.sendfile(__dirname + '/test.html');
});

app.get('/user/:name' , function (req , res) {
    var ro ;

    if(req.params.name in names)
        ro = names[req.params.name];
    else
        ro = 'Error';


    res.render('user.ejs' , {
        name:req.params.name ,
        role: ro
    });
    res.end();
});