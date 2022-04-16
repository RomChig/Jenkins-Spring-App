pipeline {
    agent any
    stages {
        stage('pull source') {
            git url: 'https://github.com/RomChig/Jenkins-Spring-App.git', branch: 'main'
        }

        stage('check maven & java version') {
            steps{
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
            step([$class: 'JUnitResultArchiver', testResults: '**/target/surefire-reports/TEST-*.xml'])
        }

        stage('artifact') {
            step([$class: 'ArtifactArchiver', artifacts: '**/target/*.jar', fingerprint: true])
        }
    }
}