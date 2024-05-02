package com.uis.sisgan.persistence;

import com.uis.sisgan.persistence.crud.FarmerCrudRepository;
import com.uis.sisgan.persistence.entity.Cattle;
import com.uis.sisgan.persistence.entity.Farmer;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


public class FarmerRepository  {

    private FarmerCrudRepository farmerCrudRepository;


    /*
        Aqui se Escriben lo que van a hacer los metodos, como findAll()
        y que retornan. este es el verdadero Repository

     */
    public List<Farmer> getAll(){
        return (List<Farmer>) farmerCrudRepository.findAll();
    }


}