var HelloWorld = function() {};

HelloWorld.prototype.say = function(message, success, fail) {
    cordova.exec(success, fail, 'HelloWorldPlugin', 'say', [message]);
};

var helloWorld = new HelloWorld();
module.exports = helloWorld;