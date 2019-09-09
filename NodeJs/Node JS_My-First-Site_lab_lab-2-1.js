/**
 * Created by KHUSRAV on 07.09.2017.
 */
var http = require('http');

var server = http.createServer().listen(8080);

server.on('request' , function(req , res){
   console.log("Request: " , req.method , req.url);
   console.log("Status: " , res.statusCode);
});

server.on('request' , function(req , res){
    res.writeHead(200);
    res.write("Hello from Node.js");
    res.end();
});

server.on('listening' , function () {
   console.log("Listen port 8080...");
});

server.on('connection' , function () {
   console.log('Connect...');
});