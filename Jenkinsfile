node {
  try{
    stage 'checkout project'
    checkout scm

    stage 'check env'
    sh "./mvnw -v"
    sh "java -version"

    stage 'test'
    sh "./mvnw test"

    stage 'package'
    sh "./mvnw package"

    stage 'report'
    step([$class: 'JUnitResultArchiver', testResults: '**/target/surefire-reports/TEST-*.xml'])

    stage 'Artifact'
    step([$class: 'ArtifactArchiver', artifacts: '**/target/*.jar', fingerprint: true])

  }catch(e){
    throw e;
  }
}