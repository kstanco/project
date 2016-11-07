// declare a module
var myAppModule = angular.module('myApp', ['ui-router']);
myAppModule.config(function(){
	var home={
		name: 'home',
		url: '/home',
		templateUrl: 'pages/homePanel.html'
	}
	var otherwise={
			name: 'otherwise',
			url: '/',
			templateUrl: 'pages/homePanel.html'
		}
//	$stateProvider.state(home);
//	$stateProvider.state(otherwise);
});