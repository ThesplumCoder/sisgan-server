package com.uis.sisgan.service;
import com.uis.sisgan.persistence.LotRepository;
import com.uis.sisgan.persistence.entity.Lot;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LotService {

    private LotRepository lotRepository;

    // Retrieve all lots from the repository.
    public List<Lot> getAll(){
        return (List<Lot>) lotRepository.getAll();
    }

    // Retrieve a specific lot by its ID from the repository.
    public Optional<Lot> getLot(int lotId){
        return lotRepository.getLot(lotId);
    }

    // Save a lot to the repository.
    public Lot save(Lot lot){
        return lotRepository.save(lot);
    }

    // Delete a lot from the repository by its ID.
    public void delete(int lotId){
        lotRepository.delete(lotId);
    }
}
