## Location CRUD Operation

* Creates the project
* Created entity for Location Table
* Created repository for Location
* Created Location Service Interface
* Implemented Location Service Interface
* Created Location Controller
* Created views & updated application.properties
* Run the application
```
http://localhost:8080/location/showCreate
```
 * Display all the saved locations
```
http://localhost:8080/location/displayLocations 
```
* Delete or Edit Location from display locations


## Sending Mail on Location Save

* Added spring mail dependency.
* Created mail utility interface & 
  implemented it.
* Configured properties for sender email.
* Made the sender email less secure.
```
https://www.google.com/settings/security/lesssecureapps
```
* Send email after save in controller.

## Use JFreeChart(a third party app)

* Added dependency.
* Created report utility interface & implementation.
* Created an endpoint in controller.
```
http://localhost:8080/location/generateReport
```
* Generated an image & display.


## Location REST Service(CRUD)

* Created a rest controller.
* Created different methods for different usages.
* Get all locations(GET)
```
http://localhost:8080/location/locations
```
* Save a location(POST)
```
http://localhost:8080/location/locations
```
* Update a location(PUT)
```
http://localhost:8080/location/locations
```
* Delete a location(DELETE)
```
http://localhost:8080/location/locations/id
```
* Get a location(GET)
```
http://localhost:8080/location/locations/id
```