package com.wisdommedical.service.impl;

import com.wisdommedical.dao.impl.DoctorDaoImpl;
import com.wisdommedical.dao.interf.DoctorDao;
import com.wisdommedical.entity.Doctor;
import com.wisdommedical.service.interf.DoctorService;

import java.util.List;

public class DoctorServiceImpl implements DoctorService {

    private DoctorDao doctorDao = new DoctorDaoImpl();

    @Override
    public List<Doctor> getAllDoctor() {
        return doctorDao.getAll();
    }
}
