import com.nomagic.uml2.ext.jmi.helpers.StereotypesHelper
import com.nomagic.magicdraw.core.Application

def Browser = Application.getInstance().getMainFrame().getBrowser()
def Containment = Browser.getContainmentTree()
def sel = Containment.getSelectedNode()
def ele = sel.getElement()
// Access the Element selected in the Containment Tree
def applog = Application.getInstance().getGUILog()
applog.log("Selected is " + ele )

// send a message about the Path of the element in the Containment Tree
applog.log("Selected Path is " + sel.getPath())

def SH = StereotypesHelper
j = SH.getAppliedStereotypeByString( ele, 'System')
if (j){
    y = []
    for( k in j){
      y.add( k.getName() )
    }
    applog.log( "Stereotype " + y )
}
