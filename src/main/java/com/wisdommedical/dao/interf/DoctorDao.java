package com.wisdommedical.dao.interf;

import com.wisdommedical.entity.Doctor;

import java.util.List;

public interface DoctorDao {

    /**
     * 得到数据库中所有医生
     * @return 包含所有医生的列表
     */
    List<Doctor> getAll();

    /**
     * 通过医生姓名得到医生实体类
     * @param doctorName 医生姓名
     * @return 对应医生实体类
     */
    Doctor get(String doctorName);

}
