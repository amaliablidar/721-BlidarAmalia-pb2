package com.company.controller;

import com.company.model.Produkt;
import com.company.repository.ProduktRepo;

import java.util.List;

public class ProduktController {

    ProduktRepo produktRepo = new ProduktRepo();
    public List<Produkt> getlist(){
        return produktRepo.findAll();
    }

    public void addprodukt(Produkt produkt){
        produktRepo.save(produkt);
    }

    public void deleteProdukt(Long id){
        Produkt produkt;
        produkt = produktRepo.findOne(id);
        produktRepo.delete(produkt.getId());
    }
    public void updateProdukt(Produkt produkt){
        produktRepo.update(produkt);
    }
}
