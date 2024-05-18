package com.uis.sisgan.service;
import com.uis.sisgan.persistence.LotRepository;
import com.uis.sisgan.persistence.entity.Lot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LotService {
    // Repositorio utilizado para acceder y gestionar entidades de Lot

    @Autowired
    private LotRepository lotRepository;

    /**
     * Recupera todas las entidades de Lot.
     *
     * @return List<Lot> Una lista de todas las entidades de Lot.
     */
    public List<Lot> getAll() {
        return (List<Lot>) lotRepository.getAll();
    }

    /**
     * Recupera una entidad de Lot por su ID.
     *
     * @param lotId El ID de la entidad de Lot a recuperar.
     * @return Optional<Lot> Un Optional que contiene la entidad de Lot si se encuentra, o vacío si no se encuentra.
     */
    public Optional<Lot> getLot(int lotId) {
        return lotRepository.getLot(lotId);
    }

    /**
     * Guarda una entidad de Lot en el repositorio.
     *
     * @param lot La entidad de Lot a guardar.
     * @return Lot La entidad de Lot guardada.
     */
    public Lot save(Lot lot) {
        return lotRepository.save(lot);
    }

    /**
     * Elimina una entidad de Lot por su ID si existe.
     *
     * @param lotId El ID de la entidad de Lot a eliminar.
     * @return boolean true si la entidad de Lot fue encontrada y eliminada, false en caso contrario.
     */
    public boolean delete(int lotId) {
        return getLot(lotId).map(lot -> {
            lotRepository.delete(lotId);
            return true;
        }).orElse(false);
    }
}
