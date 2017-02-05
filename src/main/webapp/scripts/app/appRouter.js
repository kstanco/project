angular.module('myApp').config(['$urlRouterProvider','$stateProvider',function($urlRouterProvider, $stateProvider){
	var home={
		name: 'home',
		url: '/home',
		templateUrl: 'pages/homePanel.html',
		controller: 'blogController',
		controllerAs: 'blog',
		resolve: {
        	blogs: ['blogService', function(blogService){
        		return blogService.getBlogs();
        	}]
        }
	}
	var messages={
			name: 'messages',
			url: '/messages',
			templateUrl: 'pages/msgPanel.html',
			controller: 'msgController',
			controllerAs: 'message'
		}
	var myAccount={
			name: 'myAccount',
			url: '/account',
			templateUrl: 'pages/accountPanel.html'
		}
	var gallery={
			name: 'gallery',
			url: '/gallery',
			templateUrl: 'pages/gallery.html',
			controller: 'galleryController',
	        controllerAs: 'gallery',
	        resolve: {
	        	photos: ['galleryService', function(galleryService){
	        		return galleryService.getPhotos();
	        	}]
	        }
		}
	$stateProvider.state(home);
	$stateProvider.state(messages);	
	$stateProvider.state(myAccount);
	$stateProvider.state(gallery);
	
	$urlRouterProvider.otherwise('/home');
}]);
