// Get the Groovy Language version in MagicDraw and print to the Notification Window.

import com.nomagic.magicdraw.core.Application
import com.nomagic.magicdraw.openapi.uml.SessionManager


try
{
    SessionManager.getInstance().createSession("Get Groovy Version")


    def applog = Application.getInstance().getGUILog()
    applog.log( "Groovy Version " + GroovySystem.getVersion() )
}
finally
{
    SessionManager.getInstance().closeSession();

}
