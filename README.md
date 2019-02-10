
1. git clone https://github.com/vinunair/sendemail.git
2. cd sendemail
3. mvn clean install
4. mvn package && java -jar target/sendemail-0.0.1-SNAPSHOT.jar 

Sample Request
curl -d '{"to":"mailvinu@gmail.com","body":"Hello there!","subject":"Hi"}' -H 'Content-Type:application/json' -v -X POST localhost:8080/sendemail/
