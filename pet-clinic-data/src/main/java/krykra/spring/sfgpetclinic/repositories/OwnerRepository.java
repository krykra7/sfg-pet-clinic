package krykra.spring.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;

import krykra.spring.sfgpetclinic.model.Owner;

/**
 * Created by kkrawczyk on 20.02.2019.
 */
public interface OwnerRepository extends CrudRepository<Owner, Long> {
}
