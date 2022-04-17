pipelineJob('pipelineJob') {
    definition {
        cps {
            scm {
                github('RomChig/Jenkins-Spring-App', 'main')
            }
            script(readFileFromWorkspace('pipelineJob.groovy'))
            sandbox()
        }
    }
}