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

@WebServlet("/studentadd")
public class Inserstudent extends HttpServlet{
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter pw = resp.getWriter();
        MysqlDataSource dataSource = new MysqlDataSource();
        dataSource.setURL("jdbc:mysql://remotemysql.com:3306/Ykiry88Nqj");
        dataSource.setUser("Ykiry88Nqj");
        dataSource.setPassword("82aXSBlvtP");
        String name = req.getParameter("name");
        String email = req.getParameter("email");
        String password = req.getParameter("password");
        String cgpa = req.getParameter("cgpa");
        String phonenumber =req.getParameter("phonenumber");
    
        System.out.println(name);
        System.out.println(email);
        System.out.println(password);
        System.out.println(cgpa);
        System.out.println(phonenumber);
        /*String name = "haaii";
        String email  = "dsd";
        String password = "434fdf";ys
        String cgpa ="32";
        String phonenumber ="4343434";*/
        
            
        try{
        
            Connection con=dataSource.getConnection();
            System.out.println("Connection Ess");
            System.out.println("inte");
            //here sonoo is database name, root is username and password  
            Statement stmt=con.createStatement();

            stmt.executeUpdate("insert into  place_student values ('"+name+"','"+email+"', '"+password+"', '"+cgpa+"', '"+phonenumber+"')"); 
            
            System.out.println("Queeeee");
            

            pw.println("Done");
        }
        catch(Exception e){



        }
    
    }
    
}
    


