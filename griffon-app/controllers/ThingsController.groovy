import javax.swing.DefaultListModel

class ThingsController {
    // these will be injected by Griffon
    def model
    def view

    void mvcGroupInit(Map args) {
        model.newTask = ''
        model.listModel = new DefaultListModel()
    }
    
    def addTask = { evt = null ->
        model.listModel.addElement(model.newTask)
    }
    
}