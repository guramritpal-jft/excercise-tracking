'use strict';

(function() {
    var app = window.angular.module("tracking-app", ['controllers', 'services', 'ngResource','ngRoute']);

    app.config(function($routeProvider) {
        $routeProvider
            .when("/", {
                templateUrl:"app/templates/home.html"
            })
            .when('/activities', {
                templateUrl:'app/templates/activities.html',
                controller: "activityController"
            })
    });
    /*app.config(['$resourceProvider', function($resourceProvider) {
     // Don't strip trailing slashes from calculated URLs
     $resourceProvider.defaults.stripTrailingSlashes = false;
     }]);*/
})();

