/**
 * Created by guramritpal on 25/3/17.
 */

angular.module("services", []).factory('activityService', function ($resource) {
        // using Resource for Restful services
        return {
            getActivity:function (user) {
                return $resource('/tracking-web/api/user/:activity',{user: '@user'})
                    .get({user:user});
            }
        };
    }
);
