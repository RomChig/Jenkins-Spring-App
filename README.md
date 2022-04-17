# Jenkins-Spring-App
There is some small spring application connected with Jenkins to play with CI/CD processes

### Steps to up the Jenkins:
1. You should build the image from current Dockerfile 
   1. `Note: install Docker beforehand`
      1. go to the ./jenkins folder
      2. run command `docker build -t jenkins:stable .`
      3. run command `docker run --name jenkins --rm -p 8080:8080
   --env JENKINS_ADMIN_ID=${yourId} 
      --env JENKINS_ADMIN_PASSWORD=${yourPass} jenkins:stable`
      4. where `JENKINS_ADMIN_ID` and `JENKINS_ADMIN_PASSWORD` you need to specify
      5. follow the URL `localhost:8080/login`