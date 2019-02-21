package krykra.spring.sfgpetclinic.services.map;

import com.sun.xml.internal.bind.v2.model.core.ID;

import org.springframework.stereotype.Service;

import java.util.Set;

import krykra.spring.sfgpetclinic.model.Owner;
import krykra.spring.sfgpetclinic.model.Visit;
import krykra.spring.sfgpetclinic.services.OwnerService;
import krykra.spring.sfgpetclinic.services.VisitService;

@Service
public class VisitMapService extends AbstractMapService<Visit, Long> implements VisitService {

    @Override
    public Visit findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Set<Visit> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public Visit save(Visit visit) {
        if (visit.getPet() == null || visit.getPet().getOwner() == null || visit.getPet().getId() == null) {
            throw new RuntimeException("Invalid Visit");
        }

        return super.save(visit);
    }

    @Override
    public void delete(Visit object) {
        super.delete(object);
    }
}
