pipelineJob('pipeline-job') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/RomChig/Jenkins-Spring-App.git'
                    }
                    branch 'main'
                    scriptPath('./jenkins/pipelineJob.groovy')
                }
            }
        }
    }
}