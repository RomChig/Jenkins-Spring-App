pipelineJob('pipelineJob') {
    definition {
        cps {
            script(readFileFromWorkspace('pipelineJob.groovy'))
            sandbox()
        }
        cpsScm {
            scm {
                github('RomChig/Jenkins-Spring-App', 'main')
            }
        }
    }
}