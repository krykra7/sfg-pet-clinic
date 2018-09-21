package krykra.spring.sfgpetclinic.model;

/**
 * Created by kk on 9/21/2018.
 */
public class Speciality extends BaseEntity {

    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
