package com.uis.sisgan.service;

import com.uis.sisgan.persistence.PropietaryRepository;
import com.uis.sisgan.persistence.entity.Propietary;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Anderson Acuña
 */
@Service
public class PropietaryService {

    @Autowired
    private PropietaryRepository propietaryRepository;

    /**
     * Busca un propietario con el identificador requerido.
     *
     * @param id Identificador del propietario deseado.
     * @return Si existe un propietario con ese identificador lo retorna como
     *         respuesta, sino retorna nulo.
     */
    public Propietary getById(Integer id) {
        Optional<Propietary> result;

        result = propietaryRepository.getById(id);

        if (result.isPresent()) {
            return result.get();
        } else {
            return null;
        }
    }

    /**
     * Gestiona el registro de nuevos propietarios.
     *
     * @param user Propietario nuevo a guardar.
     * @return El propietario que se guardó.
     */
    public Propietary save(Propietary propietary) {
        return propietaryRepository.save(propietary);
    }
}
