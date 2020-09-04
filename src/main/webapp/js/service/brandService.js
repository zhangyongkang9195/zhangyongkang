app.service('brandService',function ($http) {


    this.findAll = function () {
        return $http.get('../shangController/getAll.do');
    }



});