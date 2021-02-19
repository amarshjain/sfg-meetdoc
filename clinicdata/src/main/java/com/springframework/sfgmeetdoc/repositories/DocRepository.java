package com.springframework.sfgmeetdoc.repositories;

import com.springframework.sfgmeetdoc.model.Doc;
import org.springframework.data.repository.CrudRepository;

public interface DocRepository extends CrudRepository<Doc, Long> {
}
