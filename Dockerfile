FROM tomcat:latest

LABEL "MAINTAINER"="Arik Bidny"

COPY ./webapp.war /usr/local/tomcat/webapps

