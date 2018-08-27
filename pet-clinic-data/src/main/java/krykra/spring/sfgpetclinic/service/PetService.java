package krykra.spring.sfgpetclinic.service;

import java.util.Set;

import krykra.spring.sfgpetclinic.model.Pet;

/**
 * Created by Krystian Krawczyk on 8/27/2018.
 */
public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
