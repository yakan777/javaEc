package listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class ListenerSample
 *
 */
@WebListener
public class ListenerSample implements ServletContextListener {


    public ListenerSample() {
        // TODO Auto-generated constructor stub
    }


    public void contextDestroyed(ServletContextEvent sce)  {
         // TODO Auto-generated method stub
    }


    public void contextInitialized(ServletContextEvent sce)  {
    	ServletContext context = sce.getServletContext();
    	Integer count =0;
    	context.setAttribute("count", count);
    	System.out.println("listener IN!");
    }

}
