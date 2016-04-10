# Project Cache

## Run Docker
First, build the image:

    $ docker build -t cache .

Then start the image 'cache':

    $ docker run -d -p 6080:8080 cache

Then hit http://192.168.99.101:6080

## Test new changes
First, package it:
  
    $ mvn clean package

Then, copy the .war file to container. Run '$ docker ps' to see the container's name.

    $ docker cp target/cache-java-ws-1.0-SNAPSHOT.war <container>:/var/lib/jetty/webapps/ROOT.war

Restart the container:

    $ docker restart <container>


