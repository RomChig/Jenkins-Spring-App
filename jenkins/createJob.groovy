pipelineJob('pipelineJob') {
    definition {
        cps {
            script(readFileFromWorkspace('./jenkins/pipelineJob.groovy'))
            sandbox()
        }
    }
}