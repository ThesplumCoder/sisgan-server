package com.uis.sisgan.persistence;

import com.uis.sisgan.persistence.crud.CattleCrudRepository;
import com.uis.sisgan.persistence.entity.Cattle;

import java.util.List;
import java.util.Optional;

public class CattleRepository {

    private CattleCrudRepository cattleCrudRepository;

    /*
        This method calls the corresponding method in the underlying repository interface
        and configures what action to perform.
        This approach saves many lines of code and is efficient.
     */
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
