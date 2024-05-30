package com.uis.sisgan.persistence;

import com.uis.sisgan.persistence.entity.Transporter;
import com.uis.sisgan.persistence.crud.TransporterCrudRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Anderson Acuña
 */
@Repository
public class TransporterRepository {

    @Autowired
    private TransporterCrudRepository transporterCrudRepository;

    /**
     * Devuelve el transportador según su identificador numérico.
     *
     * @param id Identificador numérico del usuario transportador.
     * @return Si se encuentra un transportador con ese identificador entonces
     *         se retorna un objeto con sus datos, de lo contrario retorna nulo.
     */
    public Transporter findById(Integer id) {
        Optional<Transporter> transporter = transporterCrudRepository.findById(id);

        if (transporter.isPresent()) {
            return transporter.get();
        } else {
            return null;
        }
    }

    /**
     * Devuelve el transportador que tiene el correo electrónico suministrado.
     *
     * @param id Correo electrónico del usuario transportador.
     * @return Si se encuentra un transportador con ese correo entonces se
     *         retorna un objeto con sus datos, de lo contrario retorna nulo.
     */
    public Transporter findByEmail(String email) {
        Optional<Transporter> transporter = transporterCrudRepository.findByEmail(email);

        if (transporter.isPresent()) {
            return transporter.get();
        } else {
            return null;
        }
    }
}
