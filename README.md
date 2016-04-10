# Project Cache

## Install and set up Docker
First, download Docker and Docker Toolbox. Check that you have the commands 'docker-machine' and 'docker'.
Then, download Virtualbox and set up a VM:

    $ docker-machine create --driver virtualbox dev

Now that you have a VM called dev, run this to set the environment:

    $ eval $(docker-machine env dev)

Check the ip of the machine dev. This will be used to hit the entrypoints.

    $ docker-machine ip dev

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


