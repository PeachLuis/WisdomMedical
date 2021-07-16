package com.wisdommedical.dao.impl;

import com.wisdommedical.dao.interf.DoctorDao;
import com.wisdommedical.entity.Doctor;
import com.wisdommedical.entity.Patient;
import ruanko.newspublish.dao.BaseDao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DoctorDaoImpl extends BaseDao implements DoctorDao {

    @Override
    public List<Doctor> getAll() {
        List<Doctor> doctors = new ArrayList<>();
        String sql = "SELECT * FROM doctor";
        Connection connection = getConnection();
        Statement statement;
        try {
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                Doctor doctor = new Doctor(resultSet.getString("name"),
                        resultSet.getString("department"));
                doctors.add(doctor);
            }
            closeAll(connection, statement, resultSet);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return doctors;
    }

    @Override
    public Doctor get(String doctorName) {
        String sql = "SELECT * FROM doctor WHERE name=" + doctorName;
        Connection connection = getConnection();
        Statement statement;
        try {
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            if (resultSet.next()) {
                Doctor doctor = new Doctor(resultSet.getString("name"),
                        resultSet.getString("department"));
                closeAll(connection, statement, resultSet);
                return doctor;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
