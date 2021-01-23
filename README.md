#Prerequisites
- jdk 8+ 
- gradle distribution / gradle wrappers with v6.7

#Context
This project can be run via the ff.
- docker
- plain java artifact e.g. jar file
- bootRun gradle task - run via springboot plugin on gradle

## Run locally
- via Jar
    - ```gradle build``` / ```./gradlew build```
    - run jar from ./build/libs/*SNAPSHOT.jar
  
- via SpringbootPlugin
    - ```gradle bootRun```
  
- via Docker NOTE: need to have a docker binaries installed
  - ```docker build -t <repo_path>:<tag> .```
  - ```docker run --name myapp <container name>:<tag>```