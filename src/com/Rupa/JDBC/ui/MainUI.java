/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Rupa.JDBC.ui;

import com.Rupa.JDBC.Dao.StudentDAO;
import com.Rupa.JDBC.entity.Student;
import com.Rupa.JDBC.impl.StudentDAOImpl;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.SQLException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.*;

/**
 *
 * @author ACER
 */
public class MainUI extends JFrame {

    private JLabel lblFirstName, lblLastName, lblAddress, lblAge, lblEmail;
    private JTextField txtFirstName, txtLastName, txtAddress, txtAge, txtEmail;
    private JButton btnSave;

    public MainUI() {
        setSize(500, 500);
        setLayout(new FlowLayout(FlowLayout.CENTER));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        initComponents();
        setVisible(true);

    }

    private void initComponents() {
        lblFirstName= new JLabel("First name");
        txtFirstName = new JTextField(15);
        lblLastName = new JLabel("Last name");
        txtLastName = new JTextField(15);
        lblAddress = new JLabel("Address");
        txtAddress = new JTextField(15);
        lblAge = new JLabel("Age");
        txtAge = new JTextField(20);
        lblEmail = new JLabel("Email");
        txtEmail = new JTextField(15);
        btnSave = new JButton("SAVE");
        
        
        add(lblFirstName);
        add(txtFirstName);
        add(lblLastName);
        add(txtLastName);
        add(lblAddress);
        add(txtAddress);
        add(lblAge);
        add(txtAge);
        add(lblEmail);
        add(txtEmail);
        add(btnSave);
        
        btnSave.addActionListener(new SaveButtonListener());
    }
    private class SaveButtonListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            StudentDAO studentdao= new StudentDAOImpl();
            Student stud= new Student();
            stud.setFirst_name(txtFirstName.getText());
            stud.setLast_name(txtLastName.getText());
            stud.setAddress(txtAddress.getText());
            stud.setAge((txtAge.getText()));
            stud.setEmail(txtEmail.getText());
            try{
             studentdao.insert(stud);
            }catch(ClassNotFoundException | SQLException cs){
                JOptionPane.showMessageDialog(null, cs.getMessage());
            }
        }
        
    }
}