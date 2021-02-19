package com.springframework.sfgmeetdoc.services.springdatajpa;

import com.springframework.sfgmeetdoc.model.Patient;
import com.springframework.sfgmeetdoc.repositories.PatientRepository;
import com.springframework.sfgmeetdoc.services.PatientService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class PatientSDJpaService implements PatientService {

    public PatientSDJpaService(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    private final PatientRepository patientRepository;

    @Override
    public Set<Patient> findAll() {
        Set<Patient> patients = new HashSet<>();
        patientRepository.findAll().forEach(patients::add);
        return patients;
    }

    @Override
    public Patient findById(Long aLong) {
        return patientRepository.findById(aLong).orElse(null);
    }

    @Override
    public Patient save(Patient object) {
        return patientRepository.save(object);
    }

    @Override
    public void delete(Patient object) {
        patientRepository.delete(object);
    }

    @Override
    public void deleteByID(Long aLong) {
        patientRepository.deleteById(aLong);
    }
}
