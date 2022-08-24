def call(credId,user,ip){
     sshagent(['credId']){
                
                      //copy war//
                      sh 'scp webtest1/target/webtest.war ${user}@${ip}:/opt/tomcat/webapps'
                      
                      //shutdown tomcat server//
                      sh 'ssh ${user}@${ip} /opt/tomcat/bin/shutdown.sh'
                      
                      //startup tomcat server//
                      sh 'ssh ${user}@${ip} /opt/tomcat/bin/startup.sh'
                      
                   }
               }
