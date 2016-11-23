Access end point as follows ->

http://{url-endpoint}/helloworld

=======
Locally
=======
To build:
mvn package

To run:
java -jar target/demo-sb-war-0.0.1-SNAPSHOT.war

=======
Bluemix
=======
To build:
Select the Maven build method

To deploy:
add "-p demo-sb-war-0.0.1-SNAPSHOT.war" to the cf push command

======
Docker
======
Locally:
docker build --tag=pt-sb-wardemo .
docker run -it --publish 8080 --publish 9990 --name pt-sb-wardemo pt-sb-wardemo
docker ps
  - record ports
app: localhost:<mapped 8080 port>/demo-sb-war-0.0.1-SNAPSHOT/helloworld
admin: localhost:<mapped 9990 port>/console
  - login with admin/password

Bluemix:
(after building locally)
docker tag pt-sb-wardemo registry.ng.bluemix.net/tuton/pt-sb-wardemo
docker push registry.ng.bluemix.net/tuton/pt-sb-wardemo
cf ic run --publish 8080 --publish 9990 --name pt-sb-wardemo registry.ng.bluemix.net/tuton/pt-sb-wardemo
  - grab the container-id from the result
cf ic ip bind 169.44.11.162 <container-id>
ip:8080/demo-sb-war-0.0.1-SNAPSHOT/helloworld
