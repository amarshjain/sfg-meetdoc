package com.springframework.sfgmeetdoc.services.map;

import com.springframework.sfgmeetdoc.model.Owner;
import com.springframework.sfgmeetdoc.model.Patient;
import com.springframework.sfgmeetdoc.model.PatientType;
import com.springframework.sfgmeetdoc.services.OwnerService;
import com.springframework.sfgmeetdoc.services.PatientService;
import com.springframework.sfgmeetdoc.services.PatientTypeService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {

    private final PatientTypeService patientTypeService;
    private final PatientService patientService;

    public OwnerServiceMap(PatientTypeService patientTypeService, PatientService patientService) {
        this.patientTypeService = patientTypeService;
        this.patientService = patientService;
    }

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner save(Owner object) {
        if(object != null){
            if(object.getPatients() != null){
                object.getPatients().forEach(patient -> {
                    if (patient.getPatientType() != null){
                        patient.setPatientType(patientTypeService.save(patient.getPatientType()));
                    } else{
                        throw new RuntimeException("Patient Type is required");
                    }

                    if(patient.getId() == null){
                        Patient savedPatient = patientService.save(patient);
                        patient.setId(savedPatient.getId());
                    }
                });
            }
            return super.save(object);
        } else {
            return null;
        }

    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }

    @Override
    public void deleteByID(Long id) {
        super.deleteById(id);
    }

    @Override
    public Owner findByLastName(String lastName) {
        return null;
    }
}
