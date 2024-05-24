package com.uis.sisgan.service;

import com.uis.sisgan.persistence.InternalMovementGuideRepository;
import com.uis.sisgan.persistence.TransporterRepository;
import com.uis.sisgan.persistence.entity.InternalMovementGuide;
import com.uis.sisgan.persistence.entity.Transporter;
import java.nio.file.attribute.UserPrincipalNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InternalMovementGuideService {
    
    @Autowired
    private TransporterRepository transporterRepository;
    
    @Autowired
    private InternalMovementGuideRepository internalMovementGuideRepository;

    /**
     * Recupera todas las guías de movimiento interno que tiene un usuario.
     *
     * @return {@link List} Una lista de todas las guías de movimiento interno.
     */
    public List<InternalMovementGuide> getAllByTransporter(String email) throws UserPrincipalNotFoundException {
        Transporter transporter = transporterRepository.findByEmail(email);
        
        if (transporter == null) {
            throw new UserPrincipalNotFoundException(email);
        }
        
        List<InternalMovementGuide> guides = transporter.getInternalMovementGuides();
        return guides;
    }

    /**
     * Recupera una guía de movimiento interno por su ID.
     *
     * @param internalMovementId El ID de la guía de movimiento interno a
     *                           recuperar.
     * @return {@link Optional} Un Optional que contiene la guía de movimiento
     *         interno si se encuentra, o vacío si no se encuentra.
     */
    public Optional<InternalMovementGuide> getInternalMovementGuideById(Integer internalMovementId) {
        return internalMovementGuideRepository.getInternalMovementGuideById(internalMovementId);
    }

    /**
     * Guarda una guía de movimiento interno en el repositorio.
     *
     * @param internalMovementGuide La guía de movimiento interno a guardar.
     * @return La guía de movimiento interno guardada.
     */
    public InternalMovementGuide save(InternalMovementGuide internalMovementGuide) {
        return internalMovementGuideRepository.save(internalMovementGuide);
    }

    /**
     * Elimina una guía de movimiento interno por su ID si existe.
     *
     * @param internalMovementId El ID de la guía de movimiento interno a
     *                           eliminar.
     * @return boolean true si la guía de movimiento interno fue encontrada y
     *         eliminada, false en caso contrario.
     */
    public boolean delete(Integer internalMovementId) {
        return getInternalMovementGuideById(internalMovementId).map(internalMovementGuide -> {
            internalMovementGuideRepository.delete(internalMovementId);
            return true;
        }).orElse(false);
    }
}
