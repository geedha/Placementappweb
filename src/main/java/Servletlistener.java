
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import com.mysql.cj.jdbc.MysqlDataSource;

/**
 * StudentServletListener
 */
@WebListener
public class Servletlistener implements ServletContextListener {
    Connection dbConnection = null;
    public void contextInitialized(ServletContextEvent sce) {
        ServletContext context = sce.getServletContext();
        MysqlDataSource dataSource = new MysqlDataSource();
        dataSource.setURL("jdbc:mysql://remotemysql.com:3306/Ykiry88Nqj");
        dataSource.setUser("Ykiry88Nqj");
        dataSource.setPassword("82aXSBlvtP");
        try {
            dbConnection = dataSource.getConnection();
            System.out.println("connection created");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if(dbConnection!=null)
            context.setAttribute("dbconnection", dbConnection);
    }
    public void contextDestroyed(ServletContextEvent sce) {
        ServletContext context = sce.getServletContext();
        context.removeAttribute("dbconnection");
        try {
            dbConnection.close();
            System.out.println("Connection Closed");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
    }
}