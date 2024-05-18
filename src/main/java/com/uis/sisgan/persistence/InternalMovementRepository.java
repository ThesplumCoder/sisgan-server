package com.uis.sisgan.persistence;

import com.uis.sisgan.persistence.crud.InternalMovementCrudRepository;
import com.uis.sisgan.persistence.entity.InternalMovementGuide;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public class InternalMovementRepository {


    // Repositorio CRUD utilizado para acceder y gestionar entidades de InternalMovementGuide
    @Autowired
    private InternalMovementCrudRepository internalMovementCrudRepository;

    /**
     * Recupera todas las entidades de InternalMovementGuide.
     *
     * @return List<InternalMovementGuide> Una lista de todas las entidades de InternalMovementGuide.
     */
    public List<InternalMovementGuide> getAll() {
        return (List<InternalMovementGuide>) internalMovementCrudRepository.findAll();
    }

    /**
     * Recupera una entidad de InternalMovementGuide por su ID.
     *
     * @param internalMovementId El ID de la entidad de InternalMovementGuide a recuperar.
     * @return Optional<InternalMovementGuide> Un Optional que contiene la entidad de InternalMovementGuide si se encuentra, o vacío si no se encuentra.
     */
    public Optional<InternalMovementGuide> getInternalMovementGuideById(int internalMovementId) {
        return internalMovementCrudRepository.findById(internalMovementId);
    }

    /**
     * Guarda una entidad de InternalMovementGuide en el repositorio.
     *
     * @param internalMovementGuide La entidad de InternalMovementGuide a guardar.
     * @return InternalMovementGuide La entidad de InternalMovementGuide guardada.
     */
    public InternalMovementGuide save(InternalMovementGuide internalMovementGuide) {
        return internalMovementCrudRepository.save(internalMovementGuide);
    }

    /**
     * Elimina una entidad de InternalMovementGuide por su ID.
     *
     * @param internalMovementId El ID de la entidad de InternalMovementGuide a eliminar.
     */
    public void delete(int internalMovementId) {

        internalMovementCrudRepository.deleteById(internalMovementId);
    }
}
