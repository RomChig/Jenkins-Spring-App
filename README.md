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

### Login Page

<img width="515" alt="image" src="https://user-images.githubusercontent.com/45129375/163722948-8e80cb22-8582-47e3-97a1-ffb5a8013028.png">

### Run seed-job 

<img width="1063" alt="image" src="https://user-images.githubusercontent.com/45129375/163722988-eeb2fbb6-b06b-459e-8c5d-983706dfd24e.png">

### Run pipelina-job which will be created after due seed-job

<img width="1063" alt="image" src="https://user-images.githubusercontent.com/45129375/163723032-e5f84f9a-3f97-4766-bdd0-68157897f2f1.png">

![telegram-cloud-photo-size-2-5395667753999907943-y](https://user-images.githubusercontent.com/45129375/163723047-8b9ec228-51f0-4206-83dc-c43238417c07.jpg)

### Pipeline job's Stages

![telegram-cloud-photo-size-2-5395667753999907941-y](https://user-images.githubusercontent.com/45129375/163723074-23791059-d788-42cb-b240-1e9d116727d1.jpg)

### 20 Tests [CrazyStreamsTest,java](https://github.com/RomChig/Jenkins-Spring-App/blob/main/src/test/java/com/romchig/jenkins/service/CrazyStreamsTest.java)

![telegram-cloud-photo-size-2-5395667753999907942-y](https://user-images.githubusercontent.com/45129375/163723095-0f589399-7958-48e1-9dbe-4d1b1b5ba8fa.jpg)

### Tests results

![telegram-cloud-photo-size-2-5395667753999907945-y](https://user-images.githubusercontent.com/45129375/163723178-48ea9efe-73d1-4799-b27c-3da9550cac67.jpg)
