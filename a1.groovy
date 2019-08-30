folder('ShellJobs') {
    displayName('Shell Jobs')
    description('Folder for shell jobs')
}
job('ShellJobs/beta') {
    parameterDefinitions {
        text {
            name("testTextBox")
            defaultValue("This is default value")
            description("This is description")
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