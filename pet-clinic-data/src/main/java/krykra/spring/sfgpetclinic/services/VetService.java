package krykra.spring.sfgpetclinic.services;

import java.util.Set;

import krykra.spring.sfgpetclinic.model.Vet;

/**
 * Created by Krystian Krawczyk on 8/27/2018.
 */
public interface VetService {

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
