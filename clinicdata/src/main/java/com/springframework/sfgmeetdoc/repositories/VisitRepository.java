package com.springframework.sfgmeetdoc.repositories;

import com.springframework.sfgmeetdoc.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
