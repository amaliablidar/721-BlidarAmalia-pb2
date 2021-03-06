package com.company.repository;

import com.company.model.Produkt;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ProduktRepo implements CrudRepo<Produkt>{
    List<Produkt> produktList = new ArrayList<>();


    @Override
    public Produkt findOne(Long id) {
        return produktList.stream().filter(produkt -> Objects.equals(produkt.getId(), id)).findAny().orElse(null);
    }

    @Override
    public List<Produkt> findAll() {
        return this.produktList;
    }

    @Override
    public Produkt save(Produkt entity) {
        if(this.findOne(entity.getId())==null) {
            this.produktList.add(entity);
            return null;
        }
        return entity;
    }

    @Override
    public Produkt delete(Long id) {
        Produkt foundProdukt=this.findOne(id);
        if(foundProdukt!=null){
            this.produktList.remove(foundProdukt);
        }
        return foundProdukt;
    }

    @Override
    public Produkt update(Produkt entity) {
        for(Produkt produkt:produktList){
            if(Objects.equals(produkt.getId(), entity.getId())){
                produkt.setName(entity.getName());
                produkt.setPreis(entity.getPreis());
                produkt.setSKU(entity.getSKU());
                produkt.setInitialeAnzahl(entity.getInitialeAnzahl());
                return null;
            }
        }
        return entity;
    }
}
