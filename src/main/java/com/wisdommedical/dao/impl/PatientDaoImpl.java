package com.wisdommedical.dao.impl;

import com.wisdommedical.dao.interf.PatientDao;
import com.wisdommedical.entity.Patient;
import ruanko.newspublish.dao.BaseDao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class PatientDaoImpl extends BaseDao implements PatientDao {

    @Override
    public void add(Patient patient) {
        String sql = "INSERT INTO patient(id, name, age) VALUES('" +
                patient.getId() +
                "','" +
                patient.getName() +
                "','" +
                patient.getAge() +
                "')";
        executeUpdate(sql);
    }

    @Override
    public void delete(String id) {
        String sql = "DELETE FROM patient WHERE id = '" + id+"'";
        executeUpdate(sql);
    }

    @Override
    public void update(Patient patient) {
        String sql = "UPDATE patient SET name='" +
                patient.getName() +
                "', age='" +
                patient.getAge() +
                "' WHERE id=" + patient.getId();
        executeUpdate(sql);
    }

    @Override
    public ArrayList<Patient> getAll() {
        ArrayList<Patient> patients = new ArrayList<>();
        String sql = "SELECT * FROM patient";
        Connection connection = getConnection();
        Statement statement;
        try {
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                Patient patient = new Patient(resultSet.getString("id"),
                        resultSet.getString("name"),
                        resultSet.getInt("age"));
                patients.add(patient);
            }
            closeAll(connection, statement, resultSet);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return patients;
    }

    @Override
    public Patient get(int id) {
        String sql = "SELECT * FROM patient WHERE id=" + id;
        Connection connection = getConnection();
        Statement statement;
        try {
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            if (resultSet.next()) {
                Patient patient = new Patient(resultSet.getString("id"),
                        resultSet.getString("name"),
                        resultSet.getInt("age"));

                closeAll(connection, statement, resultSet);
                return patient;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
