FROM centos-jdk8:3.0
MAINTAINER bonade
ADD demo-mq-1.0.0.jar demo-mq-1.0.0.jar
ENTRYPOINT ["java","-jar","-Duser.timezone=GMT+8","-Dfile.encoding=UTF-8","/demo-mq-1.0.0.jar"]
