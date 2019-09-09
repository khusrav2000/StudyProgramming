/**
 * Created by KHUSRAV on 11.09.2017.
 */
var url = require('url');
var request = require('request');
var express = require('express');
var ejs = require('ejs');
var MY_IP = '185.42.96.235';
var app = express();
app.listen(8080);
app.set('views' , __dirname);
