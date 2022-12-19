/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.db;

import com.mycompany.models.Loginget;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Set;

/**
 *
 * @author zerot
 */
public class Conexionlogin {
    
    Connection cn;
    PreparedStatement ps;
    ResultSet rs;
    
    public Conexionlogin(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            cn=DriverManager.getConnection("jdbc:mysql://localhost/hotel","root","");
            System.out.println("conetado DB");
        } catch (Exception e) {
            System.out.println("ERROR DB");
        }
    }
    
    public ArrayList<Loginget> login(String user, String password){
        ArrayList<Loginget> res = new ArrayList<>();
        
        try {
            System.out.println("entro login");
            ps=cn.prepareStatement("SELECT * FROM admin WHERE user=? AND password=?");
            ps.setString(1, user);
            ps.setString(2, password);
            rs = ps.executeQuery();
            while (rs.next()) {
                Loginget lo = new Loginget();
                lo.setUser(rs.getString("user"));
                lo.setPassword(rs.getString("password"));
                res.add(lo);
                System.out.println(rs.getString("user"));
                System.out.println(rs.getString("password"));
                System.out.println("aca");
            }
            if (res.isEmpty()) {
                System.out.println("Usuario no existe");
            }else{
                System.out.println("Connection Finished");
            }
        } catch (Exception e) {
        }
    
    
        
        return res;
        
    }
    
    
    
    
    
}
