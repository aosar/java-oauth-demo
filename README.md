# Barebones Java OAuth2 Demo Project
To use this thing:

### Build & Run
```
mvn clean package
java -jar target/oauth-demo-0.0.1-SNAPSHOT.jar
```

### Authentication Code Flow
1. Navigate to
```
http://localhost:8080
```

2. Make sure you have your callbacks set properly on the IDP side.
Verify info at
```
https://login.microsoftonline.com/<tenant-id>/v2.0/.well-known/openid-configuration
```
3. Consent