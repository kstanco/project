// declare a controller
angular.module('myApp').controller("navbarController", ['$scope',function($scope){
	var self=this;
	self.authenticated = false;
	
    self.setAuthenticated = function(login) {
    	self.authenticated = login;
    	console.log(login);
    }; 
	
}]);