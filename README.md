# SpringTut
Spring boot tutorial beginner


#### Spring initializer

 - [Spring](https://start.spring.io)

To run the app:

```
./mvnw spring-boot:run
```

If working with Maven
Using the Maven tab ( in Intellif IDEA )
```
workFolder->Lifecicly->install
```
This generates a target folder within the project...
We can start the environment with a .jar file
 - projectName-0.0.Nr-SNAPSHOT.jar
./target/projectName-0.0.Nr-SNAPSHOT.jar
```$xslt
java -jar projectName-0.0.Nr-SNAPSHOT.jar
```

## Create a POSTGRES Database ( Docker )
```$xslt
simple password | -d - detached in the background | -p set ports 
docker run --name postgres-spring -e POSTGRES_PASSWORD=password -d -p 5432:5432 postgres:alpine
```
Verify the docker container was created:
```docker ps```
```docker port postrgres-spring```
We are exposing the container port to the outside world on port 5432 ( default port on Postgres )

Get into docker image:
docker exec -it DOCKER_ID bin/bash
Postgress Basics....
 - psql
 - psql -U postgres
 - \l
 
postgres=# CREATE DATABASE demodbpostgres;

postgres=# \c demodbpostgres;
You are now connected to database "demodbpostgres" as user "postgres".

 - \d
 - \dt
 - \ TABLE_NAME
 
 demodbpostgres=# SELECT uuid_generate_v4();
 ERROR:  function uuid_generate_v4() does not exist
 LINE 1: SELECT uuid_generate_v4();
                ^
 HINT:  No function matches the given name and argument types. You might need to add explicit type casts.
 demodbpostgres=# CREATE EXTENSION "uuid-ossp";
 CREATE EXTENSION
 demodbpostgres=# SELECT uuid_generate_v4();
            uuid_generate_v4           
 --------------------------------------
  4a4073b3-4a77-4271-b795-9ac83229f114
 (1 row)
