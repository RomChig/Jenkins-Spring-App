pipeline {
    agent any
    stages {
        node {
            stage('check maven & java version') {
                steps {
                    withMaven(maven: 'maven-3') {
                        sh "mvn -v"
                        sh "java -version"
                    }
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
}