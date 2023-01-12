/**
 * Created by KHUSRAV on 07.09.2017.
 */
var http = require('http');
var server = http.createServer().listen(8080);

server.on('request' , function (req , res) {
    res.writeHead(200);
    res.write("Hello");
    res.end();
});
server.on('request' , function (req , res) {
    var x = require('url').parse(req.url , true);
    console.log(x);
    console.log("Request " , req.method , req.url);
});
server.on('listening' , function () {
    console.log('listening: 8080');
});

