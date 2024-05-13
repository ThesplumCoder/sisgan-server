package com.uis.sisgan.persistence;

import com.uis.sisgan.persistence.crud.CattleCrudRepository;
import com.uis.sisgan.persistence.entity.Cattle;
import com.uis.sisgan.persistence.service.CattleService;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class CattleRepository {

    private CattleService cattleService;

    /*
        This method calls the corresponding method in the underlying repository interface
        and configures what action to perform.
        This approach saves many lines of code and is efficient.
     */
    public List<Cattle> getAll() {
        return cattleService.getAll();
    }

    public Optional<Cattle> getCattle(int cattleId) {
        return cattleService.getCattle(cattleId);
    }

    public Cattle save(Cattle cattle) {
        return cattleService.save(cattle);
    }

    public void delete(int cattleId) {
        cattleService.delete(cattleId);
    }

    // Retrieve cattle by weight and breed from the repository.
    public Optional<List<Cattle>> getCattleByWeightAndBreed(float weight, String breed) {
        return cattleService.getCattleByWeightAndBreed(weight, breed);
    }
}
