// Makes a block owned by the currently selected element in the containment. 

import com.nomagic.magicdraw.core.Application
import com.nomagic.magicdraw.core.Project
import com.nomagic.uml2.ext.magicdraw.auxiliaryconstructs.mdmodels.Model
import com.nomagic.magicdraw.openapi.uml.SessionManager
import com.nomagic.uml2.ext.jmi.helpers.StereotypesHelper
import com.nomagic.magicdraw.ui.browser.Node
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Namespace
import com.nomagic.uml2.ext.magicdraw.mdprofiles.Profile
import com.nomagic.uml2.ext.magicdraw.mdprofiles.Stereotype
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Element
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Class
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Diagram
import com.nomagic.magicdraw.uml.DiagramTypeConstants
import com.nomagic.uml2.impl.ElementsFactory

try
{
    
    SessionManager.getInstance().createSession("Build a Block")

    def Project project = Application.getInstance().getProject()
    def Model model = project.getModel()
    def ElementsFactory elemFactory = project.getElementsFactory()
    
    def Browser = Application.getInstance().getMainFrame().getBrowser()
    def Containment = Browser.getContainmentTree()
    def Node sel = Containment.getSelectedNode()
    def Element selected_element = sel.getElement()
    
    def Class myblock = elemFactory.createClassInstance()
    def Profile sysml_profile = StereotypesHelper.getProfile(project, "SysML")
    def Stereotype blockstereo =  StereotypesHelper.getStereotype(project, "Block", sysml_profile)
    
    StereotypesHelper.addStereotype( myblock, blockstereo)
    myblock.setName('My Happy Block')
    if (selected_element.canAdd(myblock))
    {
        myblock.setOwner(selected_element)
    }
}
finally
{
    SessionManager.getInstance().closeSession();
}
