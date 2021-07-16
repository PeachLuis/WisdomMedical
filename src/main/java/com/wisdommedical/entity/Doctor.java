package com.wisdommedical.entity;

/**
 * 医生实体
 */
public class Doctor {

    /**
     * 医生名称，pk
     */
    private String name;

    /**
     * 部门
     */
    private String department;

    public Doctor(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public Doctor() {
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }
}
