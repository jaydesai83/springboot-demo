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
