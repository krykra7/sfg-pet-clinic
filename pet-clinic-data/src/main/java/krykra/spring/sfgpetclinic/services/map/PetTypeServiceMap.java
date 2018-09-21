package krykra.spring.sfgpetclinic.services.map;

import java.util.Set;

import krykra.spring.sfgpetclinic.model.PetType;
import krykra.spring.sfgpetclinic.services.PetTypeService;

/**
 * Created by kk on 9/21/2018.
 */
public class PetTypeServiceMap extends AbstractMapService<PetType, Long> implements PetTypeService {

    @Override
    public PetType findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Set<PetType> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(PetType object) {
        super.delete(object);
    }

    @Override
    public PetType save(PetType object) {
        return super.save(object);
    }
}
