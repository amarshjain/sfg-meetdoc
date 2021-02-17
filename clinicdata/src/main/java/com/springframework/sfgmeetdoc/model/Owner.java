package com.springframework.sfgmeetdoc.model;

import java.util.Set;

public class Owner extends Person{
    private Set<Patient> patients;

    public Set<Patient> getPatients() {
        return patients;
    }

    public void setPatients(Set<Patient> patients) {
        this.patients = patients;
    }
}
