# Pull base image
From jetty:9

# Copy to images tomcat path
ADD ./target/*.war /var/lib/jetty/webapps/ROOT.war
