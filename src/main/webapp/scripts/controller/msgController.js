// declare a controller
angular.module('myApp').controller("msgController", ['$q', function($q){
	var self=this;
	
	var listMessages=[
		"message1",
		"message2",
		"message3"
	];
	
    self.getMessages = function() {
    	var promise = messages();
    	promise.then(function() {
    	      self.listMessages = listMessages;
    	    });	
    };
	
    var messages = function() {
    	return $q(function(resolve) {
			setTimeout(function(){ 
              resolve();
		    }, 3000);
    	});
    };
 
    
}]);