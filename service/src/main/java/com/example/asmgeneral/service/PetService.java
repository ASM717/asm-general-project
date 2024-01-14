package com.example.asmgeneral.service;

import com.example.asmgeneral.model.Pet;
import com.example.asmgeneral.repository.PetRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PetService {

    private PetRepository petRepository;

    public Optional<Pet> getPet(String id) {
        return petRepository.findById(id);
    }

}
