package com.uis.sisgan.persistence.entity;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

/**
 *
 * @author anderson
 */
@Entity
@DiscriminatorValue("IcaOfficial")
public class IcaOfficial extends User {
    
    @Column(name = "id_card_ica")
    private Integer idCardIca;
}
