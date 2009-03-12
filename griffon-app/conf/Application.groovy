application {
    title='Things'
    startupGroups = ['things']

    // Should Griffon exit when no Griffon created frames are showing?
    autoShutdown = true

    // If you want some non-standard application class, apply it here
    //frameClass = 'javax.swing.JFrame'
}
mvcGroups {
    // MVC Group for "things"
    'things' {
        model = 'ThingsModel'
        view = 'ThingsView'
        controller = 'ThingsController'
    }

}
