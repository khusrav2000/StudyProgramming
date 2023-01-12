/**
 * Created by KHUSRAV on 06.09.2017.
 */
var fs = require('fs');

var cont = fs.readFileSync('rew.txt');

console.log(decodeURIComponent(cont));

console.log("The End");