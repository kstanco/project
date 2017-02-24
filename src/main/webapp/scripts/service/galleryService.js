var module = angular.module('myApp');

module.service('galleryService', ['$http', '$q', function($http , $q){
	var self = this;
	var photos;
	var defer = $q.defer();
	var baseUri = 'http://localhost:8081/project/api/' 
	
	self.getPhotos = function() {
		//get photos n insert into array
		$http.get(baseUri + 'findphotos')
		   .success(function(data){
			  defer.resolve(data);
		});
		return defer.promise;
	};
	
	self.postPhotos = function(fileBlob) {
		$http.post(baseUri + 'postphotos', fileBlob);
//		 .success(function(data){
//			  defer.resolve(data);
//		});
//		return defer.promise;
	};
}]);