package com.springframework.sfgmeetdoc.services.map;

import com.springframework.sfgmeetdoc.model.Owner;
import com.springframework.sfgmeetdoc.model.Patient;
import com.springframework.sfgmeetdoc.services.CrudService;

import java.util.Set;

public class PatientServiceMap extends AbstractMapService<Patient, Long> implements CrudService<Patient, Long> {
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
