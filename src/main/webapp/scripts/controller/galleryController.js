// declare a controller
angular.module('myApp').controller("galleryController", ['galleryService', '$scope' ,'photos', function(galleryService, $scope, photos){
	var self=this;
	var LOADING = 1;
	
	$scope.photos=photos
	
//	$scope.$watch('photos', function (photos){
		self.photos = photos;
		self.selectedPhoto = self.photos[0];
//	});	
	
	self.selectPhoto= function(selectedPhoto){
		self.selectedPhoto = selectedPhoto;
	}

	self.fileChanged = function (files) {
		var i = 0;
		self.files = files.files;	  
	    var localFileBlobs = [];
		r = new FileReader();
	   
	    r.onloadend = function(e){
	    	i++;
	    	localFileBlobs.push(e.target.result);
	    	if (i < self.files.length) {
	    		r.readAsDataURL(self.files[i]);
	    	}else{
	    		$scope.$apply(function(){
	    			self.fileBlobs = localFileBlobs;
	    			
	    		});
	    	}
	    }
	 	r.readAsDataURL(self.files[i]);
	   
	 }
	
	
	self.submitPhoto= function() {
		galleryService.postPhotos(self.fileBlob);
	}
}]);