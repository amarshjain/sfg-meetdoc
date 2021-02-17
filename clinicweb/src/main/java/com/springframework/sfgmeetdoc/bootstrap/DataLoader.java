package com.springframework.sfgmeetdoc.bootstrap;

import com.springframework.sfgmeetdoc.model.Doc;
import com.springframework.sfgmeetdoc.model.Owner;
import com.springframework.sfgmeetdoc.model.Patient;
import com.springframework.sfgmeetdoc.model.PatientType;
import com.springframework.sfgmeetdoc.services.DocService;
import com.springframework.sfgmeetdoc.services.OwnerService;
import com.springframework.sfgmeetdoc.services.PatientTypeService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final DocService docService;
    private final PatientTypeService patientTypeService;

    public DataLoader(OwnerService ownerService, DocService docService, PatientTypeService patientTypeService) {
        this.ownerService = ownerService;
        this.docService = docService;
        this.patientTypeService = patientTypeService;
    }

    @Override
    public void run(String... args) throws Exception {

        PatientType pwd = new PatientType();
        pwd.setName("PWD");
        PatientType savedPwdType = patientTypeService.save(pwd);

        PatientType diseased = new PatientType();
        diseased.setName("Diseased");
        PatientType savedDiseasedType = patientTypeService.save(diseased);

        Owner owner1 = new Owner();
        owner1.setFirstName("Ghanshyam");
        owner1.setLastName("Das");
        owner1.setAddress("123, Shyam Nagar");
        owner1.setCity("Satna");
        owner1.setTelephone("987652431123");

        Patient robert = new Patient();
        robert.setPatientType(savedPwdType);
        robert.setOwner(owner1);
        robert.setBirthDate(LocalDate.now());
        robert.setName("Robert");
        owner1.getPatients().add(robert);

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Mahila");
        owner2.setLastName("Jaywardhane");
        owner1.setAddress("123, Shyam Nagar");
        owner1.setCity("Satna");
        owner1.setTelephone("987652431123");

        Patient vadra = new Patient();
        vadra.setPatientType(savedDiseasedType);
        vadra.setOwner(owner2);
        vadra.setBirthDate(LocalDate.now());
        vadra.setName("Vadra");
        owner2.getPatients().add(vadra);

        ownerService.save(owner2);

        System.out.println("Loaded Owners...");

        Doc doc1 = new Doc();
        doc1.setFirstName("MaaSaab");
        doc1.setLastName("Mishra");

        docService.save(doc1);

        Doc doc2 = new Doc();
        doc2.setFirstName("Bhamesh");
        doc2.setLastName("Tripathi");

        docService.save(doc2);

        System.out.println("Loaded Doctors...");

    }
}
