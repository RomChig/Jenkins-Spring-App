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
                git('https://github.com/RomChig/Jenkins-Spring-App.git', 'main')
                scriptPath('pipelineJob.groovy')
            }
        }
    }
}