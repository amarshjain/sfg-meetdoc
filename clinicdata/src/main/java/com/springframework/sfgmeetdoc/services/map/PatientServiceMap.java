package com.springframework.sfgmeetdoc.services.map;

import com.springframework.sfgmeetdoc.model.Patient;
import com.springframework.sfgmeetdoc.services.PatientService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class PatientServiceMap extends AbstractMapService<Patient, Long> implements PatientService {
    @Override
    public Set<Patient> findAll() {
        return super.findAll();
    }

    @Override
    public Patient findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Patient save(Patient object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Patient object) {
        super.delete(object);
    }

    @Override
    public void deleteByID(Long id) {
        super.deleteById(id);
    }
}
