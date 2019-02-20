package krykra.spring.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;

import krykra.spring.sfgpetclinic.model.Visit;

/**
 * Created by kkrawczyk on 20.02.2019.
 */
public interface VisitRepository extends CrudRepository<Visit, Long> {
}
