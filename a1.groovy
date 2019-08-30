folder('ShellJobs') {
    displayName('Shell Jobs')
    description('Folder for shell jobs')
}
job('ShellJobs/beta') {

    steps {

        shell(readFileFromWorkspace('lscommand.cmd'))
        environmentVariables {
            propertiesFile('env.sh')
        }
        shell(readFileFromWorkspace('second.cmd'))
    }
}