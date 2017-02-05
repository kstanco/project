// declare a controller
angular.module('myApp').controller("blogController", ["$scope", "blogs", function($scope, blogs) {
	var self=this;
	
	self.blogPosts = blogs 
//	$scope.$watch('blogPosts', function(newValue) {
//		console.log(newValue); 
//		self.blogPosts = $scope.blogPosts;
//	});
}]);