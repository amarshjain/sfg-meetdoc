package com.springframework.sfgmeetdoc.services.springdatajpa;

import com.springframework.sfgmeetdoc.model.Doc;
import com.springframework.sfgmeetdoc.repositories.DocRepository;
import com.springframework.sfgmeetdoc.services.DocService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class DocSDJpaService implements DocService {

    private final DocRepository docRepository;

    public DocSDJpaService(DocRepository docRepository) {
        this.docRepository = docRepository;
    }

    @Override
    public Set<Doc> findAll() {
        Set<Doc> docs = new HashSet<>();
        docRepository.findAll().forEach(docs::add);
        return docs;
    }

    @Override
    public Doc findById(Long aLong) {
        return docRepository.findById(aLong).orElse(null);
    }

    @Override
    public Doc save(Doc object) {
        return docRepository.save(object);
    }

    @Override
    public void delete(Doc object) {
        docRepository.delete(object);
    }

    @Override
    public void deleteByID(Long aLong) {
        docRepository.deleteById(aLong);
    }
}
