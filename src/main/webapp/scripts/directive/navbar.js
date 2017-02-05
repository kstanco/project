// declare a module
angular.module('myApp').directive('myNavbar', function() {
	  return {
	    templateUrl: 	'pages/navbar.html',
	    controller: 	"navbarController",
	    controllerAs: 	"navbar"
	  };
});