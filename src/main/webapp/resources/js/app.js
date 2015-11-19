/*********************************************
 *** Config app
 *********************************************/

angular.module("app", [
    'ngRoute',
    'ngResource',
    'app.services',
    'app.controllers'
    ])
    .config(['$routeProvider', function($routeProvider) {
        $routeProvider.
            when('/events', {
                templateUrl: 'events.htm',
                controller: 'EventCtrl'
            }).
            otherwise({
                redirectTo: '/events'
            });
    }]);


/*********************************************
 *** Services
 *********************************************/
angular.module('app.services', []);

angular.module('app.services').factory("EventFactory", function($resource) {
    return $resource('/events', {}, {
        query: { method: 'GET', params: {}, isArray: true }
    })

});

/*********************************************
 *** Controllers
 *********************************************/
angular.module('app.controllers', []);

angular.module('app.controllers').controller('EventCtrl', ['$scope', '$http', 'EventFactory',
    function($scope, $http, EventFactory) {
        EventFactory.query(function (data) {
            $scope.events = data;
        })
}]);