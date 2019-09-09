/**
 * Created by KHUSRAV on 09.09.2017.
 */
var event = require('events').EventEmitter;
var logger = new event();
var users = [] , msgs = [] ;

logger.on('login' , function (user) {
   console.log('New user' , user);
   users.push(user);
});

logger.on('message' , function (msg) {
    console.log('message' , msg);
    msgs.push(msg);
});

logger.on('getUsers' , function () {
   console.log('Users:');
   console.log(users.join('\n'));
});

logger.on('getMsgs' , function () {
   console.log('Messages:');
   console.log(msgs.join('\n'));
});

/////////////////////////////

logger.emit('login' , 'KHUSRAV');
logger.emit('message' , 'Hello from KHUSRAV');
logger.emit('login' , 'SHOHIN');
logger.emit('message' , 'Hello from SHOHIN');
logger.emit('getUsers');
logger.emit('getMsgs');