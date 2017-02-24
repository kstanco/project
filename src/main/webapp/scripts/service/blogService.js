var module = angular.module('myApp');

module.service('blogService', ['$http', '$q', function($http, $q){
	var self = this;
	var blogList;
	var defer = $q.defer();
	
	self.getBlogs = function() {
		$http.get('http://localhost:8081/project/api/getblogs')
		  .success(function(responseData){
		     defer.resolve(responseData);
	    });
	    return defer.promise;
	};	
}]);