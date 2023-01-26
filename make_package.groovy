
import com.nomagic.magicdraw.core.Application
import com.nomagic.magicdraw.core.Project
import com.nomagic.magicdraw.openapi.uml.SessionManager
import com.nomagic.magicdraw.openapi.uml.ModelElementsManager
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Namespace
import com.nomagic.magicdraw.ui.browser.Node
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Element
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Diagram
import com.nomagic.magicdraw.uml.DiagramTypeConstants
import com.nomagic.uml2.impl.ElementsFactory
import com.nomagic.uml2.ext.magicdraw.auxiliaryconstructs.mdmodels.Model

try
{
    
    SessionManager.getInstance().createSession("Script_Execute")
    def ModelElementsManager MEM = ModelElementsManager.getInstance()
    def Project project = Application.getInstance().getProject()
    def Model model = project.getModel()
    def ElementsFactory elemFactory = project.getElementsFactory()
    
    def Browser = Application.getInstance().getMainFrame().getBrowser()
    def Containment = Browser.getContainmentTree()
    def Node selected_node = Containment.getSelectedNode()
    def Element selected_element = selected_node.getElement()
    
    def Package my_package = elemFactory.createPackageInstance()
    my_package.setName('My Happy Package')
    if (selected_element.canAdd(my_package))
    {
        my_package.setOwner(selected_element)
    }
    
}
finally
{
    SessionManager.getInstance().closeSession();
}
