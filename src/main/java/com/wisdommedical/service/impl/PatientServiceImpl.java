package com.wisdommedical.service.impl;

import com.wisdommedical.dao.impl.PatientDaoImpl;
import com.wisdommedical.entity.Patient;
import com.wisdommedical.service.interf.PatientService;

import java.util.ArrayList;

public class PatientServiceImpl implements PatientService {

    private PatientDaoImpl patientDao;

    public PatientServiceImpl() {
        this.patientDao = new PatientDaoImpl();
    }

    @Override
    public void addPatient(Patient patient) {
        patientDao.add(patient);
    }

    @Override
    public void deletePatient(String id) {
        patientDao.delete(id);
    }

    @Override
    public void updatePatient(Patient patient) {
        patientDao.update(patient);
    }

    @Override
    public ArrayList<Patient> getAllPatient() {
        return patientDao.getAll();
    }

    @Override
    public Patient getPatient(int id) {
        return patientDao.get(id);
    }

}
