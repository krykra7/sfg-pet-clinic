package krykra.spring.sfgpetclinic.model;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by kk on 8/17/2018.
 */
public class Vet extends Person {

    private Set<Speciality> specialities = new HashSet<>();

    public Set<Speciality> getSpecialities() {
        return specialities;
    }

    public void setSpecialities(Set<Speciality> specialities) {
        this.specialities = specialities;
    }
}
