#!/bin/sh

if [ ! -x "./gradlew" ]; then
    chmod +x ./gradlew
fi

./gradlew bootRepackage


rm -rf /usr/local/tomcat/springboot/webapps/ROOT*
cp ./build/libs/ROOT.war /usr/local/tomcat/springboot/webapps/ROOT.war

