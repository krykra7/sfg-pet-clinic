package krykra.spring.sfgpetclinic.bootstrap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

import krykra.spring.sfgpetclinic.model.Owner;
import krykra.spring.sfgpetclinic.model.Pet;
import krykra.spring.sfgpetclinic.model.PetType;
import krykra.spring.sfgpetclinic.model.Speciality;
import krykra.spring.sfgpetclinic.model.Vet;
import krykra.spring.sfgpetclinic.model.Visit;
import krykra.spring.sfgpetclinic.services.OwnerService;
import krykra.spring.sfgpetclinic.services.PetTypeService;
import krykra.spring.sfgpetclinic.services.SpecialityService;
import krykra.spring.sfgpetclinic.services.VetService;
import krykra.spring.sfgpetclinic.services.VisitService;

/**
 * Created by kk on 8/28/2018.
 */
@Component
public class DataLoader implements CommandLineRunner {

    private final VetService vetService;
    private final OwnerService ownerService;
    private final PetTypeService petTypeService;
    private final SpecialityService specialityService;
    private final VisitService visitService;

    @Autowired
    public DataLoader(VetService vetService, OwnerService ownerService, PetTypeService petTypeService,
                      SpecialityService specialityService, VisitService visitService) {
        this.vetService = vetService;
        this.ownerService = ownerService;
        this.petTypeService = petTypeService;
        this.specialityService = specialityService;
        this.visitService = visitService;
    }

    @Override
    public void run(String... args) throws Exception {
        if (petTypeService.findAll().isEmpty()) {
            loadData();
        }
    }

    private void loadData() {
        PetType dog = new PetType();
        dog.setName("Dog");
        PetType savedDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        cat.setName("Cat");
        PetType savedCatPetType = petTypeService.save(cat);

        Speciality radiology = new Speciality();
        radiology.setDescription("Radiology");
        Speciality savedRadiology = specialityService.save(radiology);

        Speciality surgery = new Speciality();
        surgery.setDescription("Surgery");
        Speciality savedSurgery = specialityService.save(surgery);

        Speciality dentistry = new Speciality();
        dentistry.setDescription("Dentistry");
        Speciality savedDentistry = specialityService.save(dentistry);

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
        owner2.setCity("City2");
        owner2.setTelephone("123456799");

        Pet michalsPet = new Pet();
        michalsPet.setBirthDate(LocalDate.now());
        michalsPet.setPetType(savedCatPetType);
        michalsPet.setName("monika");
        michalsPet.setOwner(owner2);
        owner2.getPets().add(michalsPet);

        ownerService.save(owner2);

        Visit catVisit = new Visit();
        catVisit.setPet(jakubsPet);
        catVisit.setDescription("Sneezy Kitty");

        visitService.save(catVisit);

        System.out.println("Loaded Owners...");

        Vet vet1 = new Vet();
        vet1.setFirstName("Kolorowy");
        vet1.setLastName("Miś");
        vet1.getSpecialities().add(savedRadiology);

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Alan");
        vet2.setLastName("Korcz");
        vet2.getSpecialities().add(savedSurgery);

        vetService.save(vet2);

        System.out.println("Loaded Vets...");
    }
}
