def call(user,ip,credId) {
     sshagent([credId]) {
                
                      //copy war//
                      /*sh "scp -o StrictHostKeyChecking=no webtest1/target/webtest.war ${user}@${ip}:/opt/tomcat/webapps"
                      sh "ssh -o StrictHostkeyChecking=no ec2-user@172.31.32.18 docker run -d -p 8080:8080 --name tomcat pgreeshma/webtest:v1"*/
                      sh "ssh -o StrictHostkeyChecking=no ${user}@${ip} docker run -d -p 8080:8080 --name tomcat pgreeshma/webtest:v1"
                      
                      /*shutdown tomcat server//
                      sh "ssh ${user}@${ip} /opt/tomcat/bin/shutdown.sh"
                      
                      //startup tomcat server//
                      sh "ssh ${user}@${ip} /opt/tomcat/bin/startup.sh"*/
                      
                   }
               }
