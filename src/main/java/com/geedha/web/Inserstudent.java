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
@WebServlet("\studentadd")
public class Inserstudent extends HttpServlet{
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        PrintWriter pw = resp.getWriter(); 
        
        String name = req.getParameter("name");
        String email = req.getParameter("email");
        String password = req.getParameter("password");
        String cgpa = req.getParameter("cgpa");
        String phonenumber =req.getParameter("phonenumber");
            pw.println("Done");

        try{
            Connection con = (Connection) getServletContext().getAttribute("dbconnection");  
            pw.println("Done");         
             System.out.println("Connection Ess");
            System.out.println("inte");
            Statement stmt = con.createStatement();
            System.out.println("inte");

            stmt.executeUpdate("INSERT INTO place_student VALUES ('"+name+"','"+email+"', '"+password+"', '"+cgpa+"', '"+phonenumber+"');"); 
            
            System.out.println("Queeeee");

            pw.println("Done");
        }
        catch(Exception e){



        }
    
    }
    
}
    


