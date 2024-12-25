# springBootUsingHTTPS
Demonstration of HTTPS API request using Spring security

1)cerate a self signed certificate and add it into application.properties, it will help server to validate incoming request from client using the public key.

2)certificate creation : keytool -genkeypair -alias mylocalcert -keyalg RSA -keysize 2048 -storetype PKCS12 -keystore keystore.p12 -validity 365

3)location of certificate in application.properties : server.ssl.key-store=classpath:keystore.p12

4)Use Postman for sending HTTPS request for validation
