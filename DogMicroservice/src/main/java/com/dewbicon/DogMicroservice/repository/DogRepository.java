package com.dewbicon.DogMicroservice.repository;

import com.dewbicon.DogMicroservice.entity.Dog;
import org.springframework.data.repository.CrudRepository;

public interface DogRepository extends CrudRepository<Dog, Long> {
}
