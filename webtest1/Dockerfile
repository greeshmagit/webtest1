FROM tomcat:9
LABEL app=webtest
COPY webtest1/target/webtest.war /usr/local/tomcat/webapps/webtest.war

FROM jenkins/ssh-agent
ENTRYPOINT ["Jenkins" , "Jenkins"]


