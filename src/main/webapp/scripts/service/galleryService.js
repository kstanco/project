var module = angular.module('myApp');

module.service('galleryService', ['$http', '$q', function($http , $q){
	var self = this;
	var photos;
	var defer = $q.defer();
	
	self.getPhotos = function() {
		//get photos n insert into array
		$http.get('http://localhost:8080/project/api/getphotos')
		   .success(function(data){
			  defer.resolve(data);
		});
		return defer.promise;
	};	
}]);