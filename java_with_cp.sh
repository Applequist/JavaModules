#! env /bin/sh

java -cp example.api/target/org.example.api-1.0-SNAPSHOT.jar:example.impl/target/org.example.impl-1.0-SNAPSHOT.jar:example.app/target/org.example.app-1.0-SNAPSHOT.jar org.example.app.Main
