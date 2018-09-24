package krykra.spring.sfgpetclinic.bootstrap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

import krykra.spring.sfgpetclinic.model.Owner;
import krykra.spring.sfgpetclinic.model.Pet;
import krykra.spring.sfgpetclinic.model.PetType;
import krykra.spring.sfgpetclinic.model.Vet;
import krykra.spring.sfgpetclinic.services.OwnerService;
import krykra.spring.sfgpetclinic.services.PetTypeService;
import krykra.spring.sfgpetclinic.services.VetService;

/**
 * Created by kk on 8/28/2018.
 */
@Component
public class DataLoader implements CommandLineRunner {

    private VetService vetService;
    private OwnerService ownerService;
    private PetTypeService petTypeService;

    @Autowired
    public DataLoader(VetService vetService, OwnerService ownerService, PetTypeService petTypeService) {
        this.vetService = vetService;
        this.ownerService = ownerService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {
        PetType dog = new PetType();
        dog.setName("Dog");

        PetType savedDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        cat.setName("Cat");

        PetType savedCatPetType = petTypeService.save(cat);

        Owner owner1 = new Owner();
        owner1.setFirstName("Jakub");
        owner1.setLastName("Kowalski");
        owner1.setAddress("Adres");
        owner1.setCity("City");
        owner1.setTelephone("123456789");

        Pet jakubsPet = new Pet();
        jakubsPet.setBirthDate(LocalDate.now());
        jakubsPet.setPetType(savedDogPetType);
        jakubsPet.setName("Maciuś");
        jakubsPet.setOwner(owner1);
        owner1.getPets().add(jakubsPet);

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Michał");
        owner2.setLastName("Wolski");
        owner2.setAddress("Adres");
        owner2.setCity("City");
        owner2.setTelephone("123456789");

        Pet michalsPet = new Pet();
        michalsPet.setBirthDate(LocalDate.now());
        michalsPet.setPetType(savedCatPetType);
        michalsPet.setName("monika");
        michalsPet.setOwner(owner2);
        owner2.getPets().add(michalsPet);

        ownerService.save(owner2);

        System.out.println("Loaded Owners...");

        Vet vet1 = new Vet();
        vet1.setFirstName("Kolorowy");
        vet1.setLastName("Miś");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Alan");
        vet2.setLastName("Korcz");

        vetService.save(vet2);

        System.out.println("Loaded Vets...");
    }
}
