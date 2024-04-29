package com.uis.sisgan.persistence.mapper;


import com.uis.sisgan.persistence.entity.Cattle;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CattleMapper {
    Cattle toCattes(Cattle cattle);

}
