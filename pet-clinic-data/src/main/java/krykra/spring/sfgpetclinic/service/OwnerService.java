package krykra.spring.sfgpetclinic.service;

import java.util.Set;

import krykra.spring.sfgpetclinic.model.Owner;

/**
 * Created by Krystian Krawczyk on 8/27/2018.
 */
public interface OwnerService {

    Owner findByLastName(String lastName);

    Owner findById(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();
}
