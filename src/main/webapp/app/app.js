'use strict';

(function() {
   var app = window.angular.module("tracking-app", ['controllers', 'services', 'ngResource','ngRoute']);

   app.config(function ($routeProvider) {
      $routeProvider
          .when('/leftNav', {
             templateUrl:'app/templates/sidebar.html',
             controller: 'homeController'
          }).when('/home',{
          templateUrl:'app/templates/home.html',
          controller: 'homeController'
      })
   });
    /*app.config(['$resourceProvider', function($resourceProvider) {
        // Don't strip trailing slashes from calculated URLs
        $resourceProvider.defaults.stripTrailingSlashes = false;
    }]);*/
})();

