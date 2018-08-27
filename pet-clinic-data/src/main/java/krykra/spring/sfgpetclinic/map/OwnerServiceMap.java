package krykra.spring.sfgpetclinic.map;

import java.util.Set;

import krykra.spring.sfgpetclinic.model.Owner;
import krykra.spring.sfgpetclinic.services.CrudService;

/**
 * Created by kk on 8/27/2018.
 */
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements CrudService<Owner, Long> {

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }

    @Override
    public Owner save(Owner object) {
        return super.save(object.getId(), object);
    }
}
