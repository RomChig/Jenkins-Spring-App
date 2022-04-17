//pipelineJob('pipelineJob') {
//    definition {
//        cps {
//            script(readFileFromWorkspace('pipelineJob.groovy'))
//            sandbox()
//        }
//    }
//}

pipelineJob('pipeline-job') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/RomChig/Jenkins-Spring-App.git'
                    }
                    branch 'main'
                    scriptPath('pipelineJob.groovy')
                }
            }
        }
    }
}