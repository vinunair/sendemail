**Problem**
Send email with support for two implementations. The application should try with one email implementation and in case of failure should fallback to second implementation.
  
**TODO**
1. Supports only one email recipient for TO,CC and BCC fields. To add multiple email recipients need to write custom validation for validating multiple email recipients.
1. Better to configure timeouts for http api call.
1. Exception handling need to better with the ability to figure out network/service down scenario from bad request.
1. The API is synchronous but better approach is to handle it asynchronously. Create a thread pool for email requests and once we get a proper email request object assign a thread to send email. 
1. Write test case

**Setup**
1. git clone https://github.com/vinunair/sendemail.git
1. cd sendemail
1. mvn clean install
1. mvn package && java -jar target/sendemail-0.0.1-SNAPSHOT.jar 

**Sample Request**

curl -d '{"to":"mailvinu@gmail.com","body":"Hello there!","subject":"Hi"}' -H 'Content-Type:application/json' -v -X POST localhost:8080/sendemail/
