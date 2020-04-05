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
import com.google.gson.JsonArray;
import com.mysql.cj.jdbc.MysqlDataSource;
import com.geedha.web.*;

@WebServlet("/getstudents")
public class Getallstudents extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Student> listStudents  = new ArrayList<>();
        MysqlDataSource dataSource = new MysqlDataSource();
        dataSource.setURL("jdbc:mysql://remotemysql.com:3306/Ykiry88Nqj");
        dataSource.setUser("Ykiry88Nqj");
        dataSource.setPassword("82aXSBlvtP");
        //int size;
        try{  
            /* Class.forName("com.mysql.jdbc.Driver"); */
            Connection con=dataSource.getConnection();
            System.out.println("Connection Ess");
            //here sonoo is database name, root is username and password  
            Statement stmt=con.createStatement();  
            ResultSet rs=stmt.executeQuery("select * from place_student");  
            System.out.println("Queeeee");

            while(rs.next()) 
            listStudents.add(new Student(rs.getString(1),rs.getString(2),rs.getString(3),rs.getFloat(4),
                     rs.getLong(5)));
            System.out.println(rs.getString(1));
            con.close();  
            }catch(Exception e){ System.out.println(e);} 
            
           JsonArray json = new Gson().toJsonTree(listStudents).getAsJsonArray();   
            //Gson jsonConverter = new Gson();
            PrintWriter pw = resp.getWriter();
            pw.write(json.toString());

            //size = listStudents.size();
            //int i =0;
            //while(i!=size){
                //Student student = listStudents.get(i);
                //String dataToSend = jsonConverter.toJson(student);

                //pw.println(dataToSend);
                //i = i+1;
            //}
           


        
    }
}