/**
 * Created by guramritpal on 25/3/17.
 */
'use strict';

angular.module("controllers", []).controller('activityController', function ($scope, activityService) {
    // using http service but prefer resource now to consume RESTful services
    /*$scope.getActivity = function getActivity() {
        var activity = $scope.search;
        activityService.getActivity(activity).then(function successCallback(response) {
            // this callback will be called asynchronously
            // when the response is available
            console.log(response.data);
            $scope.activities = response.data;
        }, function errorCallback(response) {
            // called asynchronously if an error occurs
            // or server returns response with an error status.
            console.log("Failed");

        });
    }*/
    $scope.getActivity = function getActivity() {
        $scope.activity = activityService.getActivity($scope.search);
     }
});


