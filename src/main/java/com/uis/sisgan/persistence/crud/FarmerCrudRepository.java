package com.uis.sisgan.persistence.crud;


import com.uis.sisgan.persistence.entity.Propietary;

import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;


/*

    El Crud Interface Repository se
    Utiliza basicamente como interfaz
    de los metodos mas usados y donde definimos la
    funcion de los quey Methods

 */


/*

    El CrudRepository implementa varios metodos comunes
    que se utilizan en La Aplicacion asi Como:
    FindAll(), delete(), findById().

    Tambien sirve Para hacer Query Methods hay un
    ejemplo en la Interface Cattles.

 */

public interface FarmerCrudRepository extends CrudRepository<Propietary, Integer> {


}
