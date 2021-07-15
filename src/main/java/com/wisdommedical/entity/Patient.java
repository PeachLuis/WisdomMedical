package com.wisdommedical.entity;

/**
 * 病人Patient实体类
 */
public class Patient {

    /**
     * 病人身份证号
     */
    private String id;

    /**
     * 病人姓名
     */
    private String name;

    /**
     * 病人年龄
     */
    private int age;

    /**
     * 构造方法
     * @param id id
     * @param name name
     * @param age age
     */
    public Patient(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Patient() {
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
