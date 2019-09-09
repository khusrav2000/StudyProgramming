/**
 * Created by KHUSRAV on 07.09.2017.
 */
var http = require('http');
var fs = require('fs');
http.createServer(function (req , res) {
    res.writeHead(200 ,
        {'Content-type' : 'text/html;charset = utf-8'});
    res.write("Привет от Хусрава");
    fs.readFile('index.html' , function (err , cont) {
        res.write(decodeURIComponent(cont));
        res.end();
    })
}).listen(8080);