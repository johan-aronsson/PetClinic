package com.aronsson.petclinic.services;

import com.aronsson.petclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
