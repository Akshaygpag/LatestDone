package com.application.clinic.entities;

import java.util.List;

import com.application.clinic.intefaces.ManageDoctors;
import com.application.clinic.intefaces.ManagePatients;

/**
 * @author Akshay
 * @version 1.0.0
 * @since 05-Jun-2018
 */

public class Clinic  extends BaseClinic implements ManageDoctors,ManagePatients{

    private List<Apointment> listApointment;
    private List<Doctor> listDoctors;
    private List<Patient> listPatients;
    
    
}
