#! env /bin/sh

# proper modules but still dependency on impl!

java -p example.api/target/classes:example.impl/target/classes:example.app/target/classes -m example.app/org.example.app.Main
