import groovy.beans.Bindable
import javax.swing.ListModel

class ThingsModel {
   // @Bindable String propName
   @Bindable String newTask
   @Bindable ListModel listModel
}