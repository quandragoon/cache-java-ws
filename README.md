# Project Cache

## Run Docker
First, build the image:

    $ docker build -t cache .

Then start the image 'cache':

    $ docker run -d -p 6080:8080 cache

Then hit http://192.168.99.101:6080
