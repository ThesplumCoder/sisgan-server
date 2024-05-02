package com.uis.sisgan.persistence;

import com.uis.sisgan.persistence.crud.CattleCrudRepository;
import com.uis.sisgan.persistence.entity.Cattle;

import java.util.List;
import java.util.Optional;

public class CattleRepository{

    private CattleCrudRepository cattleCrudRepository;


    /*
        Se llama el Metodo y se configura que es lo que debe hacer
        Asi nos ahorramos muchas lineas de codigo y es eficiente

     */

    public Optional<List<Cattle>> getCattleByWeightAndBreed(float weight, String breed){
      return cattleCrudRepository.findByWeightLessThanAndBreed(weight,breed);
    }
}
