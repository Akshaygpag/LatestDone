package com.application.clinic.entities;

import java.io.Serializable;

/**
 * @author Akshay
 * @version 1.0.0
 * @since 05-Jun-2018
 */

public class Doctor implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private int id;
    private String name;
    private String specilization;
    private String avaliable;

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

    public String getSpecilization() {
	return specilization;
    }

    public void setSpecilization(String specilization) {
	this.specilization = specilization;
    }

    public String getAvaliable() {
	return avaliable;
    }

    public void setAvaliable(String avaliable) {
	this.avaliable = avaliable;
    }

}
