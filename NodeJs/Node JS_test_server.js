var http = require('http');
var url = require('url');
function ServerStart() {
    function onRequest(request , response) {
        var pathname = url.parse(request.url).pathname;
        console.log("Request for " + pathname + " received.");
        route(pathname);
        response.writeHead(200, {"Content-Type": "text/plain"});
        response.write("Hello world");
        response.end();

    }

    http.createServer(onRequest).listen(8080);

    console.log("Server started");
}

exports.start = ServerStart ;