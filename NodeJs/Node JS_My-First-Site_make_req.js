/**
 * Created by KHUSRAV on 10.09.2017.
 */
var http = require('http');
var respon = function (msg) {
    console.log('Request');

    var options = {
        host: 'localhost',
        port: 8080,
        path: '/',
        method: 'POST'
    };

    var request = http.request(options, function (response) {
        console.log('Respons start');
        response.on('data', function (data) {
            console.log(data.toString());
        });
    });
    request.write(msg);
    request.end();
}

exports.respon = respon ;