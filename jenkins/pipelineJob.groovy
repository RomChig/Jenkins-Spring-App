pipeline {
    agent {
        docker {
            image 'maven:3.8.1-adoptopenjdk-11'
            args '-v $HOME/.m2:/root/.m2'
        }
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