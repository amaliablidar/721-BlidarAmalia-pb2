package com.company.repository;

import com.company.model.Produkt;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class ProduktRepoTest {
    ProduktRepo produktRepo;
    Produkt produkt1;
    Produkt produkt2;

    @BeforeEach
    void setup(){
        produktRepo = new ProduktRepo();
        produkt1=new Produkt(1L,"ProduktA",12.99,"AEB1",4);
        produkt2=new Produkt(2L,"ProduktB",13.99,"Ab1s",7);
        produktRepo.save(produkt1);
        produktRepo.save(produkt2);
    }

    @org.junit.jupiter.api.Test
    void findOne() {
        Produkt produkttest = produktRepo.findOne(1L);
        assertEquals("ProduktA", produkttest.getName());
    }


    @org.junit.jupiter.api.Test
    void save() {
        int length = produktRepo.findAll().size();
       Produkt produkt3=new Produkt(3L,"ProduktC",14.99,"Ab1s",7);
       produktRepo.save(produkt3);
       assertEquals(length+1, produktRepo.findAll().size());

    }

    @org.junit.jupiter.api.Test
    void delete() {
    }

    @org.junit.jupiter.api.Test
    void update() {
    }
}