package krykra.spring.sfgpetclinic.services.map;

import java.util.Set;

import krykra.spring.sfgpetclinic.model.Vet;
import krykra.spring.sfgpetclinic.services.VetService;

/**
 * Created by kk on 8/27/2018.
 */
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(), object);
    }
}
