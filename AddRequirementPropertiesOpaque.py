# java specific imports for python
import com
# MagicDraw API imports
from com.nomagic.magicdraw.automaton import AutomatonMacroAPI
from com.nomagic.magicdraw.core import Application
from com.nomagic.magicdraw.openapi.uml import SessionManager
from com.nomagic.uml2.ext.jmi.helpers import StereotypesHelper
from com.nomagic.magicdraw.core import Application

try:
    SessionManager.getInstance().createSession("Automaton_Macro_Script_Execute")
    rootModel = AutomatonMacroAPI.getModelData()
    project = Application.getInstance().getProject();

    # Get Selected Element in the Containment
    ele1 = AutomatonMacroAPI.getSelectedElementFromContainmentTree()
    AutomatonMacroAPI.addStereotypeByStereotypeName( ele1, "RequirementProperties")

except:
    SessionManager.getInstance().closeSession()
    raise
else:
    SessionManager.getInstance().closeSession()


# Enterprise Requirements Information Profile::Requirements Information Profile::RequirementHeading
