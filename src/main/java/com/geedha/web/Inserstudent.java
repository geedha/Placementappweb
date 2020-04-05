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
@WebServlet("/addstudent")
public class Inserstudent extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        MysqlDataSource dataSource = new MysqlDataSource();
        dataSource.setURL("jdbc:mysql://remotemysql.com:3306/Ykiry88Nqj");
        dataSource.setUser("Ykiry88Nqj");
        dataSource.setPassword("82aXSBlvtP");
        String name = "Sharada";//req.getParameter("key1");
        String email = "sharada.india@gmail.com";//req.getParameter("key2");
        String password = "sha@1232";//req.getParameter("key3");
        String cgpa = "9.30";//req.getParameter("key4");
        String phonenumber = "944212931";//req.getParameter("key5");
        try{
            Connection con = dataSource.getConnection();
            System.out.println("Connection Ess");
            System.out.println("inte");
            Statement stmt = con.createStatement();
            System.out.println("inte");

            stmt.executeUpdate("INSERT INTO `place_student` (`name`, `email`, `password`, `cgpa`, `phonenumber`) VALUES ('"+name+"','"+email+"', '"+password+"', '"+cgpa+"', '"+phonenumber+"');"); 
            PrintWriter pw = resp.getWriter(); 
            System.out.println("Queeeee");

            pw.println("Done");
        }
        catch(Exception e){



        }
    
    }
    
}
    


