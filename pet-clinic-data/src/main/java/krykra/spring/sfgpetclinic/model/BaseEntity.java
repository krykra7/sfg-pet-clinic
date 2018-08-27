package krykra.spring.sfgpetclinic.model;

import java.io.Serializable;

/**
 * Created by kk on 8/27/2018.
 */
public class BaseEntity implements Serializable {

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
