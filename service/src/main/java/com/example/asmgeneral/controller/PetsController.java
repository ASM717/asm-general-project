package com.example.asmgeneral.controller;

import com.example.asmgeneral.mapper.PetMapper;
import com.example.asmgeneral.model.Pet;
import com.example.asmgeneral.service.PetService;
import lombok.RequiredArgsConstructor;
import org.openapitools.api.PetDto;
import org.openapitools.api.PetsApi;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class PetsController implements PetsApi {

    private PetService petService;
    private PetMapper petMapper;
    @Override
    public ResponseEntity<PetDto> getPet(String petId) {

        Optional<Pet> optional = petService.getPet(petId);

        if (optional.isEmpty()) {
            return ResponseEntity.notFound().build();
        }

        PetDto petDto = petMapper.map(optional.get());

        return ResponseEntity.ok(petDto);
    }
}
