package com.example.asmgeneral.controller;

import org.openapitools.api.PetDto;
import org.openapitools.api.PetsApi;
import org.springframework.http.ResponseEntity;

public class PetsController implements PetsApi {
    @Override
    public ResponseEntity<PetDto> getPetsId(String petsId) {
        return null;
    }
}
