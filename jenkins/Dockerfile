FROM jenkins/jenkins:latest-jdk11
USER root
RUN  apt-get update && apt-get install -y maven
ARG JENKINS_HOME=/var/jenkins_home
ARG plugins_path=/usr/share/jenkins/ref/plugins.txt
ENV JAVA_OPTS -Djenkins.install.runSetupWizard=false
ENV CASC_JENKINS_CONFIG $JENKINS_HOME/casc.yaml
COPY plugins.txt $plugins_path
COPY casc.yaml $CASC_JENKINS_CONFIG
RUN /usr/local/bin/install-plugins.sh < $plugins_path
COPY jobs-config.xml /usr/share/jenkins/ref/jobs/seed-job/config.xml
