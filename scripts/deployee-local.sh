#!/bin/bash
cd /Users/twer/project/zboDoSpringMVC
mvn package
cp /Users/twer/project/zboDoSpringMVC/target/zboDoSpringMVC.war /Users/twer/project/Software/jetty-distribution-9.2.6.v20141205/webapps
cd /Users/twer/project/Software/jetty-distribution-9.2.6.v20141205/
#java -jar start.jar