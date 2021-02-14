package com.springframework.sfgmeetdoc.bootstrap;

import com.springframework.sfgmeetdoc.model.Doc;
import com.springframework.sfgmeetdoc.model.Owner;
import com.springframework.sfgmeetdoc.services.DocService;
import com.springframework.sfgmeetdoc.services.OwnerService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final DocService docService;

    public DataLoader(OwnerService ownerService, DocService docService) {
        this.ownerService = ownerService;
        this.docService = docService;
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setFirstName("Ghanshyam");
        owner1.setLastName("Das");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Mahila");
        owner2.setLastName("Jaywardhane");

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
