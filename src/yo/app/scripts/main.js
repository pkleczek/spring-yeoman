var myApp = angular.module('weatherApp', ['ngResource']);
myApp.controller('WeatherCtrl', ['$scope','$resource', function ($scope, $resource) {
    'use strict';

    var weatherProvider = $resource('weather');

    $scope.getWeather = function () {
        var weatherInfo = weatherProvider.get();
        $scope.weatherResult = weatherInfo;
    };

}]);

