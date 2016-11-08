// declare a module
var myAppModule = angular.module('myApp', ['ui.router']);
myAppModule.config(['$urlRouterProvider','$stateProvider',function($urlRouterProvider, $stateProvider){
	var home={
		name: 'home',
		url: '/home',
		templateUrl: 'pages/homePanel.html'
	}
	var messages={
			name: 'messages',
			url: '/messages',
			templateUrl: 'pages/msgPanel.html'
		}
	var myAccount={
			name: 'myAccount',
			url: '/account',
			templateUrl: 'pages/accountPanel.html'
		}

	$stateProvider.state(home);
	$stateProvider.state(messages);	
	$stateProvider.state(myAccount);
	
	$urlRouterProvider.otherwise('/home');
}]);
