package com.springframework.sfgmeetdoc.repositories;

import com.springframework.sfgmeetdoc.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner, Long> {
}
