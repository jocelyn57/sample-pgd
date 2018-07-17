FROM tomcat:8.5
ADD pgd-service-0.0.1-SNAPSHOT.war /usr/local/tomcat/webapps/service.war
CMD ["catalina.sh", "run"]

# ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /service.jar" ]
