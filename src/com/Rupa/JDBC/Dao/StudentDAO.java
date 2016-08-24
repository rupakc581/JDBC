/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.Rupa.JDBC.Dao;

import com.Rupa.JDBC.entity.Student;
import java.sql.SQLException;

/**
 *
 * @author ACER
 */
public interface StudentDAO {
    int insert(Student stud)throws ClassNotFoundException,SQLException;
    
}
