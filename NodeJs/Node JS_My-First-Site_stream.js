/**
 * Created by KHUSRAV on 09.09.2017.
 */
http = require('http').createServer().listen(8080);

http.on('request' , function (req, res) {
   res.writeHead(200);
   res.write('Start');
   setTimeout(function () {
      res.write('Finish');
      res.end();
   } , 4000);
});