package com.example.kunnu.springcrud.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.kunnu.springcrud.model.Characters;


@Repository
public interface SuperHeroCharacterRepository extends JpaRepository<Characters, Integer> {

}
