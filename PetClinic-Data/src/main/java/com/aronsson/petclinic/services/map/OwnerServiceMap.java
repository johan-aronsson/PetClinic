package com.aronsson.petclinic.services.map;

import com.aronsson.petclinic.model.Owner;
import com.aronsson.petclinic.services.CrudService;

import java.util.Set;

public class OwnerServiceMap extends AbstractMapServices<Owner, Long> implements CrudService<Owner, Long> {

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner save(Owner object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
