/**
 * Created by KHUSRAV on 09.09.2017.
 */
var fs = require('fs');

var file = fs.createReadStream('rew.txt');

var newFile = fs.createWriteStream('rew-1.txt');

file.pipe(newFile);