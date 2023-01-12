/**
 * Created by KHUSRAV on 09.09.2017.
 */
var fs = require('fs');

var http = require('http');

http.createServer(function (req , res) {
    res.writeHead(200 , {'content-type' : 'image/gif'});
    var file = fs.createReadStream('pict.jpg');
    file.pipe(res);
}).listen(8080);


//var file = fs.createReadStream('index.html');

/*file.on('data' , function (txt) {
   console.log(txt.toString());
});*/
//file.pipe(process.stdout);