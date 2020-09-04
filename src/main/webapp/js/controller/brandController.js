app.controller('brandController',function ($scope,$controller,brandService) {
  //  $controller('baseController',{$scope:$scope});

    $scope.findAll = function () {
        brandService.findAll().success(function (response) {
            $scope.list = response;
        })
    }




});