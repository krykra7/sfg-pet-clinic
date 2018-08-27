package krykra.spring.sfgpetclinic.services;

import krykra.spring.sfgpetclinic.model.Owner;

/**
 * Created by kk on 8/27/2018.
 */
public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
}
