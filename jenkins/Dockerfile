FROM jenkins/jenkins:latest-jdk11
ARG plugins_path=/usr/share/jenkins/ref/plugins.txt
ENV CASC_JENKINS_CONFIG /var/jenkins_home/casc.yaml
ENV JAVA_OPTS -Djenkins.install.runSetupWizard=false
ARG JENKINS_HOME=/var/jenkins_home/casc.yaml
COPY plugins.txt $plugins_path
COPY casc.yaml $JENKINS_HOME
RUN /usr/local/bin/install-plugins.sh < $plugins_path
COPY jobs-config.xml /usr/share/jenkins/ref/jobs/seed-job/config.xml
