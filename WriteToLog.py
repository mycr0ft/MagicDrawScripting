from com.nomagic.magicdraw.automaton import AutomatonMacroAPI
from com.nomagic.magicdraw.core import Application

applog = Application.getInstance().getGUILog()
for text in ['Test1', 'Test2', 'Test3', 'TestFinale']:
    applog.log( "This is %s" % text)
