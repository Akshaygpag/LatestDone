package com.application.clinic.entities;

import java.io.Serializable;

/**
 * @author Akshay
 * @version 1.0.0
 * @since 05-Jun-2018
 */

public class Patient implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private int id;
    private String name;

    private String mobile;
    private byte age;

    private Apointment apointment;

    public int getId() {
	return id;
    }

    public void setId(int id) {
	this.id = id;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public String getMobile() {
	return mobile;
    }

    public void setMobile(String mobile) {
	this.mobile = mobile;
    }

    public byte getAge() {
	return age;
    }

    public void setAge(byte age) {
	this.age = age;
    }

    public Apointment getApointment() {
	return apointment;
    }

    public void setApointment(Apointment apointment) {
	this.apointment = apointment;
    }

}
