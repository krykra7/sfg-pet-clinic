package krykra.spring.sfgpetclinic.services.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by kk on 8/27/2018.
 */
abstract class AbstractMapService<T, ID> {

    private Map<ID, T> map = new HashMap<>();

    Set<T> findAll() {
        return new HashSet<>(map.values());
    }

    T findById(ID id) {
        return map.get(id);
    }

    T save(ID id, T object) {
        map.put(id, object);

        return object;
    }

    void delete(T object) {
        map.entrySet().removeIf(idtEntry -> idtEntry.equals(object));
    }

    void deleteById(ID id) {
        map.remove(id);
    }
}
