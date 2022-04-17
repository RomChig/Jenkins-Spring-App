pipeline {
    agent any
    tools {
        maven 'Maven 3.3.9'
        jdk 'jdk11'
    }

    stages {
        stage('check maven & java version') {
            steps {
                sh "./mvnw -v"
                sh "java -version"
            }
        }

        stage('unit tests') {
            steps {
                sh './mvnw test'
            }
        }

        stage('package') {
            steps {
                sh './mvnw package'
            }
        }

        stage('report') {
            steps {
                step([$class: 'JUnitResultArchiver', testResults: '**/target/surefire-reports/TEST-*.xml'])
            }
        }

        stage('artifact') {
            steps {
                step([$class: 'ArtifactArchiver', artifacts: '**/target/*.jar', fingerprint: true])
            }
        }
    }
}