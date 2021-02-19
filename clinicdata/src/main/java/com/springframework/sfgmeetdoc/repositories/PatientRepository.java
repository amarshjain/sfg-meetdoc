package com.springframework.sfgmeetdoc.repositories;

import com.springframework.sfgmeetdoc.model.Patient;
import org.springframework.data.repository.CrudRepository;

public interface PatientRepository extends CrudRepository<Patient, Long> {
}
