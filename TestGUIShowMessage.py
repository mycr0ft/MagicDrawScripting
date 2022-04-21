#
# Use the MagicDraw Cameo GUI system to show a message.
#
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

    Application.getInstance().getGUILog().showMessage( "This is a test message." )

except:
    SessionManager.getInstance().closeSession()
    raise
else:
    SessionManager.getInstance().closeSession()
