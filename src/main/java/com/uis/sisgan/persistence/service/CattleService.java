package com.uis.sisgan.persistence.service;

import com.uis.sisgan.persistence.crud.CattleCrudRepository;
import com.uis.sisgan.persistence.entity.Cattle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CattleService {

    @Autowired
    private CattleCrudRepository cattleCrudRepository;

    public List<Cattle> getAll() {
        return (List<Cattle>) cattleCrudRepository.findAll();
    }

    public Optional<Cattle> getCattle(int cattleId) {
        return cattleCrudRepository.findById(cattleId);
    }

    public Cattle save(Cattle cattle) {
        return cattleCrudRepository.save(cattle);
    }

    public void delete(int cattleId) {
        cattleCrudRepository.deleteById(cattleId);
    }

    // Retrieve cattle by weight and breed from the repository.
    public Optional<List<Cattle>> getCattleByWeightAndBreed(float weight, String breed) {
        return cattleCrudRepository.findByWeightLessThanAndBreed(weight, breed);
    }
}
