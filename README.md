#Prerequisites
- jdk 8+ 
- gradle distribution / gradle wrappers with v6.7

#Context
This service will return this severs time, date and timezone.
Since no complex logic is required or manipulation is required.
System's time, date and timezone is automatically set when a serverdetails object is instantiated and returned to the client 
upon calling the endpoint '/server/details'.
This contains tests on application context, controller and dto.
This contains jacoco plugin that can extract report on code coverage.
This project can be run via the ff.
- docker
- plain java artifact e.g. jar file
- bootRun gradle task - run via springboot plugin on gradle

This backend service is hosted on heroku and can be accessed directly by this url https://server-details-bff.herokuapp.com/server/details

## Run locally
- via Jar
    - ```gradle build``` / ```./gradlew build```
    - run jar from ./build/libs/*SNAPSHOT.jar
  
- via SpringbootPlugin
    - ```gradle bootRun```
  
- via Docker NOTE: need to have a docker binaries installed
  - ```docker build -t <repo_path>:<tag> .```
  - ```docker run --name myapp <container name>:<tag>```