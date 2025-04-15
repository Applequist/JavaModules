#! env /bin/sh

# example.app is an automatic module 
# example.api and example.impl are on the class-path and hence 
# in the *unamed* module which is read by the *automatic* example.appp module.

java -p example.app/target -cp example.api/target/classes:example.impl/target/classes -m example.app/org.example.app.Main

