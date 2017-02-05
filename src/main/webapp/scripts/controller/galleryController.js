// declare a controller
angular.module('myApp').controller("galleryController", ['galleryService', '$scope' ,'photos', function(galleryService, $scope, photos){
	var self=this;
	
	$scope.photos=photos
	
//	$scope.$watch('photos', function (photos){
		self.photos = photos;
		self.selectedPhoto = self.photos[0];
//	});	
	
	self.selectPhoto= function(selectedPhoto){
		self.selectedPhoto = selectedPhoto;
	}

}]);