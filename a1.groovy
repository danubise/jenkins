folder('ShellJobs') {
    displayName('Shell Jobs')
    description('Folder for shell jobs')
}
job('ShellJobs/beta') {

    steps {

        parameterDefinitions {
            text {
                name("testTextBox")
                defaultValue("This is default value")
                description("This is description")
            }
        }


        shell(readFileFromWorkspace('lscommand.cmd'))
        environmentVariables {
            propertiesFile('env.sh')
        }
        shell(readFileFromWorkspace('second.cmd'))
    }
}