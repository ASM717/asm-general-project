package com.example.asmgeneral.mapper;

import com.example.asmgeneral.model.Pet;
import org.mapstruct.Mapper;
import org.openapitools.api.PetDto;

@Mapper
public interface PetMapper {

    PetDto map(Pet pet);
}
