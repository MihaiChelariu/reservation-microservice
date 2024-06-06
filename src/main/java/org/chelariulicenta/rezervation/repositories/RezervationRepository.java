package org.chelariulicenta.rezervation.repositories;

import org.chelariulicenta.rezervation.model.Rezervation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RezervationRepository extends JpaRepository<Rezervation, Integer>{
    List<Rezervation> findAllByIdUser(Integer id);
}
