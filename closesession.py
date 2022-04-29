# Close a Macro session in MagicDraw/Cameo. Use this when something goes very
# wrong with a script that failed. 

import com

from com.nomagic.magicdraw.automaton import AutomatonMacroAPI
from com.nomagic.magicdraw.core import Application
from com.nomagic.magicdraw.openapi.uml import SessionManager

SessionManager.getInstance().closeSession()
