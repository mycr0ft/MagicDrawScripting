// Makes a block owned by the currently selected element in the containment. 

import com.nomagic.magicdraw.core.Application
import com.nomagic.magicdraw.core.Project
import com.nomagic.uml2.ext.magicdraw.auxiliaryconstructs.mdmodels.Model
import com.nomagic.magicdraw.openapi.uml.SessionManager
import com.nomagic.magicdraw.ui.browser.Node
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Element
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class
import com.nomagic.magicdraw.uml.DiagramTypeConstants
import com.nomagic.uml2.impl.ElementsFactory

try
{
    
    SessionManager.getInstance().createSession("Script_Execute")

    def Project project = Application.getInstance().getProject()
    def Model model = project.getModel()
    def ElementsFactory elemFactory = project.getElementsFactory()
    
    def Browser = Application.getInstance().getMainFrame().getBrowser()
    def Containment = Browser.getContainmentTree()
    def Node selected_node = Containment.getSelectedNode()
    def Element selected_element = selected_node.getElement()
    
    def Class myClass = elemFactory.createClassInstance()

    myClass.setName('My Happy Class')
    if (selected_element.canAdd(myClass))
    {
        myClass.setOwner(selected_element)
    }
}
finally
{
    SessionManager.getInstance().closeSession()
}
