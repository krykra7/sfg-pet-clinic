package krykra.spring.sfgpetclinic.model;

/**
 * Created by kk on 8/17/2018.
 */
public class PetType extends BaseEntity {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
