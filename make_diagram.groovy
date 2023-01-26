import com.nomagic.magicdraw.core.Application
import com.nomagic.magicdraw.core.Project
import com.nomagic.uml2.impl.ElementsFactory
import com.nomagic.magicdraw.ui.browser.Node
import com.nomagic.uml2.ext.magicdraw.auxiliaryconstructs.mdmodels.Model
import com.nomagic.magicdraw.openapi.uml.SessionManager
import com.nomagic.magicdraw.openapi.uml.ModelElementsManager
import com.nomagic.uml2.impl.ElementsFactory
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Namespace
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Element
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Diagram
import com.nomagic.magicdraw.uml.DiagramTypeConstants
import com.nomagic.uml2.diagram.DiagramTypes
try
{
    
    SessionManager.getInstance().createSession("Script_Execute")
    def ModelElementsManager MEM = ModelElementsManager.getInstance()
    def Project project = Application.getInstance().getProject()
    def Model model = project.getModel()
    
    def Browser = Application.getInstance().getMainFrame().getBrowser()
    def Containment = Browser.getContainmentTree()
    def Node selected_node = Containment.getSelectedNode()
    def Element selected_element = selected_node.getElement()
    
    def Diagram dia = MEM.createDiagram( DiagramTypeConstants.CONTENT_DIAGRAM, selected_element)
    dia.setName('Happy Diagram Day')

}
finally
{
    SessionManager.getInstance().closeSession();
}
