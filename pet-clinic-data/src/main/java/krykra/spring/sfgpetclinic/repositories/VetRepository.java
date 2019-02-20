package krykra.spring.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;

import krykra.spring.sfgpetclinic.model.Vet;

/**
 * Created by kkrawczyk on 20.02.2019.
 */
public interface VetRepository extends CrudRepository<Vet, Long> {
}
