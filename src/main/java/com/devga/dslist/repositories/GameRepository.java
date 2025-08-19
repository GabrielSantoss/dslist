package com.devga.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devga.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
