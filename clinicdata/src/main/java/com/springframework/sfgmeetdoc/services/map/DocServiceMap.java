package com.springframework.sfgmeetdoc.services.map;

import com.springframework.sfgmeetdoc.model.Doc;
import com.springframework.sfgmeetdoc.model.Patient;
import com.springframework.sfgmeetdoc.services.CrudService;

import java.util.Set;

public class DocServiceMap extends AbstractMapService<Doc, Long> implements CrudService<Doc, Long> {
    @Override
    public Set<Doc> findAll() {
        return super.findAll();
    }

    @Override
    public Doc findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Doc save(Doc object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Doc object) {
        super.delete(object);
    }

    @Override
    public void deleteByID(Long id) {
        super.deleteById(id);
    }
}
