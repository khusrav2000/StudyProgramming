/**
 * Created by KHUSRAV on 03.09.2017.
 */
var server = require("./server");
var router = require("./router");

server.start(router.route);