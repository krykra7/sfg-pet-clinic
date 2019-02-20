package krykra.spring.sfgpetclinic.services.map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

import krykra.spring.sfgpetclinic.model.Speciality;
import krykra.spring.sfgpetclinic.model.Vet;
import krykra.spring.sfgpetclinic.services.SpecialityService;
import krykra.spring.sfgpetclinic.services.VetService;

/**
 * Created by kk on 8/27/2018.
 */
@Service
public class VetMapService extends AbstractMapService<Vet, Long> implements VetService {

    private final SpecialityService specialityService;

    @Autowired
    public VetMapService(SpecialityService specialityService) {
        this.specialityService = specialityService;
    }

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

        if (object != null) {
            if (!object.getSpecialities().isEmpty()) {
                object.getSpecialities().forEach(speciality -> {
                    if (speciality.getId() == null) {
                        Speciality savedSpeciality = specialityService.save(speciality);
                        speciality.setId(savedSpeciality.getId());
                    }
                });
            }

            return super.save(object);
        } else {
            return null;
        }
    }
}
