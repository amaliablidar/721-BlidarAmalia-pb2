package com.company.repository;

import com.company.model.Produkt;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Lageraktualisierung implements CrudRepo<Map<Produkt,Integer>>{
    Date datum;
    Map<Produkt, Integer> lagerakt = new HashMap<>();


    @Override
    public Map<Produkt, Integer> findOne(Long id) {
        return null;
    }

    @Override
    public List<Map<Produkt, Integer>> findAll() {
        return null;
    }

    @Override
    public Map<Produkt, Integer> save(Map<Produkt, Integer> entity) {
        return null;
    }

    @Override
    public Map<Produkt, Integer> delete(Long id) {
        return null;
    }

    @Override
    public Map<Produkt, Integer> update(Map<Produkt, Integer> entity) {
        return null;
    }
}
