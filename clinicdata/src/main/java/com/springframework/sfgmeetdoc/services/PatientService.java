package com.springframework.sfgmeetdoc.services;

import com.springframework.sfgmeetdoc.model.Patient;

import java.util.Set;

public interface PatientService {

    Patient findById(Long id);

    Patient save(Patient patient);

    Set<Patient> findAll();
}
