pipelineJob('pipelineJob') {
    definition {
        cpsScm {
            scm {
                github('RomChig/Jenkins-Spring-App', 'main')
            }
        }
        cps {
            script(readFileFromWorkspace('pipelineJob.groovy'))
            sandbox()
        }
    }
}