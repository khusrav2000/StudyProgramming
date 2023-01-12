/**
 * Created by KHUSRAV on 06.09.2017.
 */
var http = require('http');

function server(req , res) {
    res.writeHead(200);
    res.write("Server Started");
    res.end();
}

var foo = http.createServer(server);
foo.listen(8080);



console.log("Server Started");