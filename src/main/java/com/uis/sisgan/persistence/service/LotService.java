package com.uis.sisgan.persistence.service;

import com.uis.sisgan.persistence.crud.LotCrudRepository;
import com.uis.sisgan.persistence.entity.Lot;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LotService {

    private LotCrudRepository lotCrudRepository;

    // Retrieve all lots from the repository.
    public List<Lot> getAll(){
        return (List<Lot>) lotCrudRepository.findAll();
    }

    // Retrieve a specific lot by its ID from the repository.
    public Optional<Lot> getLot(int lotId){
        return lotCrudRepository.findById(lotId);
    }

    // Save a lot to the repository.
    public Lot save(Lot lot){
        return lotCrudRepository.save(lot);
    }

    // Delete a lot from the repository by its ID.
    public void delete(int lotId){
        lotCrudRepository.deleteById(lotId);
    }
}
