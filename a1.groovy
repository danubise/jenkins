folder('ShellJobs') {
    displayName('Shell Jobs')
    description('Folder for shell jobs')
}
job('ShellJobs/beta') {
    parameters{
        stringParam {
            name("TestStringBox")
            defaultValue("Default value")
            description("Description aaaa")
            trim(true)
        }
    }
    steps {

        shell(readFileFromWorkspace('lscommand.cmd'))
        environmentVariables {
            propertiesFile('env.sh')
        }
        shell(readFileFromWorkspace('second.cmd'))
    }
}