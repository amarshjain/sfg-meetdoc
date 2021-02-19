package com.springframework.sfgmeetdoc.repositories;

import com.springframework.sfgmeetdoc.model.PatientType;
import org.springframework.data.repository.CrudRepository;

public interface PatientTypeRepository extends CrudRepository<PatientType, Long> {
}
