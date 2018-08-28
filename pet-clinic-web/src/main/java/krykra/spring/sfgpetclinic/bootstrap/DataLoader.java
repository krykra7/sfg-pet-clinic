package krykra.spring.sfgpetclinic.bootstrap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import krykra.spring.sfgpetclinic.model.Owner;
import krykra.spring.sfgpetclinic.model.Vet;
import krykra.spring.sfgpetclinic.services.OwnerService;
import krykra.spring.sfgpetclinic.services.VetService;

/**
 * Created by kk on 8/28/2018.
 */
@Component
public class DataLoader implements CommandLineRunner {

    private VetService vetService;
    private OwnerService ownerService;

    @Autowired
    public DataLoader(VetService vetService, OwnerService ownerService) {
        this.vetService = vetService;
        this.ownerService = ownerService;
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Jakub");
        owner1.setLastName("Kowalski");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Michał");
        owner2.setLastName("Wolski");

        ownerService.save(owner2);

        System.out.println("Loaded Owners...");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Kolorowy");
        vet1.setLastName("Miś");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Alan");
        vet2.setLastName("Korcz");

        vetService.save(vet2);

        System.out.println("Loaded Vets...");
    }
}
