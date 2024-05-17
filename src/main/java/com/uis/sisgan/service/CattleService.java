package com.uis.sisgan.service;

import com.uis.sisgan.persistence.CattleRepository;
import com.uis.sisgan.persistence.crud.CattleCrudRepository;
import com.uis.sisgan.persistence.entity.Cattle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CattleService {

    @Autowired
    private CattleRepository cattleRepository;

    public List<Cattle> getAll() {
        return (List<Cattle>) cattleRepository.getAll();
    }

    public Optional<Cattle> getCattle(int cattleId) {
        return cattleRepository.getCattle(cattleId);
    }

    public Cattle save(Cattle cattle) {
        return cattleRepository.save(cattle);
    }

    public boolean delete(int cattleId) {
        return getCattle(cattleId).map(cattle -> {
            cattleRepository.delete(cattleId);
            return true;
        }).orElse(false);
    }

    // Retrieve cattle by weight and breed from the repository.
    public Optional<List<Cattle>> getCattleByWeightAndBreed(float weight, String breed) {
        return cattleRepository.getCattleByWeightAndBreed(weight, breed);
    }
}
