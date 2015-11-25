<html>
<head>
    <title>Event Pledger</title>
    <link href="resources/css/main.css" rel="stylesheet" type="text/css">
    <script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.2.15/angular.min.js"></script>
    <script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.2.25/angular-route.min.js"></script>
    <script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.2.25/angular-resource.min.js"></script>
    <script src="resources/js/app.js"></script>

</head>
<body>
<h2>Events</h2>
<div ng-app="app">
    <div ng-view></div>
    <script type="text/ng-template" id="events.htm">
        Search : <input type="text" ng-model="search"><br/><br/>
        <table border="0">
            <tr ng-repeat="events in events | filter : search">
                <td>{{ events.id }}</td>
                <td>{{ events.topic }}</td>
                <td>{{ events.description }}</td>
                <td>{{ events.price }}</td>
            </tr>
        </table>
    </script>
</div>
</body>
</html>