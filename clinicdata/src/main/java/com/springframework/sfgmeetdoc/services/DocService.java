package com.springframework.sfgmeetdoc.services;

import com.springframework.sfgmeetdoc.model.Doc;

import java.util.Set;

public interface DocService {
    Doc findById(Long id);

    Doc save(Doc doc);

    Set<Doc> findAll();
}
