package com.uis.sisgan.persistence;

import com.uis.sisgan.persistence.entity.Lot;
import com.uis.sisgan.service.LotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

// This class represents a repository for Lot entities.
@Repository
public class LotRepository {

    @Autowired
    private LotService lotService;

    // Retrieve all lots from the repository.
    public List<Lot> getAll(){
        return lotService.getAll();
    }

    // Retrieve a specific lot by its ID from the repository.
    public Optional<Lot> getLot(int lotId){
        return lotService.getLot(lotId);
    }

    // Save a lot to the repository.
    public Lot save(Lot lot){
        return lotService.save(lot);
    }

    // Delete a lot from the repository by its ID.
    public void delete(int lotId){
        lotService.delete(lotId);
    }

}