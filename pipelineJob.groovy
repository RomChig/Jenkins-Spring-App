pipeline {
    agent any
    stages {

        stage('go to the seed job workspace') {
            steps {
                sh "cd ../../seed-job/workspace/"
            }
        }
        stage('check maven & java version') {
            steps {
                sh "mvn -v"
                sh "java --version"
            }
        }

        stage('unit tests') {
            steps {
                sh 'mvn test'
            }
        }

        stage('package') {
            steps {
                sh 'mvn package'
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