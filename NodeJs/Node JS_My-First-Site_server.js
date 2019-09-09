/**
 * Created by KHUSRAV on 10.09.2017.
 */
var http = require('http');
var url = require('url');
http.createServer(function (req , res) {
     var data = '' ;
     var input = url.parse(req.url);

     if(input.query){
         var w = input.query.split('=');
         if(w[1] == 'john'){
             data = '[{ "name" : "john" , "age" : 20 , "admin" : true}]';
         }
         else if (w[1] == 'ivan'){
             data = '[{ "name" : "ivan" , "age" : 22 , "admin" : false}]';
         }
         else {
             data = '[{ "name" : "KHUSRAV" , "age" : 17 , "admin" : true}]';
         }
     }
     res.writeHead(200 , {"Content-Type" : "application/json"});
     res.write(data.toString());
     res.end();

}).listen(9090);