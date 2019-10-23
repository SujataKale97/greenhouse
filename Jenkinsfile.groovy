node
{
  stage("Build Code")
  {
     git 'https://github.com/SujataKale97/greenhouse.git'
    sh 'mvn install'
  }
  stage("Deploy code to tomcat server")
  {
    sh 'cp target/*.war /usr/lib/tomcat/webapps/
  }
}
