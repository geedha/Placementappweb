package com.geedha.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.mysql.cj.jdbc.MysqlDataSource;

@WebServlet("/companyadd")
public class Insertcompany extends HttpServlet{
    
    @Override
    protected void service (HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
        PrintWriter pw = resp.getWriter();
        MysqlDataSource dataSource = new MysqlDataSource();
        dataSource.setURL("jdbc:mysql://remotemysql.com:3306/Ykiry88Nqj");
        dataSource.setUser("Ykiry88Nqj");
        dataSource.setPassword("82aXSBlvtP");
       String name = req.getParameter("name");
        String email = req.getParameter("email");
        String password = req.getParameter("password");
        
    
       
        
        
       
        
            
        try{
        
            Connection con=dataSource.getConnection();
            System.out.println("Connection Ess");
            System.out.println("inte");
            //here sonoo is database name, root is username and password  
            Statement stmt=con.createStatement();

            stmt.executeUpdate("insert into  company values ('"+name+"','"+email+"', '"+password+"')"); 
            
            System.out.println("Queeeee");
            

            pw.println("Done");
        }
        catch(Exception e){



        }
    
    }
    
}
    


