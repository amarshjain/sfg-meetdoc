package com.springframework.sfgmeetdoc.services;

import com.springframework.sfgmeetdoc.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
