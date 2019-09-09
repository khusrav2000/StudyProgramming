/**
 * Created by KHUSRAV on 10.09.2017.
 */
var fs = require('fs');
function getFile(name) {
    return fs.createReadStream(name);
}

exports.getFile = getFile ;