package com.uis.sisgan.service;

import com.uis.sisgan.persistence.InternalMovementRepository;
import com.uis.sisgan.persistence.entity.InternalMovementGuide;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InternalMovementService {

    // Repositorio utilizado para acceder y gestionar entidades de InternalMovementGuide

    @Autowired
    InternalMovementRepository internalMovementRepository;

    /**
     * Recupera todas las guías de movimiento interno.
     *
     * @return List<InternalMovementGuide> Una lista de todas las guías de movimiento interno.
     */
    public List<InternalMovementGuide> getAll() {
        return (List<InternalMovementGuide>) internalMovementRepository.getAll();
    }

    /**
     * Recupera una guía de movimiento interno por su ID.
     *
     * @param internalMovementId El ID de la guía de movimiento interno a recuperar.
     * @return Optional<InternalMovementGuide> Un Optional que contiene la guía de movimiento interno si se encuentra, o vacío si no se encuentra.
     */
    public Optional<InternalMovementGuide> getInternalMovementGuideById(int internalMovementId) {
        return internalMovementRepository.getInternalMovementGuideById(internalMovementId);
    }

    /**
     * Guarda una guía de movimiento interno en el repositorio.
     *
     * @param internalMovementGuide La guía de movimiento interno a guardar.
     * @return InternalMovementGuide La guía de movimiento interno guardada.
     */
    public InternalMovementGuide save(InternalMovementGuide internalMovementGuide) {
        return internalMovementRepository.save(internalMovementGuide);
    }

    /**
     * Elimina una guía de movimiento interno por su ID si existe.
     *
     * @param internalMovementId El ID de la guía de movimiento interno a eliminar.
     * @return boolean true si la guía de movimiento interno fue encontrada y eliminada, false en caso contrario.
     */
    public boolean delete(int internalMovementId) {
        return getInternalMovementGuideById(internalMovementId).map(internalMovementGuide -> {
            internalMovementRepository.delete(internalMovementId);
            return true;
        }).orElse(false);
    }
}
