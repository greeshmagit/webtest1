FROM tomcat:9
LABEL app=webtest
COPY webtest1/target/webtest.war /usr/local/tomcat/webapps/webtest.war

FROM jenkins/ssh-agent
RUN  apk add git
     echo "Jenkins:Jenkins && \
     chown -R jenkins:jenkins /home/jenkins/.ssh/
COPY .ssh/authorized_keys /home/jenkins/.ssh/authorized_keys


