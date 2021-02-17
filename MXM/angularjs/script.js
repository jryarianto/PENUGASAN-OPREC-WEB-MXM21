var app = angular.module('getQuote', []);
app.controller('getQuote', function ($scope, $http) {
    $scope.newQuote = function(){
        $scope.quote = Randomquote.get();
    };

    $http({
        method: 'GET',
        url: 'http://api.quotable.io/random',
        data: 'parameters'
    }).then(function success(response) {
        // this function will be called when the request is success
        console.log("sad");
    }, function error(response) {
         // this function will be called when the request returned error status
         alert("gabisabos");
    });
});


