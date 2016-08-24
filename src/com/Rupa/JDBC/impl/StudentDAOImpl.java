/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.Rupa.JDBC.impl;

import com.Rupa.JDBC.Dao.StudentDAO;
import com.Rupa.JDBC.entity.Student;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author ACER
 */
public class StudentDAOImpl implements StudentDAO{

    @Override
    public int insert(Student stud) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection= DriverManager.getConnection("jdbc:mysql://localhost/leapfrog_jdbc","root", null);
        String sql="insert into Student(first_name,last_name,address,age,email)values(?,?,?,?,?)";
        PreparedStatement stmt=connection.prepareStatement(sql);
        JOptionPane.showMessageDialog(null, "Connection Successful");
        stmt.setString(1, stud.getFirst_name());
        stmt.setString(2, stud.getLast_name());
        stmt.setString(3, stud.getAddress());
        stmt.setInt(4,Integer.parseInt(stud.getAge()));
        stmt.setString(5, stud.getEmail());
        int result=stmt.executeUpdate();
        connection.close();
        return result;
    }
    
}
