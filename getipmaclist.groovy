folder('JOBS') {
    displayName('Shell Jobs')
    description('Folder for shell jobs')
}

job('JOBS/getipmaclist') {

    steps {
        shell(readFileFromWorkspace('./shell_files/getipmaclist.sh'))
    }
}