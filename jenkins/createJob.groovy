pipelineJob('pipelineJob') {
    definition {
        scm {
            github('RomChig/Jenkins-Spring-App', 'main')
        }
        cps {
            script(readFileFromWorkspace('pipelineJob.groovy'))
            sandbox()
        }
    }
}