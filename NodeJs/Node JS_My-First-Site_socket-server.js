/**
 * Created by KHUSRAV on 12.09.2017.
 */
var socket = require('socket.io');
var express = require('express');
var app = express();
var io = socket.listen(app.listen(8080));
app.get('/' , function (req , res) {
    res.sendfile(__dirname + '/index.html');
});

io.sockets.on('connection' , function (client) {
   // console.log('Connect');

    client.on('message' , function (data) {
       console.log(data);
      // client.emit('hello' , {hello : 'privet ' + data});
      // client.broadcast.emit('hello' , {hello : 'privet ot ' + data});
        io.sockets.emit('hello' , {hello: 'privet vsem'});
    });
});