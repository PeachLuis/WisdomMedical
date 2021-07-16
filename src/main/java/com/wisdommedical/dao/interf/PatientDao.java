package com.wisdommedical.dao.interf;

import com.wisdommedical.entity.Patient;

import java.util.ArrayList;

public interface PatientDao {

    /**
     * 添加患者
     * @param patient 待添加的患者
     */
    void add(Patient patient);

    /**
     * 删除患者
     * @param id 待删除的患者id
     */
    void delete(String id);

    /**
     * 修改患者
     * @param patient 待修改的患者
     */
    void update(Patient patient);

    /**
     * 得到所有患者的列表
     * @return 数据库中所有患者列表
     */
    ArrayList<Patient> getAll();

    /**
     * 通过id获取Patient对象
     * @param id 患者id信息
     * @return 对应id的患者对象
     */
    Patient get(int id);

}
