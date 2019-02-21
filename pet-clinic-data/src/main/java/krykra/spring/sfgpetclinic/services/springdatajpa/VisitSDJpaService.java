package krykra.spring.sfgpetclinic.services.springdatajpa;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

import krykra.spring.sfgpetclinic.model.Visit;
import krykra.spring.sfgpetclinic.repositories.VisitRepository;
import krykra.spring.sfgpetclinic.services.VisitService;

@Service
@Profile("springdatajpa")
public class VisitSDJpaService implements VisitService {

    private final VisitRepository visitRepository;

    public VisitSDJpaService(VisitRepository visitRepository) {
        this.visitRepository = visitRepository;
    }

    @Override
    public Visit findById(Long aLong) {
        return visitRepository.findById(aLong).orElse(null);
    }

    @Override
    public Set<Visit> findAll() {
        Set<Visit> visits = new HashSet<>();
        visitRepository.findAll().iterator().forEachRemaining(visits::add);
        return visits;
    }

    @Override
    public Visit save(Visit object) {
        return visitRepository.save(object);
    }

    @Override
    public void delete(Visit object) {
        visitRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        visitRepository.deleteById(aLong);
    }
}
