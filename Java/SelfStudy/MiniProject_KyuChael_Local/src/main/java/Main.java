package main.java;

import main.java.com.example.IndexMenu;
import main.java.com.example.patient.model.dao.PatientDao;
import main.java.com.example.doctor.model.DAO.MedicalRecordsDao;
import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException {
        IndexMenu menu = new IndexMenu();
        menu.mainMenu();
    }
}