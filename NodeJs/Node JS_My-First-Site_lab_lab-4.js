/**
 * Created by KHUSRAV on 10.09.2017.
 */
 var get = require('./get-file.js');

var http = require('http');

http.createServer(function (req , res) {
    res.writeHead(200 , {'content-type' : 'image/gif'});
    var file = get.getFile('pict.jpg');
    file.pipe(res);
}).listen(8080);