package com.springframework.sfgmeetdoc.services.springdatajpa;

import com.springframework.sfgmeetdoc.model.PatientType;
import com.springframework.sfgmeetdoc.repositories.PatientTypeRepository;
import com.springframework.sfgmeetdoc.services.PatientTypeService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class PatientTypeSDJpaService implements PatientTypeService {

    private final PatientTypeRepository patientTypeRepository;

    public PatientTypeSDJpaService(PatientTypeRepository patientTypeRepository) {
        this.patientTypeRepository = patientTypeRepository;
    }

    @Override
    public Set<PatientType> findAll() {
        Set<PatientType> patientTypes = new HashSet<>();
        patientTypeRepository.findAll().forEach(patientTypes::add);
        return patientTypes;
    }

    @Override
    public PatientType findById(Long aLong) {
        return patientTypeRepository.findById(aLong).orElse(null);
    }

    @Override
    public PatientType save(PatientType object) {
        return patientTypeRepository.save(object);
    }

    @Override
    public void delete(PatientType object) {
        patientTypeRepository.delete(object);
    }

    @Override
    public void deleteByID(Long aLong) {
        patientTypeRepository.deleteById(aLong);
    }
}
