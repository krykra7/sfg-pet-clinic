package krykra.spring.sfgpetclinic.services.map;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

import krykra.spring.sfgpetclinic.model.BaseEntity;

/**
 * Created by kk on 8/27/2018.
 */

//Todo: it is possible to make it implements CrudService, implement all methods, and then it is not necessary for all
//Todo: map services to implement CrudService methods, just extend Abstract Map Service - will se further
abstract class AbstractMapService<T extends BaseEntity, ID extends Long> {

    private Map<Long, T> map = new HashMap<>();

    Set<T> findAll() {
        return new HashSet<>(map.values());
    }

    T findById(ID id) {
        return map.get(id);
    }

    T save(T object) {
        if (object != null) {
            object.setId(getNextId());
            map.put(object.getId(), object);
        } else {
            throw new RuntimeException("Object cannot be null");
        }

        return object;
    }

    void delete(T object) {
        map.entrySet().removeIf(idtEntry -> idtEntry.getValue().equals(object));
    }

    void deleteById(ID id) {
        map.remove(id);
    }

    private Long getNextId() {
        Long nextId = null;

        try {
            nextId = Collections.max(map.keySet()) + 1;
        } catch (NoSuchElementException e) {
            nextId = 1L;
        }

        return nextId;
    }
}
