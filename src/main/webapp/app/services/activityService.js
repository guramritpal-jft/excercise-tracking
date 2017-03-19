/**
 * Created by guramritpal on 25/3/17.
 */

angular.module("services", []).factory('activityService', function ($resource) {
        return {
            /*getActivities:function() {
                return $http({method:'GET',
                        url:'/tracking-web/api/activities/'
                    }
                )
            },*/
            /* getActivity: function (activity) {
             return $http({method:'GET',
             url:'/tracking-web/api/activities/'+activity
             }
             )
             },*/
            // using Resource for Restful services
            getActivity:function (activity) {
                return $resource('/tracking-web/api/activities/:activity',{activity: activity});
            }
        };
    }
);
