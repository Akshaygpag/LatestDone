package com.application.clinic.entities;

import java.io.Serializable;

/**
 * @author Akshay
 * @version 1.0.0
 * @since 05-Jun-2018
 */

public class Apointment implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private Doctor doctor;
    private String time;

    public Doctor getDoctor() {
	return doctor;
    }

    public void setDoctor(Doctor doctor) {
	this.doctor = doctor;
    }

    public String getTime() {
	return time;
    }

    public void setTime(String time) {
	this.time = time;
    }

}
