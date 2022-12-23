package mk.finki.ukim.mk.lab.service.impl;

import mk.finki.ukim.mk.lab.model.Manufacturer;
import mk.finki.ukim.mk.lab.repository.ManufacturerRepository;

import java.util.List;

public class ManufacturerServiceImpl {
    public List<Manufacturer> findAll() {
        // metod od manufacturer repository
        return ManufacturerRepository.findAll();

    }
}
