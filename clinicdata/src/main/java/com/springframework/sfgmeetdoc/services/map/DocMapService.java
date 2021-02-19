package com.springframework.sfgmeetdoc.services.map;

import com.springframework.sfgmeetdoc.model.Doc;
import com.springframework.sfgmeetdoc.model.Speciality;
import com.springframework.sfgmeetdoc.services.DocService;
import com.springframework.sfgmeetdoc.services.SpecialtyService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class DocMapService extends AbstractMapService<Doc, Long> implements DocService {

    private final SpecialtyService specialtyService;

    public DocMapService(SpecialtyService specialtyService) {
        this.specialtyService = specialtyService;
    }

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

        if(object.getSpecialities().size() > 0){
            object.getSpecialities().forEach(speciality -> {
                if(speciality.getId() == null){
                    Speciality savedSpeciality = specialtyService.save(speciality);
                    speciality.setId(savedSpeciality.getId());
                }
            });
        }
        return super.save(object);
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
