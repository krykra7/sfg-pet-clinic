package krykra.spring.sfgpetclinic.map;

import java.util.Set;

import krykra.spring.sfgpetclinic.model.Pet;
import krykra.spring.sfgpetclinic.services.CrudService;

/**
 * Created by kk on 8/27/2018.
 */
public class PetServiceMap extends AbstractMapService<Pet, Long> implements CrudService<Pet, Long> {

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object.getId(), object);
    }
}