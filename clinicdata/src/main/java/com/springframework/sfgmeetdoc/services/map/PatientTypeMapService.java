package com.springframework.sfgmeetdoc.services.map;

import com.springframework.sfgmeetdoc.model.PatientType;
import com.springframework.sfgmeetdoc.services.PatientTypeService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class PatientTypeMapService extends AbstractMapService<PatientType, Long> implements PatientTypeService {
    @Override
    public Set<PatientType> findAll() {
        return super.findAll();
    }

    @Override
    public PatientType findById(Long id) {
        return super.findById(id);
    }

    @Override
    public PatientType save(PatientType object) {
        return super.save(object);
    }

    @Override
    public void delete(PatientType object) {
        super.delete(object);
    }

    @Override
    public void deleteByID(Long id) {
        super.deleteById(id);
    }
}
