application(title:'things', pack:true, locationByPlatform:true) {
    borderLayout()
    hbox(constraints:NORTH) {
        textField(columns:20, text: bind('newTask', target:model, id:'textBinding'))
        button('Add Task', id:'addTask', actionPerformed: controller.addTask)
    }
    scrollPane(constraints:CENTER) {
        list(model: bind{model.listModel})
    }
    
}