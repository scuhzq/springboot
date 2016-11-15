#!/bin/sh

if [ ! -x "./gradlew" ]; then
    chmod +x ./gradlew
fi

./gradlew bootRepackage

/etc/init.d/springbootd stop

rm -rf /usr/local/tomcat/springboot-tomcat8/webapps/ROOT*
cp ./build/libs/ROOT.war /usr/local/tomcat/springboot-tomcat8/webapps/ROOT.war

/etc/init.d/springbootd start