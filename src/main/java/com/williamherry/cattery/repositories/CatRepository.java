package com.williamherry.cattery.repositories;

import org.springframework.data.repository.CrudRepository;

import com.williamherry.cattery.models.Cat;


// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface CatRepository extends CrudRepository<Cat, Integer> {

}